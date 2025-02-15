import java.util.ArrayList;

/**
 * Represents the Jarvas chatbot.
 */
public class Jarvas {
    /**
     * Executes the Jarvas bot. The full procedure of initialising, processing and terminating is executed.
     *
     * @param args A string representing the command-line arguments from the user.
     * @throws CustomException If an error occurs during the execution of the command.
     */
    public static void main(String[] args) {
        ArrayList<Task> tasks = Handler.initialiseBot();
        try {
            Handler.processInput(tasks);
        } catch (CustomException e) {
            Reply.printException(e);
        } finally {
            Handler.terminateBot(tasks);
        }
    }
}
