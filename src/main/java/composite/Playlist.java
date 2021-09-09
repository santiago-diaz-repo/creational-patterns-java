package composite;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent{
    private List<IComponent> components;
    private String name;

    public Playlist(String name){
        this.components = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Play from playlist " + this.name);
    }

    @Override
    public void Stop() {
        System.out.println("Stop from playlist " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void addComponent(IComponent song){
        this.components.add(song);
    }

    public void removeComponent(IComponent song){
        this.components.remove(song);
    }

    public List<IComponent> getComponents() {
        return components;
    }
}
