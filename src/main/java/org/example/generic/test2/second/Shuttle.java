package org.example.generic.test2.second;

import org.example.generic.test2.BioUnit;

public class Shuttle<T extends BioUnit> {
    T unit;

    public void in(T unit) {
        this.unit = unit;
    }
    public BioUnit out(){
        return unit;
    }
    public void showInfo() {
        System.out.printf("이름: %s, HP: %d\n", unit.getName(), unit.getHp());
    }
}
