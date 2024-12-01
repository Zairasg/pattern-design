# State

## Descripción
El patrón **State** permite que un objeto cambie su comportamiento cuando cambia su estado interno. Este patrón permite que el objeto parezca cambiar su clase. Es útil para manejar situaciones en las que un objeto debe comportarse de manera diferente según su estado interno, como un dispositivo que puede estar encendido o apagado.

En este ejemplo, se tiene un dispositivo que puede estar en dos estados: **encendido** y **apagado**. Dependiendo de su estado, el dispositivo muestra un mensaje diferente.

## Estructura

### **Interfaz `Estado`**
Define el contrato para los diferentes estados del dispositivo. Las clases que implementen esta interfaz deberán definir el comportamiento del dispositivo en su estado específico.

### **Clases `EstadoEncendido` y `EstadoApagado`**
Estas clases implementan la interfaz `Estado` y definen el comportamiento del dispositivo en los estados de encendido y apagado, respectivamente.

### **Clase `Contexto`**
Mantiene una referencia al estado actual y delega la ejecución de las operaciones al estado correspondiente. Proporciona un método `setEstado(Estado estado)` para cambiar el estado y un método `ejecutar()` para ejecutar el comportamiento del estado actual.

### **Clase principal `StateExample`**
Contiene el método `main` para demostrar el uso del patrón **State**:
1. Se crea un objeto `Contexto` que representa el dispositivo.
2. Se crean los estados **encendido** y **apagado**.
3. El `Contexto` cambia entre los estados y ejecuta las acciones correspondientes a cada estado.

## Salida esperada
El dispositivo está encendido.
El dispositivo está apagado.
