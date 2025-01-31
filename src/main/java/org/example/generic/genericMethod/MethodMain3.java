package org.example.generic.genericMethod;

import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);
        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);
        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
