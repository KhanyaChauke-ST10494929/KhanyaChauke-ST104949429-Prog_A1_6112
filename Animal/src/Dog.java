/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanya's
 */
public class Dog extends Animal implements Adoptable {
    private boolean adopted = false;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public boolean isAdopted() {
        return adopted;
    }

    @Override    public void adopt() {
        adopted = true;
    }
}
