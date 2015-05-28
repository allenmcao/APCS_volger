import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class HustleDanceBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        HustleDanceBug johnTravolta = new HustleDanceBug();
        johnTravolta.setColor(Color.BLACK);
        world.add(new Location(4, 4), johnTravolta);
        world.show();
    }
}