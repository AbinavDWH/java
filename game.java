import java.util.logging.Level;
import java.util.logging.Logger;

public class game {
    private static final Logger LOGGER = Logger.getLogger(game.class.getName());

    public static void main(String[] args) {
        // Configure logger to show only level and message
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$s] %5$s%n");

        // Log messages
        LOGGER.info("This is an informational message.");
        LOGGER.warning("This is a warning message.");
        LOGGER.log(Level.SEVERE, "This is a severe error message.");
    }
}
