package edu.escuelaing.arsw.interactiveboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is in charge of controlling the activity of the board.
 * @author Miguel Angel Rodriguez Siachoque
 * @author Luis Daniel Benavides Navarro
 */
@SpringBootApplication
public class WhiteBoardAppController 
{
    /**
     * This main method that activates the spring.
     * @param args main method argument for activation.
     */
    public static void main (String[] args)
    {
        SpringApplication.run(WhiteBoardAppController.class, args);
    }
}
