package com.mentorship.chained.method.calls;

public class Builder {
    private String name;
    private String type;
    private int size;

    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setType(String type) {
        this.type = type;
        return this;
    }
    public Builder setSize(int size) {
        this.size = size;
        return this;
    }

    public Builder build(){
        return this;
    }

    public void demonstrateResult(){
        System.out.println("Name: " + name + ", Type: " + type + ", Size: " + size);
    }
}
