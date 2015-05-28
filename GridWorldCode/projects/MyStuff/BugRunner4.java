import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class BugRunner4
{
    public static void main(String[] args)
    {
        // Create a bounded gird that is 4 x 4
        BoundedGrid hurrdurr = new BoundedGrid (4,4);
        
        // Create aa ActorWorld that that is a bounded 4 x 4 grid
		ActorWorld world = new ActorWorld(hurrdurr);

        // Create 4 bugs and place them in the four corners of
        // of the world.
		world.add(new Location(0,0),new Bug());
		world.add(new Location(3,0),new Bug());
		world.add(new Location(0,3),new Bug());
		world.add(new Location(3,3),new Bug());

        // Display the world
        world.show();
    }
}
