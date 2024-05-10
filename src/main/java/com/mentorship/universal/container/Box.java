package com.mentorship.universal.container;

public class Box<T> {
    private T value;

    public Box(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}
