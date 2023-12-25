package dev.woz07.lwlfj;

/*
 * woz07
 *
 * Logger.java
 * The class that handles all the logging
 * This is the class that must be initialized
 */

import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;
import dev.woz07.lwlfj.level.Severity;

public class Logger {
    private Foreground foreground = Foreground.RESET;
    private Background background = Background.RESET;
    
    /*
     * Default constructor
     */
    public Logger() {}
    
    /*
     * Secondary constructor
     */
    public Logger(Foreground foreground, Background background) {
        if (foreground != null) {
            this.foreground = foreground;
        }
        if (background != null) {
            this.background = background;
        }
    }
    
    /*
     * Updates `foreground`
     */
    public void setForeground(Foreground foreground) {
        this.foreground = foreground;
    }
    
    /*
     * Updates `background`
     */
    public void setBackground(Background background) {
        this.background = background;
    }
    
    /**
     * Prints out the details of the log along with correct colour
     * @param    parent      The class who called the logger
     * @param    severity    Contains the level of severity
     * @param    message     The message to be printed out
     */
    public void log(Class<?> parent, Severity severity, String message) {
        System.out.print(foreground.getColor());
        System.out.print(background.getColor());
        System.out.println("Class: " + parent.getName() + " | Severity: " + severity.toString() + " | Message: " + message);
        reset();
    }
    
    /*
     * Resets the colour of the text to default
     */
    public void reset() {
        System.out.print(Foreground.RESET.getColor());
        System.out.print(Background.RESET.getColor());
    }
}