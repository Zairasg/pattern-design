# Template 

## Descripción
El patrón **Template * define el esqueleto de un algoritmo en un método, delegando algunos pasos a las clases que lo implementan. Este patrón permite que las subclases redefinan ciertos pasos de un algoritmo sin cambiar la estructura general del mismo.

En este ejemplo, la clase abstracta `Procesador` define un método `ejecutar()` que sigue un flujo fijo: cargar datos, procesar datos y guardar el resultado. Las subclases como `ProcesadorTexto` y `ProcesadorImagen` implementan los pasos específicos del algoritmo (`cargarDatos()` y `procesarDatos()`), mientras que el paso `guardarResultado()` tiene una implementación común para todas las subclases.

## Estructura

### **Clase abstracta `Procesador`**
Define el método `ejecutar()`, que establece el algoritmo común, llamando a los métodos `cargarDatos()`, `procesarDatos()` y `guardarResultado()`. Los métodos `cargarDatos()` y `procesarDatos()` son abstractos y deben ser implementados por las subclases. El método `guardarResultado()` tiene una implementación común.

### **Clases concretas `ProcesadorTexto` y `ProcesadorImagen`**
Estas clases implementan los métodos `cargarDatos()` y `procesarDatos()` de manera específica para sus respectivos tipos de datos (texto e imagen).

### **Clase principal `TemplateExample`**
Contiene el método `main` que crea instancias de las clases concretas y llama al método `ejecutar()`, demostrando cómo el algoritmo se comporta de manera diferente dependiendo del tipo de procesador.

## Salida esperada
Cargando datos de texto.
Procesando datos de texto.
Guardando el resultado.
Cargando datos de imagen.
Procesando datos de imagen.
Guardando el resultado.

