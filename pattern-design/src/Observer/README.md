# Observer

## Descripción
El patrón de diseño **Observer** define una relación de dependencia uno-a-muchos entre objetos, de tal manera que cuando un objeto cambia de estado, todos los objetos dependientes son notificados y actualizados automáticamente. Este patrón se utiliza comúnmente para implementar sistemas de notificación en los que un sujeto (por ejemplo, un canal de notificación) notifica a varios observadores (por ejemplo, usuarios suscritos).

En este ejemplo, se crea un **canal de notificaciones** que tiene varios **usuarios suscritos**. Cuando el canal emite un mensaje, todos los usuarios suscritos son notificados de dicho mensaje.

## Estructura

### **Interfaz `Observador`**
Define el contrato que debe seguir cualquier clase que desee recibir actualizaciones. Las clases concretas que implementan esta interfaz son:
- **`Usuario`**: Implementa el método `actualizar()` para recibir las notificaciones enviadas por el canal.

### **Clase `Canal`**
Representa al **sujeto** o **emisor** de las notificaciones. Esta clase:
- Mantiene una lista de observadores (usuarios).
- Permite suscribir y desuscribir observadores.
- Notifica a todos los observadores registrados cuando ocurre un cambio.

### **Clase principal `ObserverExample`**
Contiene el método `main` para demostrar el uso del patrón **Observer**:
1. Se crea un **canal** al que los usuarios pueden suscribirse.
2. Los **usuarios** se suscriben y reciben notificaciones.
3. El canal envía un mensaje a todos los usuarios suscritos.
4. Un usuario se desuscribe, y el canal envía un nuevo mensaje solo a los usuarios restantes.

## Salida esperada 
Juan recibió la notificación: Nuevo video disponible.
María recibió la notificación: Nuevo video disponible.
María recibió la notificación: Segundo video disponible.


