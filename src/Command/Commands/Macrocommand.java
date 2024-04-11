package Command.Commands;


// For executing multiple commands;
public class Macrocommand implements Command{

    Command[] commands;

    public Macrocommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        for(Command command : this.commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i=this.commands.length;i>=0;i--) {
            commands[i].undo();
        }
    }
}
