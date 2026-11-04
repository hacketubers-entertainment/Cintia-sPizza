import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        String tipoPedido = tipoPedido();
        mostrarMenu();

        mostrarTicket(nombreCliente, tipoPedido);

        sc.close();
    }

    static void mostrarMenu() {
        //
    }

    static String tipoPedido() {
        String tipoPedido = "";
        boolean invalido = false;
        do {
            print("Selecciona tu tipo de pedido: ");
            print("[L]: Para llevar ");
            print("[C]: Para comer aqui ");
            tipoPedido = sc.next();
            switch (tipoPedido) {
                case "l":
                case "L":
                    return tipoPedido = "Para llevar";
                case "c":
                case "C":
                    return tipoPedido = "Para comer aqui";
                default:
                    print("Seleccione una opcion valida");
                    invalido = true;
            }
        } while (invalido);
        return tipoPedido;
    }

    static void diaSemana() {
        //
    }

    // -----------------------------------------APARTADO DE SELECCION DE PIZZA +
    // TAMANIO MAS LA ESPECIALIDAD
    static String nombrePizza, tamanio, esp;
    static String elegirPizza() {
        boolean invalido;
        do {
            invalido = false;
            print("Elije el numero de la pizza: ");
            print("1. Pizza de queso");
            print("2. Pizza de pepperoni");
            print("3. Pizza Hawaiana");
            print("4. Pizza Mexicana");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nombrePizza = "Pizza de queso";
                    break;
                case 2:
                    nombrePizza = "Pizza de pepperoni";
                    break;
                case 3:
                    nombrePizza = "Pizza Hawaiana";
                    break;
                case 4:
                    nombrePizza = "Pizza Mexicana";
                    break;
                default:
                    print("Opcion invalida, intenta de nuevo");
                    invalido = true;
            }
        } while (invalido);

        return nombrePizza;
    }

    static double tamanioPizza() {
        double precioTamanio = 0;
        boolean invalido;
        do {
            invalido = false;
            print("Que medida de pizza, selecciona el numero");
            print("1. Familiar ($300)");
            print("2. Grande ($250)");
            print("3. Mediano ($200)");
            print("4. Chico ($150)");
            int opcionTamanioPizza = sc.nextInt();

            switch (opcionTamanioPizza) {
                case 1:
                    tamanio = "familiar";
                    precioTamanio = 300;
                    break;
                case 2:
                    tamanio = "grande";
                    precioTamanio = 250;
                    break;
                case 3:
                    tamanio = "mediano";
                    precioTamanio = 200;
                    break;
                case 4:
                    tamanio = "chico";
                    precioTamanio = 150;
                    break;
                default:
                    print("Opcion invalida, intenta de nuevo");
                    invalido = true;
            }
        } while (invalido);

        return precioTamanio;
    }

    static double especialidad() {
        double precioEsp = 0;
        boolean invalido;
        do {
            invalido = false;
            print("Selecciona la especialidad: ");
            print("1. Orilla rellena de queso ($30)");
            print("2. Extra queso ($25)");
            print("3. Sin especialidad ($0)");
            int opcionEsp = sc.nextInt();

            switch (opcionEsp) {
                case 1:
                    esp = "Orilla rellena de queso";
                    precioEsp = 30;
                    break;
                case 2:
                    esp = "Extra queso";
                    precioEsp = 25;
                    break;
                case 3:
                    esp = "Sin especialidad";
                    precioEsp = 0;
                    break;
                default:
                    print("Opcion invalida, intenta de nuevo");
                    invalido = true;
            }
        } while (invalido);

        return precioEsp;
    }

    static void elegirBebida() {
        //
    }

    static void saborBebida() {
        //
    }

    static void tamanioBebida() {
        //
    }

    static void complementos() {
        //
    }

    static void elegirMetodoPago() {
        //
    }

    static void calcularTotal() {
        //
    }

    static void mostrarTicket(String nombreCliente, String tipoPedido) {
        print("=========================================");
        print("             CINTHIA'S PIZZA             ");
        print("            TICKET DE COMPRA             ");
        print("=========================================");
        print("Cliente: " + nombreCliente);
        print("Tipo: " + tipoPedido);
        print("Día: Lunes (Promocion del 30% aplicada)");
        print("Fecha: 28/09/2026");
        print("=========================================");
        print("CANT.  DESCRIPCIÓN               PRECIO");
        print("=========================================");
        print(" 1     Pizza Grande Pepperoni    $180.00");
        print(" 1     Refr. Coca-Cola Grande     $45.00");
        print(" 1     Extra Queso                $25.50");
        print("=========================================");
        print("SUBTOTAL:                         $250.50");
        print("DESCUENTO APLICADO                -$75.15");
        print("IVA (16%)                          $28.06");
        print("");
        print("TOTAL A PAGAR:                    $203.41");
        print("");
        print("Pago en Tarjeta:                  $500.00");
        print("Cambio:                           $296.59");
        print("=========================================");
        print("   ¡Gracias por su compra en Cinthia's!  ");
        print("=========================================");
    }

    static void print(String texto) {
        System.out.println(texto);
    }
}