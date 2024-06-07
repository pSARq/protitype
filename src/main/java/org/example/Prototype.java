package org.example;

public interface Prototype {

    /*Normalmente el método se llama "clone", pero tambien se pueden usar sinónimos. En mi caso use
    * copy porque el sonar de una reconoce que el nombre "clone" es como si usara la interfaz nativa de Java
    * Cloneable que se usa para aplicar este patron de diseño, pero dice que esa interfaz puede presentar ciertos
    * problemas porque no se usa un constructor, por lo tanto, al modificar una copia otras se pueden ver afectadas con
    * ese cambio haciendo que los objetos no sean inmutables */
    Prototype copy();

}
