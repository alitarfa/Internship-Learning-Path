package io.internship.learn.pattern.strategy;

public class Terminal {

    private Command command;

    public Terminal(Command command) {
        this.command = command;
    }

    public String run(String args) {
        switch (args) {
            case "ls":
                return new Command.Ls().apply();
            case "mkdir":
                return new Command.Mkdir().apply();
            case "sudo":
                return new Command.Sudo().apply();
            default:
                return new Command.NotSupported().apply();
        }
    }
}
