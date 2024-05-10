package com.mentorship.universal.container.generics.universal.interfac;

public class UniversalPair<T, R> implements UniversalPairInterface<T, R> {
    private T key;
    private R value;


    @Override
    public T getKey() {
        return this.key;
    }

    @Override
    public R getValue() {
        return this.value;
    }

    public UniversalPair(T key, R value){
        this.key = key;
        this.value = value;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setValue(R value) {
        this.value = value;
    }
}
