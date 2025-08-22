package factory;

import config.ShapeConfig;
import shapes.Shape;
import shapes.Triangulo;

import java.util.Scanner;

public class TrianguloFactory implements ShapeFactory{
    @Override
    public Shape createShapePadrao(ShapeConfig shapeConfigPadrao) {
        return new Triangulo(shapeConfigPadrao);
    }

    @Override
    public Shape createShapeCustom(ShapeConfig shapeConfig) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura customizada : ");
        int altura = input.nextInt();

        System.out.println("Digite o caractere customizado : ");
        char caractere = input.next().charAt(0);

        shapeConfig.setAltura(altura);
        shapeConfig.setCaractere(caractere);

        return new Triangulo(shapeConfig);
    }
}
