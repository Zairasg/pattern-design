# Abstract Factory

## Descripción
El patrón de diseño **Abstract Factory** proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Este ejemplo implementa un sistema para fabricar diferentes tipos de **comida** (`Pizza` y `Hamburguesa`).

## Estructura

### **Interfaz `Comida`**
Define el contrato para cualquier tipo de comida. Las clases concretas que la implementan son:
- **`Pizza`**: Implementa el método `preparar()` para simular la preparación de una pizza.
- **`Hamburguesa`**: Implementa el método `preparar()` para simular la preparación de una hamburguesa.

### **Interfaz `ComidaFactory`**
Define el contrato para la fábrica de comidas. La clase concreta que la implementa es:
- **`ComidaFactoryImpl`**: Proporciona el método `crearComida(String tipo)` para fabricar comidas según el tipo especificado.

### **Clase principal `AbstractFactoryExample`**
Contiene el método `main` para demostrar el uso del patrón **Abstract Factory**:
1. Se instancia una fábrica concreta (`ComidaFactoryImpl`).
2. Se crean objetos de comida (`Pizza` y `Hamburguesa`) utilizando la fábrica.
3. Se invoca el método `preparar()` de cada objeto creado.

## Salida esperada
Preparando pizza.
Preparando hamburguesa.
