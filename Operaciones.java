// Clase base que encapsula dos números
public class Operaciones {
    private double num1; // Primer número
    private double num2; // Segundo número

    // Getter para el primer número
    public double getNum1() {
        return num1;
    }

    // Setter para el primer número
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Getter para el segundo número
    public double getNum2() {
        return num2;
    }

    // Setter para el segundo número
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Método toString para mostrar los valores de los números
    @Override
    public String toString() {
        return "Operaciones{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
