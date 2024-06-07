package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("nombre1", "apellido1", 10);
        User userCopy = user1.copy();

        System.out.println("user1 = " + user1);
        System.out.println("userCopy = " + userCopy);

        userCopy.setName("nombre de copia modificado");

        System.out.println("user1 = " + user1);
        System.out.println("userCopy = " + userCopy);

    }
}