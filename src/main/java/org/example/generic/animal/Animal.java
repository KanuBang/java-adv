package org.example.generic.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Animal {
    private String name;
    private int size;

    public void sound() {
        System.out.println("동물의 울음 소리");
    }
}
