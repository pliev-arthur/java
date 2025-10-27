package ru.pliev.labs.lab4;

public class Box<T> {

    private T thing;

    public Box(T thing) {
        this.thing = thing;
    }

    public Box() {
    }

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        if (this.thing != null) {
            throw new IllegalArgumentException("Коробка уже содержит объект!");
        }
        this.thing = thing;
    }

    public void removeThing() {
        thing = null;
    }

    public boolean isBoxFull() {
        return (thing != null);
    }

    @Override
    public String toString() {
        if (this.isBoxFull()) {
            return "" + thing;
        }
        return "Коробка пуста!";
    }
}
