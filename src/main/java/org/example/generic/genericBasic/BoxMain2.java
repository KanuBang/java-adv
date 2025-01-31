package org.example.generic.genericBasic;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // 자식은 부모를 담을 수 있다.
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        integerBox.set("afafwe");
        Integer result = (Integer) integerBox.get(); // String -> Integer 캐스팅
        System.out.println("result = " + result);

    }
}
