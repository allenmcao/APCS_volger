import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class HustleDanceBug extends Bug
{
	private int steps;
	private int color;
    
    public HustleDanceBug()
    {
    	steps = 0;
    	color = 0;
    }

    public void act()
    {
    	if (steps < 3)
    	{
    		Grid gr = getGrid();
	        Location loc = getLocation();

	        Location next = loc.getAdjacentLocation((getDirection()+Location.SOUTH)%360);
        	moveTo(next);
        	steps++;
    	}
    	
    	else if (steps < 6)
    	{
    		Grid gr = getGrid();
	        Location loc = getLocation();

	        Location next = loc.getAdjacentLocation(getDirection());
        	moveTo(next);
    		steps++;	
    	}
    	
    	else if (steps < 8)
    	{
    		Grid gr = getGrid();
	        Location loc = getLocation();

	        Location next = loc.getAdjacentLocation((getDirection()+Location.LEFT)%360);
        	moveTo(next);
        	steps++;
    	}
    	
    	else if (steps < 10)
    	{
    		Grid gr = getGrid();
	        Location loc = getLocation();

	        Location next = loc.getAdjacentLocation((getDirection()+Location.RIGHT)%360);
        	moveTo(next);
        	steps++;
    	}
    	
    	else if (steps < 11)
    	{
    		setDirection(getDirection()+Location.RIGHT);
    		steps=0;
    		if (color==0)
    		{
    			setColor(Color.RED);
    			color++;
    		}
    		else if (color==1)
    		{
    			setColor(Color.BLUE);
    			color++;
    		}
    		else if (color==2)
    		{
    			setColor(Color.GREEN);
    			color++;
    		}
    		else
    		{
    			setColor(Color.BLACK);
    			color = 0;
    		}
    	}
    }
}