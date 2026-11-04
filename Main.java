import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        mostrarMenu();

        String tipoPedido = tipoPedido();

        int cantidadPizza = cantidadPizzas();

        String pizza = elegirPizza();
        String tamaniopizza = tamanioPizza();
        String especi = especialidad();
        double precioTamanioPizza = obtenerPreciotamanio(tamaniopizza);
        double precioEsp = obtenerPrecioEspecialidad(especi);
        double subtotalPizzas = calcularSubtotalPizzas(precioTamanioPizza, precioEsp, cantidadPizza);

        // Llamadas de las BEBIDAS
        int cantidadBebidas = cantidadBebidas();
        String sabor = saborBebida();
        String tamanio = tamanioBebida();

        String complementos = complementos();

        double precioBebida = obtenerPrecioBebida(tamanio);
        double precioComplemento = obtenerPrecioComplemento(complementos);
        double subtotal = calcularSubtotal(cantidadBebidas, precioBebida, precioComplemento, subtotalPizzas);
        double total = calcularTotal(subtotal);

        mostrarTicket(
                nombreCliente,
                tipoPedido,
                pizza,
                cantidadPizza,
                tamaniopizza,
                especi,
                subtotal,
                precioTamanioPizza,
                precioEsp,
                sabor,
                tamanio,
                cantidadBebidas,
                complementos,
                precioBebida,
                precioComplemento,
                total);

        sc.close();
    }

    static void mostrarMenu() {
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

    static int cantidadPizzas() {
        int cantidad;
        boolean invalido;
        do {
            invalido = false;
            print("Cuantas pizzas quieres");
            cantidad = sc.nextInt();
            sc.nextLine();
            if (cantidad < 1) {
                print("Opcion invalida, intenta de nuevo");
                invalido = true;
            }
        } while (invalido);

        return cantidad;
    }

    static double calcularSubtotalPizzas(double precioTamanio, double precioEsp, int cantidadpizza) {
        double precioUnaPizza = precioTamanio + precioEsp;
        return precioUnaPizza * cantidadpizza;
    }

    static String elegirPizza() {
        String nombrePizza = "";
        boolean invalido;
        do {
            invalido = false;
            print("Elije el numero de la pizza: ");
            print("1. Pizza de queso");
            print("2. Pizza de pepperoni");
            print("3. Pizza Hawaiana");
            print("4. Pizza Mexicana");

            int opcion = sc.nextInt();
            sc.nextLine();

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

    static String tamanioPizza() {
        String tamaniopizza = "";
        boolean invalido;
        do {
            invalido = false;
            print("Que medida de pizza, selecciona el numero");
            print("1. Familiar ($300)");
            print("2. Grande ($250)");
            print("3. Mediano ($200)");
            print("4. Chico ($150)");
            int opcionTamanioPizza = sc.nextInt();
            sc.nextLine();

            switch (opcionTamanioPizza) {
                case 1:
                    tamaniopizza = "familiar";
                    break;
                case 2:
                    tamaniopizza = "grande";
                    break;
                case 3:
                    tamaniopizza = "mediano";
                    break;
                case 4:
                    tamaniopizza = "chico";
                    break;
                default:
                    print("Opcion invalida, intenta de nuevo");
                    invalido = true;
            }
        } while (invalido);

        return tamaniopizza;
    }

    static double obtenerPreciotamanio(String tamaniopizza) {
        switch (tamaniopizza) {
            case "familiar":
                return 300.0;
            case "grande":
                return 250.0;
            case "mediano":
                return 200.0;
            case "chico":
                return 150.0;
            default:
                return 0.0;
        }
    }

    static String especialidad() {
        String esp = "";
        boolean invalido;
        do {
            invalido = false;
            print("Selecciona la especialidad: ");
            print("1. Orilla rellena de queso ($30)");
            print("2. Extra queso ($25)");
            print("3. Sin especialidad ($0)");
            int opcionEsp = sc.nextInt();
            sc.nextLine();

            switch (opcionEsp) {
                case 1:
                    esp = "Orilla rellena de queso";
                    break;
                case 2:
                    esp = "Extra queso";
                    break;
                case 3:
                    esp = "Sin especialidad";
                    break;
                default:
                    print("Opcion invalida, intenta de nuevo");
                    invalido = true;
            }
        } while (invalido);

        return esp;
    }

    static double obtenerPrecioEspecialidad(String esp) {
        switch (esp) {
            case "Orilla rellena de queso":
                return 30.0;
            case "Extra queso":
                return 25.0;
            default:
                return 0.0;
        }
    }

    static int diaSemana() {
        int diaSemana;
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
            sc.nextLine();
            invalido = (diaSemana > 0 || diaSemana < 8) ? false : true;
        } while (invalido);
        return diaSemana;
    }

    // ---- FUNCIÓN ----
    static int cantidadBebidas() {
        int cantidad = 0;
        boolean invalido = false;

        do {
            print("¿Cuántas bebidas vas a querer?");
            cantidad = sc.nextInt();
            sc.nextLine();

            if (cantidad <= 0) {
                print("Seleccione una cantidad válida");
                invalido = true;
            } else {
                invalido = false;
            }
        } while (invalido);
        return cantidad;
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

    static String complementos() {
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

    static void elegirMetodoPago() {
        //
    }

    static double calcularDescuento(){
        double descuento = 1.0;
        int diaSemana = diaSemana();
        switch (diaSemana) {
            case 1:
                descuento = 0.7;
                break;
            case 3:
                descuento = 0.5;
                break;
            case 6: case 7:
                descuento = 0.9;
                break;
            default:
                break;
        }
        return descuento;
    }

    static double calcularSubtotal(double cantidadBebida, double precioBebida, double precioComplemento, double subtotalPizzas) {
        return (subtotalPizzas * calcularDescuento()) + (cantidadBebida * precioBebida) + precioComplemento;
    }

    static double calcularTotal(double subtotal) {
        double iva = subtotal * 0.16;
        return subtotal + iva;
    }

    static void mostrarTicket(
            String nombreCliente,
            String tipoPedido,
            String pizza,
            int cantidadpizza,
            String tamaniopizza,
            String especi,
            double subtotal,
            double precioTamanioPizza,
            double precioEsp,
            String saborBebida,
            String tamanioBebida,
            int cantidadBebida,
            String complemento,
            double precioBebida,
            double precioComplemento,
            double total) {

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
        print("" + cantidadBebida + "    Refr. " + saborBebida + " " + tamanioBebida + "       $" + precioBebida * cantidadBebida);
        print(" 1     Complemento: " + complemento + " " + "   $" + precioComplemento);
        print("=========================================");
        print("SUBTOTAL:                         $" + subtotal);
        print("DESCUENTO APLICADO                -$75.15");
        print("IVA (16%)                          $" + (total - subtotal));
        print("");
        print("TOTAL A PAGAR:                    $" + total);
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

// ticket(nombreCliente, tipoPedido, diaSemana, pizza, tamaniopizza, especi,
// precioTamanioPizza, precioEsp, sabor, tamanio, complementos,
// precioBebida, precioComplemento);