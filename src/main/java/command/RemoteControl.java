package command;

public class RemoteControl {// client
    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        this.command.execute();
    }

    public void undo(){
        this.command.undo();
    }

    public void redo(){
        this.command.redo();
    }
}
