# lwlfj
#### Light Weight Logging For Java

#### What is it
LWLFJ is a logging library for Java applications, you can use it to log content to the terminal.
It offers customization so you can alter what type of output you receive, things like; background color, foreground color and severity are all customizable.

#### How to use it
Install `lwlfj` and add it to your module dependencies and you can begin using it

## Examples
#### Starting out
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.level.Severity;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(Example.class, Severity.INFO, "This is a basic log from the Example class");
    }
}
```
