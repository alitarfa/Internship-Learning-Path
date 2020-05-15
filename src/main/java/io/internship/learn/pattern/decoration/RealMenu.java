package io.internship.learn.pattern.decoration;

import lombok.ToString;

@ToString
public class RealMenu implements Menu {

    @Override
    public String getDescription() {
        return "Menu";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
