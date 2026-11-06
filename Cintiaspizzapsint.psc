Algoritmo CinthiasPizza
    Definir nombreCliente, tipoPedido, pizza, tam_pizza, especi, sabor, tam_bebida, comp_sel Como Caracter
    Definir cant_pizzas, cant_bebidas Como Entero
    Definir precioTamanioPizza, precioEsp, subtotalPizzas, precioBebida, precioComplemento, factorDescuento, descuento, subtotal, total Como Real
    
    Escribir "Ingresa el nombre del cliente: "
    Leer nombreCliente
    
    mostrarMenu
    
    tipoPedido <- obtenerTipoPedido
    cant_pizzas <- cantidadPizzas
    pizza <- elegirPizza
    tam_pizza <- tamanioPizza
    especi <- especialidad
    
    precioTamanioPizza <- obtenerPreciotamanio(tam_pizza)
    precioEsp <- obtenerPrecioEspecialidad(especi)
    subtotalPizzas <- calcularSubtotalPizzas(precioTamanioPizza, precioEsp, cant_pizzas)
    
    // Llamadas de las BEBIDAS
    cant_bebidas <- cantidadBebidas
    sabor <- saborBebida
    tam_bebida <- tamanioBebida
    
    comp_sel <- complementos
    
    precioBebida <- obtenerPrecioBebida(tam_bebida)
    precioComplemento <- obtenerPrecioComplemento(comp_sel)
    factorDescuento <- calcularDescuento
    descuento <- subtotalPizzas * (1 - factorDescuento)
    subtotal <- calcularSubtotal(cant_bebidas, precioBebida, precioComplemento, subtotalPizzas * factorDescuento)
    total <- calcularTotal(subtotal)
    
    mostrarTicket(nombreCliente, tipoPedido, pizza, cant_pizzas, tam_pizza, especi, subtotal, precioTamanioPizza, precioEsp, sabor, tam_bebida, cant_bebidas, comp_sel, precioBebida, precioComplemento, total, descuento)
    
FinAlgoritmo

// ==========================================
// SUBPROCESOS Y FUNCIONES
// ==========================================

SubProceso mostrarMenu
    Definir opcion Como Caracter
    Escribir "==================================================="
    Escribir "            CINTHIAS PIZZA            "
    Escribir "==================================================="
    Escribir "Seleccione una opción:"
    Escribir "[D] Descuentos y Promociones "
    Escribir "[CUALQUIER LETRA] Registrar Pedido"
    Escribir "==================================================="
    Escribir "Seleccione una opcion: "
    Leer opcion
    Segun Mayusculas(opcion) Hacer
        "D":
            Escribir "==================================================="
            Escribir "                PROMOCIONES Y DESCUENTOS           "
            Escribir "==================================================="
            Escribir "Combo Lunes: 30% de Descuento en Pizzas."
            Escribir ""
            Escribir ""
        De Otro Modo:
            // Continúa normal
    FinSegun
FinSubProceso

Funcion resultado <- obtenerTipoPedido
    Definir tp Como Caracter
    Definir invalido Como Logico
    Repetir
        invalido <- Falso
        Escribir "Selecciona tu tipo de pedido: "
        Escribir "[L]: Para llevar "
        Escribir "[C]: Para comer aquí "
        Leer tp
        Segun Mayusculas(tp) Hacer
            "L":
                resultado <- "Para llevar"
            "C":
                resultado <- "Para comer aqui"
            De Otro Modo:
                Escribir "Seleccione una opcion valida"
                invalido <- Verdadero
        FinSegun
    Hasta Que invalido = Falso
FinFuncion

Funcion cantidad <- cantidadPizzas
    Definir cantidad Como Entero
    Definir invalido Como Logico
    Repetir
        invalido <- Falso
        Escribir "Cuantas pizzas quieres"
        Leer cantidad
        Si cantidad < 1 Entonces
            Escribir "Opcion invalida, intenta de nuevo"
            invalido <- Verdadero
        FinSi
    Hasta Que invalido = Falso
FinFuncion

Funcion resultado <- calcularSubtotalPizzas(precioTamanio, precioEsp, cantidadpizza)
    Definir precioUnaPizza Como Real
    precioUnaPizza <- precioTamanio + precioEsp
    resultado <- precioUnaPizza * cantidadpizza
FinFuncion

Funcion nombrePizza <- elegirPizza
    Definir nombrePizza Como Caracter
    Definir opcion Como Entero
    Definir invalido Como Logico
    Repetir
        invalido <- Falso
        Escribir "Elije el numero de la pizza: "
        Escribir "1. Pizza de queso"
        Escribir "2. Pizza de pepperoni"
        Escribir "3. Pizza Hawaiana"
        Escribir "4. Pizza Mexicana"
        Leer opcion
        Segun opcion Hacer
            1:
                nombrePizza <- "Pizza de queso"
            2:
                nombrePizza <- "Pizza de pepperoni"
            3:
                nombrePizza <- "Pizza Hawaiana"
            4:
                nombrePizza <- "Pizza Mexicana"
            De Otro Modo:
                Escribir "Opcion invalida, intenta de nuevo"
                invalido <- Verdadero
        FinSegun
    Hasta Que invalido = Falso
