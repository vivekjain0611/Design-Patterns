package Command.Commands;

import Command.Devices.GarrageDoor;

public class GarrageDoorOpenCommand implements Command{

    private  GarrageDoor garrageDoor;

    public GarrageDoorOpenCommand(GarrageDoor garrageDoor) {
        this.garrageDoor = garrageDoor;
    }
    @Override
    public void execute() {
        this.garrageDoor.up();
    }

    @Override
    public void undo() {
        this.garrageDoor.down();
    }
}
