package org.example;

public class User implements Prototype {

    private String name;
    private String lastName;
    private int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public User(User user) {
        this.name = user.name;
        this.lastName = user.lastName;
        this.age = user.age;
    }

    /*Tambien se pueden implementar todos los demas setter y getters, pero para este ejemplo no lo voy a usar*/
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    /*Poner cuidado que aunque este es el metodo que se implementa de la interfaz se esta retornando un objeto de tipo
    * User. Esto es posible ya que esta clase implementa la interfaz Prototype, entonces esto tambien es una clase de tipo
    * Prototype y por lo tanto se puede reemplazar*/
    @Override
    public User copy() {
        return new User(this);
    }
}