FinFuncion

Funcion tam_pizza <- tamanioPizza
    Definir tam_pizza Como Caracter
    Definir opcionTamanioPizza Como Entero
    Definir invalido Como Logico
    Repetir
        invalido <- Falso
        Escribir "Que medida de pizza, selecciona el numero"
        Escribir "1. Familiar ($300)"
        Escribir "2. Grande ($250)"
        Escribir "3. Mediano ($200)"
        Escribir "4. Chico ($150)"
        Leer opcionTamanioPizza
        Segun opcionTamanioPizza Hacer
            1:
                tam_pizza <- "familiar"
            2:
                tam_pizza <- "grande"
            3:
                tam_pizza <- "mediano"
            4:
                tam_pizza <- "chico"
            De Otro Modo:
                Escribir "Opcion invalida, intenta de nuevo"
                invalido <- Verdadero
        FinSegun
    Hasta Que invalido = Falso
FinFuncion

Funcion precio <- obtenerPreciotamanio(p_tamanio)
    Definir precio Como Real
    Segun p_tamanio Hacer
        "familiar":
            precio <- 300.0
        "grande":
            precio <- 250.0
        "mediano":
            precio <- 200.0
        "chico":
            precio <- 150.0
        De Otro Modo:
            precio <- 0.0
    FinSegun
FinFuncion

Funcion esp <- especialidad
    Definir esp Como Caracter
    Definir opcionEsp Como Entero
    Definir invalido Como Logico
    Repetir
        invalido <- Falso
        Escribir "Selecciona la especialidad: "
        Escribir "1. Orilla rellena de queso ($30)"
        Escribir "2. Extra queso ($25)"
        Escribir "3. Sin especialidad ($0)"
        Leer opcionEsp
        Segun opcionEsp Hacer
            1:
                esp <- "Orilla rellena de queso"
            2:
                esp <- "Extra queso"
            3:
                esp <- "Sin especialidad"
            De Otro Modo:
                Escribir "Opcion invalida, intenta de nuevo"
                invalido <- Verdadero
        FinSegun
    Hasta Que invalido = Falso
FinFuncion

Funcion precio <- obtenerPrecioEspecialidad(esp)
    Definir precio Como Real
    Segun esp Hacer
        "Orilla rellena de queso":
            precio <- 30.0
        "Extra queso":
            precio <- 25.0
        De Otro Modo:
            precio <- 0.0
    FinSegun
FinFuncion

Funcion diaSemanaSalida <- diaSemana
    Definir diaSemanaSalida Como Entero
    Definir invalido Como Logico
    Repetir
        Escribir "Dia de la semana: "
        Escribir "[1]: Lunes"
        Escribir "[2]: Martes"
        Escribir "[3]: Miercoles"
        Escribir "[4]: Jueves"
        Escribir "[5]: Viernes"
        Escribir "[6]: Sabado"
        Escribir "[7]: Domingo"
        Escribir "Ingrese el dia de la semana de 1-7"
        Leer diaSemanaSalida
        Si diaSemanaSalida >= 1 Y diaSemanaSalida <= 7 Entonces
            invalido <- Falso
        Sino
            invalido <- Verdadero
        FinSi
    Hasta Que invalido = Falso
FinFuncion

Funcion cantidad <- cantidadBebidas
    Definir cantidad Como Entero
    Definir invalido Como Logico
    Repetir
        Escribir "¿Cuántas bebidas vas a querer?"
        Leer cantidad
        Si cantidad <= 0 Entonces
            Escribir "Seleccione una cantidad válida"
            invalido <- Verdadero
        Sino
            invalido <- Falso
        FinSi
    Hasta Que invalido = Falso
FinFuncion

Funcion sabor <- saborBebida
    Definir saborBebidaOpt, sabor Como Caracter
    Definir encontrado Como Logico
    encontrado <- Falso
    Repetir
        Escribir "[C]: Coca-Cola"
        Escribir "[P]: Pepsi"
        Escribir "[M]: Mundet"
        Escribir "[S]: Squirt"
        Escribir "Opción: "
        Leer saborBebidaOpt
        Segun Mayusculas(saborBebidaOpt) Hacer
            "C":
                sabor <- "Coca-Cola"
                encontrado <- Verdadero
            "P":
                sabor <- "Pepsi"
                encontrado <- Verdadero
            "M":
                sabor <- "Mundet"
                encontrado <- Verdadero
            "S":
                sabor <- "Squirt"
                encontrado <- Verdadero
            De Otro Modo:
                Escribir "Seleccionaste una opción inválida"
        FinSegun
    Hasta Que encontrado = Verdadero
FinFuncion

