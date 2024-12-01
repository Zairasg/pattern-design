# Strategy

## Descripción
El patrón **Strategy** permite seleccionar un algoritmo en tiempo de ejecución. Se define una familia de algoritmos, y se encapsulan de forma que los objetos que los utilizan pueden cambiar su comportamiento sin modificar el código que los utiliza. Es útil cuando se tienen diferentes formas de realizar una tarea, y se desea cambiar el comportamiento de un objeto dinámicamente.

En este ejemplo, se tienen dos estrategias de ejecución: **EstrategiaA** y **EstrategiaB**. Dependiendo de la estrategia seleccionada, el comportamiento de la ejecución cambia.

## Estructura

### **Interfaz `Estrategia`**
Define el contrato para las distintas estrategias. Cada estrategia debe implementar el método `ejecutar()` que representa el comportamiento específico de la estrategia.

### **Clases `EstrategiaA` y `EstrategiaB`**
Estas clases implementan la interfaz `Estrategia` y proporcionan implementaciones concretas del método `ejecutar()`, lo que determina el comportamiento específico de cada estrategia.

### **Clase `Contexto`**
Mantiene una referencia a una instancia de `Estrategia`. La clase `Contexto` permite cambiar la estrategia en tiempo de ejecución mediante el método `setEstrategia(Estrategia estrategia)`, y ejecuta el comportamiento de la estrategia seleccionada mediante el método `ejecutarEstrategia()`.

### **Clase principal `StrategyExample`**
Contiene el método `main` que demuestra cómo se pueden cambiar dinámicamente las estrategias en un objeto `Contexto`. Se crean dos estrategias diferentes y se cambian entre ellas.

## Salida esperada
Estrategia A ejecutada.
Estrategia B ejecutada.
