import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class catTest {
    cat newCat;
    @BeforeEach
    public void setUp(){
        newCat = new cat("Mурка",3);
    }

    @Test
    public void shouldGetAge(){

        newCat.getAge();
        Assertions.assertEquals(3,newCat.getAge());
    }
    @Test
    public void shouldMeow(){

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assertions.assertEquals(output.toString(), "Meow");
    }
    @AfterEach
    public void remove(){
        newCat  = null;
    }
}
