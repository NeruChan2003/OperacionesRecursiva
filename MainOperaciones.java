
//Se importa la libreria scanner.
import java.util.Scanner;

//Se define la clase
public class MainOperaciones {
    //
    public static void main(String[] args) {
        // Se construye el scanner
        Scanner opera = new Scanner(System.in);
        // Esta línea crea un objeto Scanner llamado opera, que se utiliza para leer la
        // entrada del usuario desde la consola.
        boolean continuar = true;
        // Se inicia el bucle do while
        do {
            // Este es el inicio de un bucle do-while, que ejecutará el bloque de código
            // dentro de él al menos una vez y luego continuará mientras la condición dentro
            // del while sea verdadera.
            System.out.println("Ingrese el primer número:");
            // Imprime un mensaje solicitando al usuario que ingrese el primer número.

            double num1 = opera.nextDouble();

            System.out.println("Ingrese el segundo número:");
            // Imprime un mensaje solicitando al usuario que ingrese el segundo número.
            double num2 = opera.nextDouble();
            // Se imprime el mensaje en pantalla al usario
            System.out.println("Ingrese la operación a realizar (suma, resta, multiplicación, división):");
            // Imprime un mensaje solicitando al usuario que ingrese el segundo número.
            String operacion = opera.next();
            // Se crea el objeto.
            Operaciones operaciones = new Operaciones();
            // Crea un objeto de la clase Operaciones, que se utilizará para almacenar los
            // números ingresados.
            operaciones.setNum1(num1);
            operaciones.setNum2(num2);
            // Establece los valores de num1 y num2 en el objeto operaciones utilizando
            // métodos de configuración.
            double resultado = 0.0;
            // Declara una variable para almacenar el resultado de la operación.
            switch (operacion) {
                // En el caso de que la operación sea "suma", ejecuta el siguiente bloque de
                // código.
                case "suma":
                    // Crea un objeto de la clase Suma, que se utiliza para realizar la suma.
                    Suma suma = new Suma();
                    suma.setNum1(num1);
                    suma.setNum2(num2);
                    // Llama al método sumar() del objeto suma para realizar la suma y guarda el
                    // resultado en la variable resultado.
                    resultado = suma.sumar();
                    break;
                // Crea un objeto de la clase multiplicacion, que se utiliza para realizar la
                // resta.
                case "resta":
                    Resta resta = new Resta();
                    resta.setNum1(num1);
                    resta.setNum2(num2);
                    // Llama al método restar() del objeto suma para realizar la suma y guarda el
                    // resultado en la variable resultado.
                    resultado = resta.restar();
                    break;
                // Crea un objeto de la clase multiplicacion, que se utiliza para realizar la
                // multiplicacion
                case "multiplicación":
                    Multiplicacion multiplicacion = new Multiplicacion();
                    multiplicacion.setNum1(num1);
                    multiplicacion.setNum2(num2);
                    // Llama al método sumar() del objeto suma para realizar la suma y guarda el
                    // resultado en la variable resultado.
                    resultado = multiplicacion.multiplicar();
                    break;
                // Crea un objeto de la clase division, que se utiliza para realizar la division
                case "división":
                    Division division = new Division();
                    division.setNum1(num1);
                    division.setNum2(num2);
                    // Llama al método sumar() del objeto suma para realizar la suma y guarda el
                    // resultado en la variable resultado.
                    resultado = division.dividir();
                    break;
                // En el caso de que la operación sea "salir", ejecuta el siguiente bloque de
                // código.
                case "salir":
                    continuar = false;
                    // Sale del bloque switch.
                    break;
                // En el caso de que la operación no coincida con ninguno de los casos
                // anteriores, ejecuta el siguiente bloque de código.
                default:
                    System.out.println("Operación no válida.");
                    break;
                // Cierra el bloque switch.
            }
            // Comprueba si la operación no es "salir". Si es verdad, ejecuta el siguiente
            // bloque de código.

            if (!operacion.equals("salir")) {
                // Imprime el resultado de la operación realizada.
                System.out.println("Resultado de la operación " + operacion + ": " + resultado);
                // Cierra el bloque if.
            }
            // Cierra el bucle do-while. Se repetirá mientras la variable continuar sea
            // true.

        } while (continuar);
        // Cierra el objeto Scanner para liberar recursos.

        opera.close();
        // Imprime un mensaje de despedida cuando el programa termina.

        System.out.println("¡Hasta luego!");
    }
}