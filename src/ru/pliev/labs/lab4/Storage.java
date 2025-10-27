package ru.pliev.labs.lab4;

public class Storage<T> {
    private final T item;

    public Storage(T item) {
        this.item = item;
    }

    public T getRawItem() {
        return item;
    }

    public T getItem(T alternative) {
        return isStorageFull() ? item : alternative;
    }

    public boolean isStorageFull() {
        return (item != null);
    }

    @Override
    public String toString() {
        if (this.isStorageFull()) {
            return "" + item;
        }
        return "Коробка пуста!";
    }
}
