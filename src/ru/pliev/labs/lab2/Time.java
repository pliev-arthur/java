package ru.pliev.labs.lab2;

public class Time {
    private int seconds;

    public Time(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Ошибка! Время не может быть отрицательным!");
        }
        while (seconds >= 24 * 3600) {
            seconds -= 24 * 3600;
        }
        this.seconds = seconds;
    }
    public Time(int hours,int minutes, int seconds) {
        if ((seconds < 0) || (minutes < 0) || (hours < 0)) {
            throw new IllegalArgumentException("Ошибка! Время не может быть отрицательным!");
        }
        seconds += minutes * 60 + hours * 3600;
        while (seconds >= 24 * 3600) {
            seconds -= 24 * 3600;
        }
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Ошибка! Время не может быть отрицательным!");
        }
        while (seconds >= 24 * 3600) {
            seconds -= 24 * 3600;
        }
        this.seconds = seconds;
    }
    public int getСurrentHours() {
        return seconds/3600;
    }
    public int getCurrentMinutes() {
        return (seconds - getСurrentHours() * 3600) / 60;
    }
    public int getCurrentSeconds() {
        return seconds - getСurrentHours() * 3600 - getCurrentMinutes() * 60;
    }
    @Override
    public String toString() {
        int _seconds = getCurrentSeconds();
        int _hours = getСurrentHours();
        int _minutes =  getCurrentMinutes();
        return _hours + ":" + _minutes + ":" + _seconds;
    }
}
