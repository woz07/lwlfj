package dev.woz07.lwlfj;

/*
* woz07
*
* Background.java
* Change the background color of the logs
*/

public enum Background {
    RESET("\u001B[0m"),
    BLACK("\u001B[40m"),
    RED("\u001B[41m"),
    GREEN("\u001B[42m"),
    YELLOW("\u001B[43m"),
    BLUE("\u001B[44m"),
    MAGENTA("\u001B[45m"),
    CYAN("\u001B[46m"),
    WHITE("\u001B[47m");
    
    private final String ansi;
    Background(String ansi) {
        this.ansi = ansi;
    }
    public String getColor() {
        return ansi;
    }
}
