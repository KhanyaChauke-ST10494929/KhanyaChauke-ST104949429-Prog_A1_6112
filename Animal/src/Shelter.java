/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khanya's
 */
public class Shelter {
    public static void main(String[] args) {
        Dog buddy = new Dog("Buddy", 3);
        Cat whiskers = new Cat("Whiskers", 2);

        buddy.makeSound();
        whiskers.makeSound();

        System.out.println("Is Buddy adopted? " + buddy.isAdopted());
        buddy.adopt();
        System.out.println("Is Buddy adopted after adoption? " + buddy.isAdopted());

        System.out.println("Buddy's adoption status: " + buddy.isAdopted());
        System.out.println("Whiskers' adoption status: " + whiskers.isAdopted());
    }
}
