## SISTEMA DE INVENTARIO TIENDA DE ROPA

Sistema desarrollado en Java para la gestion de inventario de una tienda de ropa, ejecutado por consola.

### Funcionamiento
- Permite agregar productos en el sistema; Validando que el código de los productos sea único, también valida que el precio y stock sea cantidades positivas.
- Permite buscar productos mediante nombre, categoría o código; Muestra los productos que coincidan con el criterio de busqueda.
- Permite eliminar un producto por medio de el código único del producto.
- Permite registrar la venta de uno o varios productos; Validando que exista y haya stock suficiente del producto, guardando la fecha y la hora de la transacción.
- Permite generar reportes del inventario y las ventas en un archivo PDF. 
- Permite ver los datos del usuario que esta utilizando el sistema, como también el del estudiante que desarrollo el sistema.

### INSTRUCCIONES
- Tener Apache-NetBeams-26 instalado.
- Tener Java JDK 8 o superior. 
- Descargar el archivo JAR de iTextPDF 5.5.9
- Abrir el proyecto y ejecutarlo.

### OBSERVACIONES
- Se puede agregar la opción de bitácora, que permite registrar todos los procesos que se realizan en el programa con fecha y hora.
- Se podría cambiar los vectores de tamaño 25 por vectores o matrices dinamicos, que permitirian hacer el inventario de cualquier tamaño.
- A veces no funciona bien el registrar otra venta después de haber registrado otras.
