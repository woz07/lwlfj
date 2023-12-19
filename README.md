# lwlfj
## Light Weight Logging For Java

> Lwlfj uses Java 11

## What is it
Lwlfj is a logging library for Java applications, you can use it to log content to the terminal.
It offers customization so you can alter what type of output you receive, things like; background color, foreground color and severity are all customizable.

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

---

### Default Java
1. Create a `lib` folder within your project
2. Install the release of your choice
3. Drag and drop the `.jar` file into your `lib` folder
4. Configure your project to use the `.jar` file

## Documentation
To get started you need to create an object of `Logger.java`
```java
import dev.woz07.lwlfj.Logger;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
    }
}
```

The code above just simply creates a simple Logger object which we can use to log information to the terminal
but what do we do if we want to colourize the output? We can set the foreground and background of the text using the provided methods 
`setForeground(Foreground f)` and `setBackground(Background b)`, here is example code which utilizes them
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.setForeground(Foreground.BLACK);
        logger.setBackground(Background.WHITE);
    }
}
```

We can update the foreground and background anytime we want by using the methods provided above

Additionally, we could also preset the foreground and background when we initialize the Logger object
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger(Foreground.BLACK, Background.WHITE);
    }
}
```

Lastly, there is the log function, which logs out the information to the terminal, we can do this by calling the `log(Class<?> c, Severity s, String m)` 
function. The param `Class<?> c` expects you to give the class where the log was called from 
to make your life easier, as it will help you in debugging or whatever you are attempting to do. The param `Severity s` is the severity of the log 
and finally the param `String m` is the output you want printed out to the screen
```java
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.level.Severity;

public class Example {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(Example.class, Severity.INFO, "Example has started");
    }
}
```
