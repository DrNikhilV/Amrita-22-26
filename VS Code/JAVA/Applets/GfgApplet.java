// Java program to run the applet
// using the applet viewer

import java.awt.*;
import java.applet.*;
public class GfgApplet extends Applet
{
	String msg="";
	public void init()
	{
		msg="Hello Students";
	}

	public void start()
	{
		msg=msg+",Welcome to Applets Concepts in Java";
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,20,20);
	}
	
}
/*
<applet code="GfgApplet" width=300 height=100>
</applet>
*/
