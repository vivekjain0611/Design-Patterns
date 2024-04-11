package Command;

import Command.Commands.Command;
import Command.Commands.NoCommand;

//invoker
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;

    Command lastExecutedCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        lastExecutedCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            onCommand[i]= new NoCommand();
            offCommand[i]=new NoCommand();
        }
    }

    //Parameterizing with command..

    public void setCommand(int slot, Command on, Command off) {
        onCommand[slot]=on;
        offCommand[slot]=off;
    }
    public void onButtonPressed(int slotNumber) {
        onCommand[slotNumber].execute();
        lastExecutedCommand = onCommand[slotNumber];
    }

    public void offButtonPressed(int slotNumber) {
        offCommand[slotNumber].execute();
        lastExecutedCommand = offCommand[slotNumber];
    }

    public void undoButtonPressed() {
        this.lastExecutedCommand.undo();
        lastExecutedCommand = new NoCommand();
    }
}
