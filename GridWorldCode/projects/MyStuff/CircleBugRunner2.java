import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class CircleBugRunner2
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CircleBug krammer = new CircleBug();
        krammer.setColor(Color.RED);
        world.add(new Location(4, 4), krammer);
        CircleBug norm = new CircleBug();
        norm.setColor(Color.GREEN);
        world.add(new Location(3, 4), norm);
        CircleBug jim = new CircleBug();
        jim.setColor(Color.BLUE);
        world.add(new Location(9, 9), jim);
        world.show();
    }
}