import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. 1 ¿Cuál será el resultado de la siguiente operación?");
            System.out.println("2. 2 Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?");
            System.out.println("3. 3 ¿Qué valor se imprimirá?");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuál será el resultado de la siguiente operación?");
                    int x1 = (int) 5.89 + (int) 3.45;
                    System.out.println(x1); // 8
                    break;
                case 2:
                    System.out.println("Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?");
                    char c = 'A';
                    float myA = (int) c;
                    System.out.println("El valor ASCII de " + c + "es: " + myA);

                    break;
                case 3:
                    System.out.println("¿Qué valor se imprimirá?");
                    double d = 100.04;
                    long l = (long)d;
                    int i = (int)l;
                    System.out.println(i);
                    break;
                case 4:
                    System.out.println("Escribe código para convertir un String que contiene un número a un int.?");
                    String numCadena = "1234";
                    int numEntero = Integer.parseInt(numCadena);
                    System.out.println("El número entero es: " + numEntero);
                    break;
                case 5:
                    System.out.println("¿Cuál es el resultado de (int) (char) (byte) -1?");
                    float resultado = (int) (char) (byte) -1;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 6:
                    System.out.println("Convierte el número 65 a un char. ¿Qué carácter obtienes?");
                    int numero = 65;
                    char caracter = (char) numero;
                    System.out.println("El carácter es: " + caracter);
                    break;
                case 7:
                    System.out.println("¿Qué sucede si intentas asignar un long a un int sin casteo explícito?");
                    long valorLong = 123456789L;
                    try {
                        int valorInt = Math.toIntExact(valorLong);
                        System.out.println("El valor int es: " + valorInt);
                    } catch (ArithmeticException e) {
                        System.out.println("El valor long no puede convertirse a int sin desbordamiento.");
                    }
                    break;
                case 8:
                    System.out.println("Escribe código para convertir un float a un String.");
                    float num = 1.2345678f;
                    String resultadoNum = Float.toString(num);
                    System.out.println(resultadoNum);// El resultado es: "1.2345678"
                    break;
                case 9:
                    System.out.println("¿Cuál es el resultado de (int) Math.round(3.7)?");
                    int resultadoI = (int) Math.round(3.7);
                    System.out.println("El resultado es: " + resultadoI); // Imprime 4
                    break;
                case 10:
                    System.out.println("Dado byte b = 50;, ¿cómo lo convertirías a short?");
                    byte b = 50;
                    int s = (short) b;
                    System.out.println(s);
                    break;

                case 11:
                    System.out.println("¿Cuál es el valor de x después de la siguiente operación?");
                    int x2 = 10;
                    x2 += 5;
                    System.out.println(x2);
                    break;

                case 12:
                    System.out.println("Simplifica la siguiente expresión usando un operador de asignación compuesta:\n" +
                            "y = y * (x + 5);");
                    int y = scanner.nextInt();
                    int x = scanner.nextInt();
                    y  *=  (x + 5);
                    System.out.println(y);
                    break;

                case 13:
                    System.out.println("¿Cuál es el valor de a después de estas operaciones?\n" +
                            "int a = 15; a %= 4;");
                    int a = 15;
                    a %= 4;
                    System.out.println(a);
                    break;

                case 14:
                    System.out.println("Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.");
                    double x14 = scanner.nextInt();
                    double y14 = scanner.nextInt();
                    x14 = x14 + y14;
                    System.out.println(x14);
                    break;

                case 15:
                    System.out.println("¿Qué hace la siguiente operación? x ^= 2;");
                    int x15 = scanner.nextInt();
                    x15 ^= 2;
                    System.out.println("Devuelve el cuadrado del numero ingresado: " + x15);


                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}