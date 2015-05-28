import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains spiner bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class SpinnerBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpinnerBug cubby = new SpinnerBug();
        cubby.setColor(Color.GREEN);
        world.add(new Location(4, 4), cubby);
        SpinnerBug checker = new SpinnerBug();
        checker.setColor(Color.BLUE);
        world.add(new Location(2, 4), checker);
        world.show();
    }
}