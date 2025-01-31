package org.example.generic.wildcard;

import org.example.generic.animal.Animal;
import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 100));
        
        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);
        
        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
    }
}
