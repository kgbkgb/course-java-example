package ex4_5;

import javax.swing.*;

public class DisplayMessage extends JApplet {

    /** Initialize the applet */
    @Override
    public void init() {
        // Get parameter values from the HTML file
        String message = getParameter("MESSAGE");
        int x = Integer.parseInt(getParameter("X"));
        int y = Integer.parseInt(getParameter("Y"));

        // Create a message panel
        MessagePanel messagePanel = new MessagePanel(message);
        messagePanel.setXCoordinate(x);
        messagePanel.setYCoordinate(y);

        // Add the message panel to the applet
        add(messagePanel);
    }
}
