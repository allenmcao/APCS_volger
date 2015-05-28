import java.util.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Units extends Observable
{
	private Puck puck;
	private Paddle paddle1;
	private Paddle paddle2;
	private int screenWidth;
	private int screenHeight;
	private int score1;
	private int score2;
	private Clock clock;
	private final int TIME_INC = 10;

	public Units(int width, int height)
	{
		clock = null;
		screenWidth = width;
		screenHeight = height;
		score1=0;
		score2=0;
		puck = new Puck(Color.RED, new Location(screenWidth/2, screenHeight/2), 6, width, height);
		paddle1 = new Paddle(Color.RED, new Location(0, screenHeight/2+2),width, height);
		paddle2 = new Paddle(Color.RED, new Location(screenWidth-11, screenHeight/2+2),width, height);
	}

	/**
	 *	Returns the puck
	 *	@return returns a puck
	 */
	public Puck getPuck()
	{
		return puck;
	}

	public Paddle getPaddle1()
	{
		return paddle1;
	}

	public Paddle getPaddle2()
	{
		return paddle2;
	}

	public int getScore1()
	{
		return score1;
	}

	public int getScore2()
	{
		return score2;
	}

	public int getScreenWidth()
	{
		return screenWidth;
	}

	public int getScreenHeight()
	{
		return screenHeight;
	}

	public Clock getClock()
	{
		return clock;
	}

	public void setClock(Clock clo)
	{
		clock = clo;
	}

	public void movePaddles(int pad1, int pad2)
	{
		if(pad1==1)
			paddle1.moveUp();
		else if (pad1==-1)
			paddle1.moveDown();
		if(pad2==1)
			paddle2.moveUp();
		else if (pad2==-1)
			paddle2.moveDown();

		// Set changes and notify observers
		setChanged();
		notifyObservers();
	}

	public void movePuck()
	{
		//scoring a point
		if(puck.getX()<=0)
		{
			score2++;
			puck.resetter();
			clock.stop();
			long start = System.currentTimeMillis();
			long end = start + 1*500; // 1000 ms/sec *1/2=half a second
			while (System.currentTimeMillis() < end)
			{
			}
			newClock(TIME_INC);
			clock.start();

		}
		else if((puck.getX()+2*puck.getRadius())>=screenWidth)
		{
			score1++;
			puck.resetter();
			clock.stop();
			long start = System.currentTimeMillis();
			long end = start + 1*500; // 1000 ms/sec *1/2=half a second
			while (System.currentTimeMillis() < end)
			{
			}
			newClock(TIME_INC);
			clock.start();
		}
		//skewers
		if(puck.getX()+puck.getRadius()<paddle1.getX()+paddle1.getWidth()&&puck.getX()+puck.getDiameter()>paddle1.getX()+paddle1.getWidth()&&(puck.getY()+puck.getDiameter()==paddle1.getY()||puck.getY()==paddle1.getY()+paddle1.getHeight()))
		{
			puck.reverseVer();
			puck.move();
		}
		else if (puck.getX()+puck.getRadius()>paddle2.getX()&&puck.getX()<paddle2.getX()&&(puck.getY()+puck.getDiameter()==paddle2.getY()||puck.getY()==paddle2.getY()+paddle2.getHeight()))
		{
			puck.reverseVer();
			puck.move();
		}
		//collision with paddles
		if(puck.getX()<=paddle1.getX()+paddle1.getWidth()&&puck.getY()+puck.getRadius()>=paddle1.getY()&&puck.getY()+puck.getRadius()<=paddle1.getY()+paddle1.getHeight())
		{
			puck.reverseHor();
			//first third
			if(puck.getY()<paddle1.getY()+paddle1.getHeight()/3)
			{
				if(!puck.getVertical()||puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				else if (puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				if(clock.getTime()<10)
					newClock(clock.getTime()*11/10);
			}
			//second third
			else if (puck.getY()<paddle1.getY()+paddle1.getHeight()/3*2)
			{
				if(puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				else if (puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				if(clock.getTime()>2)
					newClock(clock.getTime()*4/5);
			}
			//last third
			else
			{
				if(puck.getVertical()||puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				else if (puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				if(clock.getTime()<10)
					newClock(clock.getTime()*11/10);;
			}

		}
		else if(puck.getX()+puck.getRadius()*2>=paddle2.getX()&&puck.getY()+puck.getRadius()>=paddle2.getY()&&puck.getY()+puck.getRadius()<=paddle2.getY()+paddle2.getHeight())
		{
			puck.reverseHor();
			//first third
			if(puck.getY()<paddle1.getY()+paddle1.getHeight()/3)
			{
				if(!puck.getVertical()||puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				else if (puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				if(clock.getTime()<10)
					newClock(clock.getTime()*11/10);
			}
			//second third
			else if (puck.getY()<paddle1.getY()+paddle1.getHeight()/3*2)
			{
				if(puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				else if (puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				if(clock.getTime()>2)
					newClock(clock.getTime()*3/4);
			}
			//last third
			else
			{
				if(puck.getVertical()||puck.getDiagonalDown())
				{
					puck.setDiagonalUp(true);
					puck.setDiagonalDown(false);
				}
				else if (puck.getDiagonalUp())
				{
					puck.setDiagonalUp(false);
					puck.setDiagonalDown(true);
				}
				if(clock.getTime()<10)
					newClock(clock.getTime()*11/10);
			}

		}
		puck.move();
		setChanged();
		notifyObservers();
	}

	public void reset()
	{
		score1=0;
		score2=0;
		puck.setLocation(screenWidth/2, screenHeight/2);
		newClock(TIME_INC);
		puck.setDiagonalUp(false);
		puck.setDiagonalDown(false);
		paddle1.setLocation(0, screenHeight/2+2);
		paddle2.setLocation(screenWidth-11, screenHeight/2+2);
	}

	public void newClock(int timeIncr)
	{
		clock.stop();
		clock = new Clock(this,timeIncr);
		clock.start();
	}
}