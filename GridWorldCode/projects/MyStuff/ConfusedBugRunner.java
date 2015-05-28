import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import java.awt.Color;

public class ConfusedBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        ConfusedBug  blondeBuggie = new ConfusedBug();
        blondeBuggie.setColor(Color.YELLOW);
        world.add(new Location(6, 4), blondeBuggie);
        ConfusedBug  redBuggie = new ConfusedBug();
        redBuggie.setColor(Color.RED);
        ConfusedBug blueBuggie = new ConfusedBug();
        blueBuggie.setColor(Color.BLUE);
        world.add(new Location(8,7), blueBuggie);
        world.add(new Location(0, 0), redBuggie);
        Rock r1 = new Rock();
        world.add(new Location(1,1), r1);
        Rock r2 = new Rock();
        world.add(new Location(0,1), r2);
        Rock r3 = new Rock();
        world.add(new Location(1,0), r3);
        Rock r4 = new Rock();
        world.add(new Location(7,7), r4);
        Flower f1 = new Flower();
        world.add(new Location(5,4), f1);
        world.show();
    }
}