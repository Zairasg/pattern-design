# Singleton

## Descripción
El patrón **Singleton** asegura que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia. Es útil cuando se necesita un objeto único en todo el sistema, como un administrador de configuración, una conexión a base de datos o un controlador de logs.

En este ejemplo, se crea una clase `Singleton` que garantiza que solo se cree una instancia de la clase, incluso si se solicita múltiples veces.

## Estructura

### **Clase `Singleton`**
Contiene un constructor privado para evitar la creación de instancias fuera de la clase. La instancia única de la clase se maneja mediante el método estático `getInstance()`. Si la instancia no existe, se crea; si ya existe, se devuelve la misma instancia.

### **Clase principal `SingletonExample`**
Contiene el método `main` para demostrar el uso del patrón **Singleton**:
1. Se solicita la instancia única de la clase `Singleton` usando el método `getInstance()`.
2. Se invoca el método `mostrarMensaje()` de la instancia única.
3. Se verifica que todas las referencias a la clase apunten a la misma instancia.

## Salida esperada
Mensaje desde la instancia única de Singleton.
Ambas referencias apuntan a la misma instancia.

