# Decorator

## Descripción
El patrón de diseño **Decorator** permite añadir funcionalidades adicionales a un objeto de manera dinámica sin modificar su estructura. Este patrón se utiliza cuando es necesario agregar responsabilidades a los objetos de forma flexible, manteniendo la clase original sin cambios. En este ejemplo, se utiliza para agregar funcionalidades de notificación a un sistema básico de envío de mensajes.

## Estructura

### **Interfaz `Notificador`**
Define el contrato para los objetos que enviarán mensajes. Las clases concretas que implementan esta interfaz son:
- **`NotificadorBasico`**: Implementa el método `enviar()` para enviar un mensaje simple.

### **Clase abstracta `NotificadorDecorator`**
Implementa la interfaz `Notificador` y contiene una referencia a un objeto de tipo `Notificador`. Esta clase es la base para los decoradores concretos:
- Tiene un constructor que acepta un objeto `Notificador` y lo asigna a un atributo.
- El método `enviar()` delega la llamada al método `enviar()` del objeto `Notificador` decorado.

### **Clases concretas de decoradores**:
- **`NotificadorPorEmail`**: Agrega la funcionalidad de enviar una notificación por correo electrónico. Llama al método `enviar()` del objeto decorado y luego añade un mensaje específico para el correo.
- **`NotificadorPorSMS`**: Agrega la funcionalidad de enviar una notificación por SMS. Llama al método `enviar()` del objeto decorado y luego añade un mensaje específico para el SMS.

### **Clase principal `DecoratorExample`**
Contiene el método `main` para demostrar el uso del patrón **Decorator**:
1. Se crea un **notificador básico** (`NotificadorBasico`).
2. Se envuelven los notificadores básicos con decoradores:
   - Se crea un **decorador por correo** (`NotificadorPorEmail`).
   - Se crea un **decorador por SMS** (`NotificadorPorSMS`).
3. Se envía el mensaje utilizando el objeto decorado, que ejecuta todas las notificaciones añadidas.

## Salida esperada

Enviando mensaje: Este es un mensaje importante.
Enviando notificación por correo: Este es un mensaje importante.
Enviando notificación por SMS: Este es un mensaje importante.


