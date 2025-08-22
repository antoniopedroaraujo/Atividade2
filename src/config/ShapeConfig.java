package config;

public class ShapeConfig implements Cloneable{

    private int altura;
    private char caractere;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public ShapeConfig(int altura, char caractere) {
        this.altura = altura;
        this.caractere = caractere;
    }

    @Override
    public ShapeConfig clone() {
        try {
            ShapeConfig clone = (ShapeConfig) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
