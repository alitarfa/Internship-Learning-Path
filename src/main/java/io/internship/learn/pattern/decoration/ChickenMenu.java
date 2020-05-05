package io.internship.learn.pattern.decoration;

import lombok.ToString;

@ToString
public class ChickenMenu extends MenuDecoration {

    public ChickenMenu(Menu menu) {
        super(menu);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Pizza 4";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
