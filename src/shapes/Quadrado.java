package shapes;

import config.ShapeConfig;

public class Quadrado implements Shape{
    private ShapeConfig shapeConfig;

    public Quadrado(ShapeConfig shapeConfig) {
        this.shapeConfig = shapeConfig;
    }

    @Override
    public void imprimirShape() {
        // Validação: altura deve ser maior que 0
        if (shapeConfig.getAltura() <= 0) {
            System.out.println("A altura deve ser maior que 0.");
            return;
        }

        // Loop externo para as linhas
        for (int i = 0; i < shapeConfig.getAltura(); i++) {
            // Loop interno para as colunas
            for (int j = 0; j < shapeConfig.getAltura(); j++) {
                // Imprime um asterisco sem quebrar a linha
                System.out.print(shapeConfig.getCaractere()+" ");
            }
            // Quebra a linha após cada linha do quadrado
            System.out.println();
        }
    }
}
