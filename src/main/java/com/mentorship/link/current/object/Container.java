package com.mentorship.link.current.object;

/*Посилання на поточний об'єкт
* Створіть клас Container, який включає метод, що повертає this. Використовуйте цей метод,
* у коді для передачі поточного об'єкта в інший метод як параметр.*/

public class Container {
    private int value;

    public Container(int value) {
        this.value = value;
    }

    public Container getContainer() {
        return this;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void displayResult(Container container) {
        System.out.println("this object: " + this.getValue());
        System.out.println("method parameter object: " + container.getValue());
    }
}
