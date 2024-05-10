// Clase que hereda de Operaciones y realiza la operación de resta
public class Resta extends Operaciones {
    // Método para realizar la resta
    public double restar() {
        return getNum1() - getNum2();
    }

    // Método toString para mostrar los valores de los números en una resta
    @Override
    public String toString() {
        return "Resta{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }
}
