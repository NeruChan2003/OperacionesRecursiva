// Clase que hereda de Operaciones y realiza la operación de división
public class Division extends Operaciones {
    // Método para realizar la división
    public double dividir() {
        if (getNum2() != 0) {
            return getNum1() / getNum2();
        } else {
            System.out.println("Error: división por cero.");
            return Double.NaN;
        }
    }

    // Método toString para mostrar los valores de los números en una división
    @Override
    public String toString() {
        return "Division{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}
