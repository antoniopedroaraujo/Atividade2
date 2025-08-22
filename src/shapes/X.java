package shapes;

import config.ShapeConfig;

public class X implements Shape {
    private ShapeConfig shapeConfig;

    public X(ShapeConfig shapeConfig) {
        this.shapeConfig = shapeConfig;
    }

    @Override
    public void imprimirShape() {
        // Validação: altura deve ser ímpar e >= 3
        if (shapeConfig.getAltura() < 3 || shapeConfig.getAltura() % 2 == 0) {
            System.out.println("ATENÇÃO: Para criar um X, a altura deve ser um número ímpar maior ou igual a 3.");
            return;
        }

        // Loop para construir o "X"
        for (int i = 0; i < shapeConfig.getAltura(); i++) {
            for (int j = 0; j < shapeConfig.getAltura(); j++) {
                // Condição para imprimir os braços do "X"
                if (j == i || j == shapeConfig.getAltura() - i - 1) {
                    System.out.print(shapeConfig.getCaractere());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Nova linha após cada linha do "X"
        }
    }
}
