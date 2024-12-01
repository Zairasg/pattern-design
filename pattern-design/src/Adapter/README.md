# Adapter

## Descripción
El patrón de diseño **Adapter** permite que interfaces incompatibles colaboren entre sí. Este patrón convierte una interfaz en otra que un cliente espera, actuando como un adaptador entre dos interfaces.

En este ejemplo, el **Adapter** permite que un **enchufe americano** sea compatible con un **enchufe europeo**, adaptando el método de conexión de uno al otro.

## Estructura

### **Interfaz `EnchufeEuropeo`**
Define el contrato para los enchufes europeos. Las clases concretas que la implementan son:
- **`EnchufeDeEuropa`**: Implementa el método `conectarEnchufe()` para simular la conexión de un enchufe europeo.

### **Clase `EnchufeDeAmerica`**
Simula un enchufe americano con el método `conectar()`.

### **Clase `EnchufeAdapter`**
Esta clase actúa como adaptador, convirtiendo el método de conexión del **enchufe americano** a la interfaz **enchufe europeo**:
- Implementa la interfaz `EnchufeEuropeo`.
- En lugar de implementar el método `conectarEnchufe()`, llama al método `conectar()` del **enchufe americano**.

### **Clase principal `AdapterExample`**
Contiene el método `main` para demostrar el uso del patrón **Adapter**:
1. Se crea un **enchufe europeo** (`EnchufeDeEuropa`).
2. Se crea un **enchufe americano** (`EnchufeDeAmerica`).
3. Se adapta el **enchufe americano** a la interfaz **enchufe europeo** mediante el **adaptador** (`EnchufeAdapter`).
4. Se invoca el método `conectarEnchufe()` del adaptador.

## Salida esperada
Conectado al enchufe europeo.
Conectado al enchufe americano.


