import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarMenu();
        print("Ingresa el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        String tipoPedido = tipoPedido();
        int diaSemana = diaSemana();

        mostrarTicket(nombreCliente, tipoPedido);
        
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
    static void elegirPizza(){

    }
    static void tamanioPizza(){
        //
    }
    static void especialidad(){
        //
    }
    static void elegirBebida(){
        //
    }
    static void saborBebida(){
        //
    }
    static void tamanioBebida(){
        //
    }
    static void complementos(){
        //
    }
    static void elegirMetodoPago(){
        //
    }
    static void calcularTotal(){
        //
    }
    static void mostrarTicket(String nombreCliente, String tipoPedido){
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
    static void print(String texto){
        System.out.println(texto);
    }
}