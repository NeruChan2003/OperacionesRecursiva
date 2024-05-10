// Clase que hereda de Operaciones y realiza la operación de multiplicación
public class Multiplicacion extends Operaciones {
    // Método para realizar la multiplicación
    public double multiplicar() {
        return getNum1() * getNum2();
    }

    // Método toString para mostrar los valores de los números en una multiplicación
    @Override
    public String toString() {
        return "Multiplicacion{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}