Funcion tam <- tamanioBebida
    Definir tamanioBebidaOpt, tam Como Caracter
    Definir encontrado Como Logico
    encontrado <- Falso
    Repetir
        Escribir "[C]: Chico ----> $16"
        Escribir "[M]: Mediano ----> $20"
        Escribir "[G]: Grande ----> $25"
        Escribir "Opción: "
        Leer tamanioBebidaOpt
        Segun Mayusculas(tamanioBebidaOpt) Hacer
            "C":
                tam <- "Chico"
                encontrado <- Verdadero
            "M":
                tam <- "Mediano"
                encontrado <- Verdadero
            "G":
                tam <- "Grande"
                encontrado <- Verdadero
            De Otro Modo:
                Escribir "Seleccionaste una opción inválida"
        FinSegun
    Hasta Que encontrado = Verdadero
FinFuncion

Funcion precio <- obtenerPrecioBebida(tamanio_param)
    Definir precio Como Real
    Segun tamanio_param Hacer
        "Chico":
            precio <- 16.0
        "Mediano":
            precio <- 20.0
        "Grande":
            precio <- 25.0
        De Otro Modo:
            precio <- 0.0
    FinSegun
FinFuncion

Funcion comp <- complementos
    Definir elegirComplemento, comp Como Caracter
    Definir encontrado Como Logico
    encontrado <- Falso
    Repetir
        Escribir "Selecciona algún complemento:"
        Escribir "[S]: Salsas ----> $20"
        Escribir "[P]: Pan con ajo ----> $50"
        Escribir "[F]: Papas a la francesa ----> $75"
        Escribir "Opción: "
        Leer elegirComplemento
        Segun Mayusculas(elegirComplemento) Hacer
            "S":
                comp <- "Salsas"
                encontrado <- Verdadero
            "P":
                comp <- "Pan con ajo"
                encontrado <- Verdadero
            "F":
                comp <- "Papas a la francesa"
                encontrado <- Verdadero
            De Otro Modo:
                Escribir "Seleccionaste una opción inválida"
        FinSegun
    Hasta Que encontrado = Verdadero
FinFuncion

Funcion precio <- obtenerPrecioComplemento(complemento_param)
    Definir precio Como Real
    Segun complemento_param Hacer
        "Salsas":
            precio <- 20.0
        "Pan con ajo":
            precio <- 50.0
        "Papas a la francesa":
            precio <- 75.0
        De Otro Modo:
            precio <- 0.0
    FinSegun
FinFuncion

Funcion descuento <- calcularDescuento
    Definir descuento Como Real
    Definir diaSemanaValor Como Entero
    descuento <- 1.0
    diaSemanaValor <- diaSemana
    Segun diaSemanaValor Hacer
        1:
            descuento <- 0.7
        3:
            descuento <- 0.5
        6, 7:
            descuento <- 0.9
        De Otro Modo:
            // Sin descuento adicional
    FinSegun
FinFuncion

Funcion res <- calcularSubtotal(cantBeb, precBeb, precComp, subPizzas)
    Definir res Como Real
    res <- subPizzas + (cantBeb * precBeb) + precComp
FinFuncion

Funcion total <- calcularTotal(subtotal_param)
    Definir iva, total Como Real
    iva <- subtotal_param * 0.16
    total <- subtotal_param + iva
FinFuncion

SubProceso mostrarTicket(nombreCliente, tipoPedido, pizza, cantidadpizza, tamaniopizza, especi, subtotal, precioTamanioPizza, precioEsp, saborBebida, tamanioBebida, cantidadBebida, complemento, precioBebida, precioComplemento, total, descuento)
    Escribir "========================================="
    Escribir "           CINTHIAS PIZZA                "
    Escribir "           TICKET DE COMPRA              "
    Escribir "========================================="
    Escribir "Cliente: ", nombreCliente
    Escribir "Tipo: ", tipoPedido
    Escribir "Día: Lunes (Promocion del 30% aplicada)"
    Escribir "Fecha: 28/09/2026"
    Escribir "========================================="
    Escribir "CANT.  DESCRIPCIÓN                   PRECIO"
    Escribir "========================================="
    Escribir cantidadpizza, "     ", pizza, " ", tamaniopizza, "       $", (precioTamanioPizza + precioEsp) * cantidadpizza
    Escribir cantidadBebida, "    Refr. ", saborBebida, " ", tamanioBebida, "       $", precioBebida * cantidadBebida
    Escribir " 1     Complemento: ", complemento, "    $", precioComplemento
    Escribir "========================================="
    Escribir "SUBTOTAL:                            $", subtotal
    Escribir "DESCUENTO APLICADO                  -$", descuento
    Escribir "IVA (16%)                             $", (total - subtotal)
    Escribir ""
    Escribir "TOTAL A PAGAR:                      $", total
    Escribir ""
    Escribir "Pago en Tarjeta:                     $500.00"
    Escribir "Cambio:                              $296.59"
    Escribir "========================================="
    Escribir "   ¡Gracias por su compra en Cinthias!   "
    Escribir "========================================="
FinSubProceso