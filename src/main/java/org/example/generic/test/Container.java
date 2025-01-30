package org.example.generic.test;

public class Container<T> {
    T item;
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public Boolean isEmpty(){
        return item == null;
    }
}
