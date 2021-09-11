package command;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StereoOnCommand implements Command{
    private Stack<Stereo> stackUndo;
    private Stack<Stereo> stackRedo;

    public StereoOnCommand(Stereo stereo) {
        this.stackUndo = new Stack<>();
        this.stackUndo.push(stereo);
        this.stackRedo = new Stack<>();
    }

    @Override
    public void execute() {
        List<Integer> songs = new LinkedList<>(this.stackUndo.peek().getSongs());
        Stereo newStereo = new Stereo(songs);
        newStereo.playSong("my test");
        this.stackUndo.push(newStereo);
        for(Integer numb: this.stackUndo.peek().getSongs()){
            System.out.print("Song: " + numb+",");
        }
        System.out.println();
    }

    @Override
    public void undo() {
        this.stackRedo.push(this.stackUndo.pop());
        for(Integer numb: this.stackUndo.peek().getSongs()){
            System.out.print("Song: " + numb+",");
        }
        System.out.println();
    }

    @Override
    public void redo() {
        this.stackUndo.push(this.stackRedo.pop());
        for(Integer numb: this.stackUndo.peek().getSongs()){
            System.out.print("Song: " + numb+",");
        }
        System.out.println();
    }
}
