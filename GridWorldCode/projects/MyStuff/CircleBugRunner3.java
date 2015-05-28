import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CircleBugRunner3
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug2 krammer = new CircleBug2();
        krammer.setColor(Color.RED);
        world.add(new Location(4, 4), krammer);
        CircleBug2 norm = new CircleBug2();
        norm.setColor(Color.GREEN);
        world.add(new Location(3, 4), norm);
        CircleBug2 jim = new CircleBug2();
        jim.setColor(Color.BLUE);
        world.add(new Location(9, 9), jim);
        world.show();
    }
}