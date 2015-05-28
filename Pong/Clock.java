import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Clock implements ActionListener
{
	private Timer timer;
	private int timeIncr;  // in milliseconds
	private Units unit;

	/**
	 *	Creates a timer object with the given data
	 *	@param dt the interval duration time in milliseconds that timer fires
	 */
	public Clock(int dt)
	{
		unit = null;
		timeIncr = dt;
		timer = new Timer(timeIncr, this);
	}

	/**
	 *	Creates a timer object with the given data
	 *	@param uni the Units object with a puck to be tracked
	 *	@param dt the interval duration time in milliseconds that timer fires
	 */
	public Clock(Units uni, int dt)
	{
		unit = uni;
		timeIncr = dt;
		timer = new Timer(timeIncr, this);
	}

	public void setUnits(Units uni)
	{
		unit=uni;
	}

	public void setTime(int herp)
	{
		timeIncr=herp;
		timer = new Timer(timeIncr, this);
	}

	public int getTime()
	{
		return timeIncr;
	}

	/**
	 *	Starts the timer
	 */
	public void start()
	{
		timer.start();
	}

	/**
	 *	Stops the timer
	 */
	public void stop()
	{
		timer.stop();
	}

	/**
	 *	Called automatically when the timer fires.
	 *	@param e contains the action event
	 *	@post-condition Move the balloons every time the timer goes off
	 */
	public void actionPerformed(ActionEvent e)
	{
		// Tell the model to move the puck.
		if(e.getSource()==timer)
			unit.movePuck();
	}
}
