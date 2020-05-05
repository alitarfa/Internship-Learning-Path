package io.internship.learn.pattern.strategy;

public interface Command {

    public String apply();

    public class Mkdir implements Command {

        @Override
        public String apply() {
            return "mkdir";
        }
    }


    public class Ls implements Command {

        @Override
        public String apply() {
            return "ls";
        }
    }


    public class Sudo implements Command {

        @Override
        public String apply() {
            return "sudo";
        }
    }

    public class NotSupported implements Command {

        @Override
        public String apply() {
            return "Command Not Supported... ^_^";
        }
    }
}


