# Prototype

## Descripción
El patrón de diseño **Prototype** permite copiar objetos existentes sin que el código dependa de sus clases específicas. En lugar de crear una nueva instancia de un objeto, se crea una copia (clon) de un objeto existente. Este patrón es útil cuando la creación de un nuevo objeto es costosa o compleja, y se prefieren copias de objetos ya existentes.

En este ejemplo, se crea un **vehículo** con un modelo y año específicos. Luego, se utiliza el patrón **Prototype** para clonar el objeto `Vehiculo` sin necesidad de crear un nuevo objeto desde cero.

## Estructura

### **Interfaz `Prototipo`**
Define el contrato para cualquier clase que desee ser clonada. En este caso, tiene el método `clonar()`, que devuelve una copia del objeto.

### **Clase `Vehiculo`**
Es una implementación concreta de la interfaz `Prototipo`. Contiene los atributos `modelo` y `anio`, y el método `clonar()` que devuelve una copia exacta de un objeto `Vehiculo`.

### **Clase principal `PrototypeExample`**
Contiene el método `main` para demostrar el uso del patrón **Prototype**:
1. Se crea un objeto `Vehiculo` original con un modelo y un año específicos.
2. Se clona el objeto `Vehiculo` utilizando el método `clonar()`.
3. Se imprime el objeto original y el clonado para mostrar que son objetos distintos pero con los mismos valores.

## Salida esperada
Vehículo Original: Vehiculo{modelo='Toyota Corolla', anio=2020}
Vehículo Clonado: Vehiculo{modelo='Toyota Corolla', anio=2020}
Los vehículos son instancias diferentes.
