package composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    public void testComposite(){
        Playlist playlist1 = new Playlist("One");
        Playlist playlist2 = new Playlist("Two");
        Song song1 = new Song("SongOne","Mine");
        Song song2 = new Song("SongTwo","Mine");

        playlist2.addComponent(song2);
        playlist1.addComponent(playlist2);
        playlist1.addComponent(song1);

        for(IComponent component: playlist1.getComponents()){
            component.play();
        }
    }
}
