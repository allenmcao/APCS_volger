import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import java.awt.Color;

public class ConfusedBug extends Bug
{
	public void act()
    {
    	int d = getDirection();
    	setDirection((int)(Math.random()*8)*45);
        if (canMove())
            move();
        else
            setDirection(d);
    }
    
    public void move()
    {
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        moveTo(next);
    }
    
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
        // ok to move into empty location or onto flower
        // not ok to move onto any other actor
    }
}