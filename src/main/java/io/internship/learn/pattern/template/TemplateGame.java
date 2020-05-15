package io.internship.learn.pattern.template;

public interface TemplateGame {

    public void init();

    public void middleGame();

    public void endGame();


    default void execute() {
        init();
        middleGame();
        endGame();
    }

}
