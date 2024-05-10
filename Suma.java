// Clase que hereda de Operaciones y realiza la operación de suma
public class Suma extends Operaciones {
    // Método para realizar la suma
    public double sumar() {
        return getNum1() + getNum2();
    }

    // Método toString para mostrar los valores de los números en una suma
    @Override
    public String toString() {
        return "Suma{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}
