package org.example.generic.genericBoundedType;

public class AnimalHospitalV2<T> {
    private T animal;

    public void set (T animal) {
        this.animal = animal;
    }

    // 타입 매개변수가 T이면, 어는 타입도 받아들일 수 있기에 일단 필드의 타입은 Object 로 가정한다.
    // 그래서 메서드 내부에서는 필드 값을 들어온 인스턴스의 메서드를 사용할 수 없다
    public void checkup() {
        //System.out.println("동물 이름: " + animal.getName());
        //System.out.println("동물 크기: " + animal.getSize());
        //animal.sound();
    }
    /*
    public T bigger (T target) {
        //return animal.getSize() > target.getSize() ? animal : target;
    }

     */
}
