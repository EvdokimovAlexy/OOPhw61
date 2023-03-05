package org.example;

public class View implements IView {

    @Override
    public void print(String line) {
        System.out.println(line);
    }
}