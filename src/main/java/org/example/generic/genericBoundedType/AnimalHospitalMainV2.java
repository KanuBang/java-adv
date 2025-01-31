package org.example.generic.genericBoundedType;

import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

// 기능 자체를 사용할 수 없게 되고 타입 안정성이 떨어짐
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
