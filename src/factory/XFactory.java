package factory;

import config.ShapeConfig;
import shapes.Shape;
import shapes.X;

import java.util.Scanner;

public class XFactory implements ShapeFactory{
    @Override
    public Shape createShapePadrao(ShapeConfig shapeConfigPadrao) {
        return new X(shapeConfigPadrao);
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

        return new X(shapeConfig);
    }
}
