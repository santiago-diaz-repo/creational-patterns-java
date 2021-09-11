package template;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class TemplateTest {

    @Test
    public void testTemplate(){

        SocialMedia socialMedia;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 1)
            socialMedia = new Twitter("hello","world");
        else
            socialMedia= new Facebook("hello","world");

        socialMedia.post("Message");
    }
}
