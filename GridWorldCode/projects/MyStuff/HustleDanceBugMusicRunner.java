import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class HustleDanceBugMusicRunner
{
    private String filename;
    private Player player; 

    // constructor that takes the name of an MP3 file
    public HustleDanceBugMusicRunner(String filename) 
    {
        this.filename = filename;
    }

    public void close() 
    { 
    	if (player != null)
    		player.close(); 
    }

    // play the MP3 file to the sound card
    public void play() 
    {
        try {
            FileInputStream fis     = new FileInputStream(filename);
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        } catch (Exception e) 
        {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // run in new thread to play in background
        new Thread() {
            public void run()
            {
                try { 
                	player.play();
                }
                catch (Exception e) 
                { 
                	System.out.println(e);
                }
            }
        }.start();
    }
    
    public static void main(String[] args)
    {
        HustleDanceBugMusicRunner mp3 = new HustleDanceBugMusicRunner("track1.mp3");
        mp3.play();

        ActorWorld world = new ActorWorld();
        HustleDanceBug johnTravolta = new HustleDanceBug();
        johnTravolta.setColor(Color.BLACK);
        world.add(new Location(4, 4), johnTravolta);
        world.show();
    }
}