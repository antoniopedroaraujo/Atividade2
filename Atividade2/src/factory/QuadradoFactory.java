package factory;

import config.ShapeConfig;
import shapes.Quadrado;
import shapes.Shape;

import java.util.Scanner;

public class QuadradoFactory implements ShapeFactory{
    @Override
    public Shape createShapePadrao(ShapeConfig shapeConfigPadrao) {
        return new Quadrado(shapeConfigPadrao);
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

        return new Quadrado(shapeConfig);
    }
}
