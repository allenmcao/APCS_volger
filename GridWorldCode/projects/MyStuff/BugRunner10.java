import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class BugRunner10
{
    public static void main(String[] args)
    {
        // Create bounded world that is 10 x 10
 		BoundedGrid hurrdurr = new BoundedGrid(10,10);
 		ActorWorld world = new ActorWorld (hurrdurr);
 
 
        // Create 4 bugs with the colors, red, white, blue and yellow
 		Bug a = new Bug (Color.RED);
 		Bug b = new Bug (Color.WHITE);
 		Bug c = new Bug (Color.BLUE);
 		Bug d = new Bug (Color.YELLOW);
        // Face the red bug east, white bug south, blue bug west, and yellow bug north
  		a.setDirection(Location.EAST);
  		b.setDirection(Location.SOUTH);
  		c.setDirection(Location.WEST);
  
  
     	// Add the bugs to the world so that the red bug in in the top left corner
     	// the white bug is in the top right corner, the blue bug in the bottom right corner
     	// and the yellow bug in the bottom left corner
 		world.add(new Location(0,0), a);
 		world.add(new Location(0,9), b);
 		world.add(new Location(9,9), c);
 		world.add(new Location(9,0), d);
 
 
 
 
        // Show the world
        world.show();
    }
}
