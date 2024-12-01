# PrototypeC

## Descripción
El patrón **Prototype** permite copiar objetos existentes sin que el código cliente tenga que conocer sus detalles específicos. Esto se logra a través de un método de clonación, que puede copiar un objeto, creando un nuevo objeto con las mismas características. Es útil cuando crear una nueva instancia de un objeto es costoso, y se prefiere clonar objetos existentes.

En este ejemplo, la interfaz `Prototipo` define un método `clonar()`, que se utiliza para crear una copia del objeto. La clase `Documento` implementa este patrón, donde los objetos `Documento` pueden ser clonados sin necesidad de crear nuevas instancias manualmente.

## Estructura

### **Interfaz `Prototipo`**
Define el método `clonar()`, que debe ser implementado por las clases concretas que deseen ofrecer funcionalidad de clonación.

### **Clase concreta `Documento`**
Implementa la interfaz `Prototipo` y proporciona la implementación del método `clonar()`, que crea una copia del documento con el mismo contenido.

### **Clase principal `PrototypecExample`**
Contiene el método `main`, que demuestra la creación de un documento original, su clonación, y la modificación del contenido del documento clonado sin afectar al documento original.

## Salida esperada
Documento [contenido=Contenido original]
Documento [contenido=Contenido modificado]
