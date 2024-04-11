package Command;

import Command.Commands.Command;
import Command.Commands.LightOffCommand;
import Command.Commands.LightOnCommand;
import Command.Devices.Light;


//Client - that create commands
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        /*
        Light light = new Light();
        Command lightOnCommand = ()->light::on;
        */
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.undoButtonPressed();
    }
}
