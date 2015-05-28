import info.gridworld.actor.Bug;
import java.awt.Color;

public class SpinnerBug extends Bug
{
	private int steps;	// Number of times bug has turned
    
    /**
     * Constructs a spinner bug that spins in a circle.
     * It changes color after each complete revolution.
     */
    public SpinnerBug()
    {
    	steps = 0;	// Bug hasn't turned yet.
    }

    /**
     * Turns 90 degress to the right each. Does not move!
     * Once it completes it's first revolution it turns yellow.
     * After thesecond revolution it turns red.
     * It alternates yellow/red each successive revolution.
     */
    public void act()
    {
   		// Turn then determine if you need to change colr
    	// and determine what color to change to
    }
}
