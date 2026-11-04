# Cintia-sPizza

## Colaboradores

* Rodrigo barrera
* Andy
* Garly Manzanero

## Guia de organizacion en GitHub

### Ramas

* **main** <- Aqui van a ir todos los cambios una vez el programa funcione al 100% (NO TOCAR)

* **feature** <- Aqui se iran uniendo los cambios que realiza cada integrante una vez su parte funcione en su rama independiente y de aqui se extraeran los ultimos cambios para estar sincronizando con:`git pull origin feature`

* **[NombreIntegrante]** <- Esta es una rama que solo el propietario deberia modificar y aqui estara subiendo sus ultimos cambios funcionales antes de enviarlos al feature

### Commits

 Es nesesario especificar la accion que se realizo en cada commit agregando el *prefijo del tipo de cambio:* + *decripcion del commit*
 Ejemplo:
**"feat: Agregue la funcion de registrar el nombre del cliente"**

 Estos serían los prefijos::

* **feat**: Cuando agregues una nueva funcion

* **refactor**: Cuando realices cambios en una funcion ya existente como cambios de nombre de variables o funciones

* **fix**: Cuando arregles algun bug en el sistema

* **perf**: Vuando agregues cambios que mejoran el rendimiento del programa

* **Style**: Cuando agregues algun cambio de formato como tabulaciones, espacios, puntos y coma, etc...

* **doc**: Cuando modifiques o agregues algun alchivo que sirva de documentacion

### Reglas Importantes

* **No pushear cambios al main**

* **Avisar por whatsapp antes de pushear cambios de un merge a feature**

* **Hacer pull de la rama que vas a modificar antes de empezar a modificar el codigo y antes de pushear**

* **No modificar funciones que le pertenecen a otras personas (si hay un bug o un problema que te afecta crea una issue en github)**

* **No ejecutes comandos extraños de git si te los da chat gpt**

## Requerimentos del sistema

### MÓDULOS

| Módulo | Descripción | Elementos / Variables asociadas |
| :--- | :--- | :--- |
| **Cliente** | Registrar el nombre y su orden | `nombreCliente`, `diaSemana`, `tipoPedido` |
| **Producto** | Mostrar sabores, tamaños, complementos y bebidas | `tamanoPizza`, `tamanoBebida`, `especialidad`, `saborBebida`, `cantidadPizzas`, `precioBasePizza`, `precioBaseBebida`, `Extra` |
| **Proceso principal** | El empleado registra lo que el cliente ordena | Captura secuencial e interactiva de los datos del pedido |
| **Cálculos** | Subtotal, extras, descuentos, IVA y total | `subtotal`, `descuento`, `iva`, `total` |
| **Reporte** | Mostrar el ticket del cliente | `metodoPago`, resumen final de la orden y desglose de cobro |

### ENTRADAS DEL SISTEMA

* Nombre del cliente
* Tipo de pedido (Para llevar / Para comer aquí).
* Cantidad de pizzas
* Tamaño de la pizza (Chica, Mediana, Grande, Familiar).
* Especialidad / Sabores seleccionados.
* Tipos de masa
* Sabor de bebida
* Cantidad de bebidas
* Tamaño de la bebida
* Complementos (salsas, pan de ajo, papas a la francesa)
* Método de pago (Efectivo / Tarjeta).

### PROCESOS DEL SISTEMA

* Registrar datos del cliente
* Mostrar menú de opciones
* Registrar productos y cantidades
* Calcular subtotal multiplicando precios y sumando extras
* Aplicar descuentos restando el porcentaje
* Calcular IVA
* Obtener total sumando subtotal e impuesto
* Preparar el comprobante de pago

### SALIDAS DEL SISTEMA

* Nombre del cliente
* Dia de la semana
* Cantidad de pizzas
* Especialidad de la pizza
* Precio base Pizza
* Cantidad de bebida
* Sabor de la bebida
* Precio base de la bebida
* Extras
* Subtotal
* Descuento
* Total
* Tipo de pago
* Cambio

### VARIABLES PRINCIPALES

| Variable | Tipo de dato | Descripción |
| :--- | :--- | :--- |
| `nombreCliente` | String | Nombre del cliente |
| `diaSemana` | String | Selecciona el dia de la semana |
| `tipoPedido` | String | Si es para comer aquí o para llevar |
| `tamanoPizza` | String | Submenú para el tamaño de pizza |
| `tamanoBebida` | String | Submenú para el tamaño de la bebida |
| `especialidad` | String | Qué sabores distintos sabores de pizza |
| `saborBebida` | String | Mostrar los sabores de bebida disponibles |
| `cantidadPizzas` | int | Solicitar la cantidad de pizzas |
| `precioBasePizza` | double | Mostrar el precio de una pizza |
| `precioBaseBebida` | double | Mostrar el precio de una bebida |
| `Extra` | double | Mostrar monto adicional por complemento |
| `subtotal` | double | Monto antes de impuestos |
| `descuento` | double | Restar en porcentaje el subtotal |
| `iva` | final | Añadir el monto de impuestos |
| `metodoPago` | char | Solicitar forma de pago |
| `total` | double | Monto total a pagar |

### ALGORITMO GENERAL DEL SISTEMA

    INICIO
        Solicitar y registrar los datos generales del cliente
        Solicitar el tipo de pedido
        Mostrar el menú de tamaños, especialidades, complementos y bebidas
        Solicitar la selección de los productos deseados
        Registrar la cantidad de pizzas y bebidas requeridas
        Calcular el subtotal del pedido sumando precios y extras
        Aplicar los descuentos
        Aplicar subtotal con descuento
        Calcular el IVA sobre el subtotal con descuento
        Obtener el total a pagar
        Registrar el método de pago
        Generar el ticket o comprobante final
    FIN
