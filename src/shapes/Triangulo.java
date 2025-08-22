package shapes;

import config.ShapeConfig;

public class Triangulo implements Shape{
    private ShapeConfig shapeConfig;

    public Triangulo(ShapeConfig shapeConfig) {
        this.shapeConfig = shapeConfig;
    }

    @Override
    public void imprimirShape() {
        // Validação: altura deve ser maior que 0
        if (this.shapeConfig.getAltura() <= 0) {
            System.out.println("A altura deve ser maior que 0.");
            return;
        }

        // Loop para cada linha do triângulo
        for (int i = 1; i <= this.shapeConfig.getAltura(); i++) {
            // Imprimir espaços para alinhar o triângulo
            for (int j = 1; j <= this.shapeConfig.getAltura() - i; j++) {
                System.out.print(" ");
            }
            // Imprimir os caracteres
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(this.shapeConfig.getCaractere());
            }
            // Quebra de linha após cada linha do triângulo
            System.out.println();
        }
    }
}
