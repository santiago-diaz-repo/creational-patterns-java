package composite;

public class Song implements IComponent{
    private String name;
    private String artist;

    public Song(String name, String artist){
        this.name = name;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Play from song " + this.name);
    }

    @Override
    public void Stop() {
        System.out.println("Stop from song");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getArtist(){
        return this.artist;
    }
}
