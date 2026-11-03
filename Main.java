import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        String tipoPedido = tipoPedido();
        mostrarMenu();

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
        //
    }
    static String tipoPedido(){
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
    static void diaSemana(){
        //
    }

    static void elegirPizza(){

    }

    static void tamanioPizza(){
        //
    }

    static void especialidad(){
        //
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
    static void print(String texto){
        System.out.println(texto);
    }
}