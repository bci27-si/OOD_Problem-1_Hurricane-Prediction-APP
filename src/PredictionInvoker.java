import java.util.List;

public class PredictionInvoker{

    private Command[] commands;

    public PredictionInvoker(int commandCount) {
        commands = new Command[commandCount];

    }

    // eaxmple: List<Customer> subscribers = new ArrayList<>();
    //List<Command> commands;
// Because the commands are using the command interface,
    public void addCommand(int commandCount, Command command) {
        // add commands to the list of commands
        commands.add(command);

    }
    // executes all commands in the list, using the length of the list as an iterable
    public void executeCommands(){
        for (Command command : commands){
            command.execute();
        }

    }

}

/*

manage and execute tasks in the correct order. This class will:
Allow commands (representing each task) to be added to a list using addCommand().
Execute all commands in sequence using executeCommands().
The PredictionInvoker class provides flexibility to track, add, or remove individual steps without changing the overall workflow.


 commands.add(fdc);
        commands.add(pc);
        commands.add(src);
        //commands.add(command);
 */
