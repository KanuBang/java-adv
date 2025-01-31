package org.example.generic.test2.first;

import org.example.generic.test2.BioUnit;

public class UnitUtil<T> {
   static <T extends BioUnit> T maxHp (T value1, T value2) {
       return value1.getHp() >= value2.getHp() ? value1 : value2;
   }
}
