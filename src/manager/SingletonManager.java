package manager;

import config.ShapeConfig;
import factory.QuadradoFactory;
import factory.ShapeFactory;
import factory.TrianguloFactory;
import factory.XFactory;
import shapes.Shape;

import java.util.Scanner;


public final class SingletonManager {
    private static SingletonManager instancia;
    private ShapeConfig shapeConfigPadrao;

    public SingletonManager(int alturaPadrao, char caracterePadrao) {
        this.shapeConfigPadrao = new ShapeConfig(alturaPadrao, caracterePadrao);
    }

    public static SingletonManager getInstancia() {
        if (instancia == null) {
            Scanner input = new Scanner(System.in);

            System.out.println("Selecione uma altura padrão: ");
            int altura = input.nextInt();

            System.out.println("Selecione um caractere padrão: ");
            char caractere = input.next().charAt(0);

            instancia = new SingletonManager(altura,caractere);
        }
        return instancia;
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            Shape shape;
            ShapeFactory shapeFactory;

            System.out.println("Selecione um formato : 1-Quadrado, 2-Triangulo, 3-X");
            int formato = input.nextInt();

            if (formato==1)
                shapeFactory = new QuadradoFactory();
            else if (formato==2)
                shapeFactory = new TrianguloFactory();
            else if (formato==3)
                shapeFactory = new XFactory();
            else {
                System.out.println("Por favor selecione uma opção disponível");
                continue;
            }

            System.out.println("Selecione uma configuração : 1-Padrão, 2-Customizada");
            int configuracao = input.nextInt();

            if (configuracao==1)
                shape = shapeFactory.createShapePadrao(shapeConfigPadrao);
            else if (configuracao==2)
                shape = shapeFactory.createShapeCustom(shapeConfigPadrao.clone());
            else {
                System.out.println("Por favor selecione uma opção disponível");
                continue;
            }

            shape.imprimirShape();

            System.out.println("Selecione : 0- Sair , 1- Continuar");
            int resposta = input.nextInt();

            if (resposta==0)
                continuar = false;
            else if (resposta==1)
                System.out.println("Criando nova figura");
            else
                System.out.println("Por favor selecione uma opção disponível");

        }
    }
}
