package dev.woz07.lwlfj;

/*
* woz07
*
* Foreground.java
* Change the foreground color of the logs
*/

public enum Foreground {
    RESET("\u001B[0m"),
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");
    
    private final String ansi;
    Foreground(String ansi) {
        this.ansi = ansi;
    }
    public String getColor() {
        return ansi;
    }
}
