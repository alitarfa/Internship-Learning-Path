package io.internship.learn.pattern.command;

public class TurnOff implements Command {

    Device device;

    public TurnOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
