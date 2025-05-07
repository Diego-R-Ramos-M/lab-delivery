Para el programa se usaron 2 patrones de diseño creacional: el patron Singleton y el patron Factory Method.

El patron Factory Method se usó en la creación de los distintos tipos de comidas. Este patron se aplicó para evitar que el código esté acoplado a una sola clase de comida, pudiendo así agregar en el futuro nuevas clases de comida sin alterar el código de las clases de comida ya existentes.

El patrón Singleton se uso para la creación del gestor de pedidos. Este patrón se aplicó para evitar que exista más de una instancia de la clase gestora de pedidos, ya que por lógica del negocio de delivery no puede haber 2 listas de pedidos.
