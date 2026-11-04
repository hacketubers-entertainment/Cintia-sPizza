import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
        print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        String tipoPedido = tipoPedido();
        int diaSemana = diaSemana();

        String sabor = saborBebida();
        String tamanio = tamanioBebida();
        String complementos = complementos();

        double precioBebida = obtenerPrecioBebida(tamanio);
        double precioComplemento = obtenerPrecioComplemento(complementos);

        mostrarTicket(nombreCliente, tipoPedido, sabor, tamanio, complementos, 
        precioBebida, precioComplemento);
        
        sc.close();
    }

    static void mostrarMenu(){
        print("===================================================");
        print("             CINTIAS'S PIZZA              ");
        print("===================================================");
        print("Seleccione una opción:");
        print("[D] Descuentos y Promociones ");
        print("[CUALQUIER LETRA] Registrar Pedido");
        print("===================================================");
        print("Seleccione una opcion: ");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "D":
                case "d":
                    print("===================================================");
                    print("                PROMOCIONES Y DESCUENTOS           ");
                    print("===================================================");
                    print("Combo Lunes: 30% de Descuento en Pizzas.");
                    print("");
                    print("");
                break;
            default:
                break;
        }
    }

    static String tipoPedido() {
        String tipoPedido = "";
        boolean invalido = false;
        do {
            print("Selecciona tu tipo de pedido: ");
            print("[L]: Para llevar ");
            print("[C]: Para comer aquí ");
            tipoPedido = sc.nextLine();
            switch (tipoPedido.toUpperCase()) {
                case "L":
                    return tipoPedido = "Para llevar";
                case "C":
                    return tipoPedido = "Para comer aqui";
                default:
                    print("Seleccione una opcion valida");
                    invalido = true;
            }
        } while (invalido);
        return "tipoPedido";
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

    static int diaSemana(){
        int diaSemana ;
        boolean invalido = false;
        do {
            print("Dia de la semana: ");
            print("[1]: Lunes");
            print("[2]: Martes");
            print("[3]: Miercoles");
            print("[4]: Jueves");
            print("[5]: Viernes");
            print("[6]: Sabado");
            print("[7]: Domingo");
            print("Ingrese el dia de la semana de 1-7");
            diaSemana = sc.nextInt();
            invalido = (diaSemana > 0 || diaSemana < 8) ? false : true;
        } while (invalido);
        return diaSemana;
    }

    // ---- FUNCIÓN ----
    static void elegirBebida(){
        print("Elija el sabor de su bebida:");
        String elegirBebida = sc.nextLine();
    }

    // ---- FUNCIÓN ----
    static String saborBebida() {
        do {
            print("[C]: Coca-Cola");
            print("[P]: Pepsi");
            print("[M]: Mundet");
            print("[S]: Squirt");
            print("Opción: ");
            String saborBebida = sc.nextLine();
            switch (saborBebida.toUpperCase()) {
                case "C":
                    return saborBebida = "Coca-Cola";
                case "P":
                    return saborBebida = "Pepsi";
                case "M":
                    return saborBebida = "Mundet";
                case "S":
                    return saborBebida = "Squirt";
                default:
                    print("Seleccionaste una opción inválida");    
            } 
        } while (true);
    }

    // ---- FUNCIÓN ----
    static String tamanioBebida() {
        do {
            print("[C]: Chico ----> $16");
            print("[M]: Mediano ----> $20");
            print("[G]: Grande ----> $25");
            print("Opción: ");
            String tamanioBebida = sc.nextLine();
            switch (tamanioBebida.toUpperCase()) {
                case "C":
                    return "Chico";
                case "M":
                    return "Mediano";
                case "G":
                    return "Grande";
                default:
                    print("Seleccionaste una opción inválida");           
            }
        } while (true);
    }
    
    // ---- NUEVA FUNCION ----
    static double obtenerPrecioBebida(String tamanio) {
        switch (tamanio) {
            case "Chico":
                return 16.0;
            case "Mediano":
                return 20.0;
            case "Grande":
                return 25.0;
            default:
                return 0.0;
        }
    }

    static String complementos(){
        do {
            print("Selecciona algún complemento:");
            print("[S]: Salsas ----> $20");
            print("[P]: Pan con ajo ----> $50");
            print("[F]: Papas a la francesa ----> $75");
            print("Opción: ");
            String elegirComplemento = sc.nextLine();

            switch (elegirComplemento.toUpperCase()) {
                case "S":
                    return "Salsas";
                case "P":
                    return "Pan con ajo";
                case "F":
                    return "Papas a la francesa";
                default:
                    print("Seleccionaste una opción inválida");
            }
        } while (true);
    }

    // ---- FUNCIÓN ----
    static double obtenerPrecioComplemento(String complemento) {
        switch (complemento) {
            case "Salsas":
                return 20.0;
            case "Pan con ajo":
                return 50.0;
            case "Papas a la francesa":
                return 75.0;
            default:
                return 0.0;        
        }
    }



    static void elegirMetodoPago(){
        //
    }

    static void calcularTotal(){
        //
    }

    static void mostrarTicket(String nombreCliente, String tipoPedido, 
    String saborBebida, String tamanioBebida, String complemento, 
    double precioBebida, double precioComplemento){

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
        print(" 1     Refr. " + saborBebida + " " + tamanioBebida + " $" + precioBebida);
        print(" 1     Complemento " + complemento + " " + " $" + precioComplemento);
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