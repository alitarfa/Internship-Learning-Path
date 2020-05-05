package io.internship.learn.pattern.decoration;

import lombok.ToString;

@ToString
abstract public class MenuDecoration<T> implements Menu {

    Menu menu;

    public MenuDecoration(Menu menu) {
        this.menu = menu;
    }

    public String getDescription() {
        return menu.getDescription();
    }


    public double getCost() {
        return menu.getCost();
    }
}
