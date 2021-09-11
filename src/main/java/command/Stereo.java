package command;

import java.util.LinkedList;
import java.util.List;

public class Stereo {
    private List<Integer> songs;

    public Stereo(){
        this.songs = new LinkedList<>();
    }

    public Stereo(List<Integer> songs){
        this.songs = songs;
    }

    public void on(){
        System.out.println("Turning on stereo");
    }

    public void off(){
        System.out.println("Turning off stereo");
    }

    public void playSong(String name){
        this.songs.add(this.songs.size() + 1);
        System.out.println("Playing "+ name);
    }

    public List<Integer> getSongs(){
        return this.songs;
    }
}
