
/**
 * This will draw Christmas night
 * The night with the stars
 * The sleigh lying on the house
 * The north star
 */

import java.awt.*;
import java.applet.*;
import java.util.*;

public class ChristmasEve extends Applet
{
    public ChristmasEve(Graphics g)
    {
        drawChristmasEve(g);
    }
    
    public void drawChristmasEve(Graphics g)
    {
        g.setColor(new Color(0, 51, 102));
        g.fillRect(0,0,1920,1080);
        g.setColor(new Color(237, 244, 245));
        g.fillRect(0,820,1920,260);
    }
}
