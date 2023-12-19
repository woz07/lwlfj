# lwlfj
## Light Weight Logging For Java

---

## What is it
Lwlfj is a logging library for Java applications, you can use it to log content to the terminal.
It offers customization so you can alter what type of output you receive, things like; background color, foreground color and severity are all customizable.

---

## How to use it
### Local Maven
1. Git clone `https://www.github.com/woz07/lwlfj` into your local machine
2. Run the maven command `clean install`, which will install the jar to your local maven repository
3. In your `pom.xml` add the dependency:
   ```xml
        <dependency>
            <groupId>dev.woz07.lwlfj</groupId>
            <artifactId>lwlfj</artifactId>
            <version>1.0</version>
        </dependency>
   ```

### Clean Java

THIS NEEDS TO GO
## How to use it
1: Git clone this repository into your local machine `https://www.github.com/woz07/lwlfj`
        a: In intelliJ to the right side there should be something called 'Maven', open it up and then click on 'Execute Maven Goal' then type in `clean install` and hit enter, this will automatically create a local repository for you with the correct jar
        b: In other IDE's I believe you will need to build the project as a maven clean build, which does the same thing as above.
2: Now all you need to do is create a maven project and within your `pom.xml` file inside of <dependencies> add this:
```xml
        <dependency>
            <groupId>dev.woz07.lwlfj</groupId>
            <artifactId>lwlfj</artifactId>
            <version>1.0</version>
        </dependency>
```
### ALTERNATIVELY
You could use it with straight up Java
1: Create a `lib` folder in your projects folders
2: Install `lwlfj-1.0.jar` from inside of `/target`
3: Place the jar file within the `lib` folder

### ON INTELLIJ
Go to file > Project Structure > Modules
Click on the + which is located above export
Select JAR or directories find the `lib` folder and select on `lwlfj-1.0.jar`

---

## Examples
### Starting out
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

You can alter what type of colors the console prints out the messages in by utilizing the provided methods, you could also set the color within the constructor.
This is what it would look like if you were to set the color within the constructor
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;
import dev.woz07.lwlfj.level.Severity;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger(Foreground.WHITE, Background.BLACK);
        logger.log(Example.class, Severity.INFO, "This is a message with white foreground and black background");
    }
}
```
If you wanted to set the values outside of the constructor or even update the values later on you can do them simply by calling 2 methods `setBackground(Background b)` and `setForeground(Foreground f)`
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;
import dev.woz07.lwlfj.level.Severity;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(Example.class, Severity.INFO, "This is a basic plain log");
        logger.setForeground(Foreground.BLUE);
        logger.setBackground(Background.RED);
        logger.log(Example.class, Severity.DEBUG, "This is a coloured log");
        logger.setForeground(Foreground.RESET);
        logger.setBackground(Background.RESET);
        logger.log(Example.class, Severity.WARNING, "This is a basic plain log");
    }
}
```
