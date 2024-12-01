# Builder

## Descripción
El patrón de diseño **Builder** permite la construcción de objetos complejos paso a paso. Este patrón se utiliza cuando el proceso de creación de un objeto debe ser independiente de las partes que lo componen y de la forma en que se ensamblan. En este ejemplo, se construye un **producto** que tiene varias partes (A, B, C), y se puede crear de manera flexible.

## Estructura

### **Clase `Producto`**
Representa el objeto complejo que se va a construir. Contiene varias partes (`parteA`, `parteB`, `parteC`), y métodos para establecer cada parte:
- `setParteA()`: Establece la parte A del producto.
- `setParteB()`: Establece la parte B del producto.
- `setParteC()`: Establece la parte C del producto.

### **Interfaz `Constructor`**
Define el contrato para el constructor. Las clases concretas que la implementan son:
- **`ConstructorConcreto`**: Implementa los métodos para construir cada parte del producto (`construirParteA()`, `construirParteB()`, `construirParteC()`) y devuelve el producto completo mediante el método `obtenerProducto()`.

### **Clase `Director`**
Orquesta la construcción del objeto complejo. El director es responsable de utilizar el **constructor** para construir el **producto** paso a paso:
- El método `construirProducto()` ejecuta los pasos necesarios para construir el producto completo.

### **Clase principal `BuilderExample`**
Contiene el método `main` para demostrar el uso del patrón **Builder**:
1. Se crea un **constructor concreto** (`ConstructorConcreto`).
2. Se crea un **director** que utiliza el constructor.
3. Se construye el **producto** llamando al método `construirProducto()`.
4. Se imprime el producto final.

## Salida esperada
Producto [parteA=Parte A construida, parteB=Parte B construida, parteC=Parte C construida]

