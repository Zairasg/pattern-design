# Factory

## Descripción
El patrón de diseño **Factory** proporciona una interfaz para crear objetos de una familia de clases relacionadas sin especificar las clases concretas. Este patrón permite que una clase delegue la creación de objetos a sus subclases o a una clase encargada de la creación, evitando la necesidad de conocer el tipo concreto de objeto que se está creando.

En este ejemplo, el patrón **Factory** se utiliza para crear diferentes tipos de **comida** (`Pizza`, `Hamburguesa` y `Taco`) sin necesidad de especificar directamente qué tipo de comida se debe crear.

## Estructura

### **Clase abstracta `Comida`**
Define el contrato para las clases concretas de comida. Las clases concretas que extienden esta clase abstracta son:
- **`Pizza`**: Implementa el método `preparar()` para simular la preparación de una pizza.
- **`Hamburguesa`**: Implementa el método `preparar()` para simular la preparación de una hamburguesa.
- **`Taco`**: Implementa el método `preparar()` para simular la preparación de un taco.

### **Clase `ComidaFactory`**
Contiene el método `getComida(String tipoComida)`, que actúa como la **fábrica** para crear las distintas comidas. Dependiendo del tipo de comida proporcionado como parámetro, retorna un objeto de tipo `Comida` correspondiente (por ejemplo, una `Pizza`, `Hamburguesa` o `Taco`). Si el tipo no es reconocido, devuelve `null`.

### **Clase principal `FactoryExample`**
Contiene el método `main` para demostrar el uso del patrón **Factory**:
1. Se crea una instancia de la fábrica `ComidaFactory`.
2. Se solicitan diferentes tipos de comida utilizando el método `getComida()`, pasando como argumento el tipo de comida (por ejemplo, `"PIZZA"`, `"HAMBURGUESA"` o `"TACO"`).
3. Se invoca el método `preparar()` de cada objeto creado.

## Salida esperada

Preparando una pizza con masa, salsa de tomate y queso.
Preparando una hamburguesa con pan, carne y lechuga.
Preparando un taco con tortilla, carne y salsa.
Tipo de comida no reconocido.


