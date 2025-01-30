package org.example.generic.animal;

import lombok.Data;

@Data
public class Box<T> {
    private T value;
}
