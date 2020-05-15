package io.internship.learn.pattern.template;

public class Game implements TemplateGame {

    @Override
    public void init() {
        System.out.println("Init");
    }

    @Override
    public void middleGame() {
        System.out.println("Middle game");
    }

    @Override
    public void endGame() {
        System.out.println("End Game");
    }


}
