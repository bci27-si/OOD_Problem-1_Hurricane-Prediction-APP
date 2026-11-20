import java.util.List;

public class PredictionInvoker implements Command{

    // eaxmple: List<Customer> subscribers = new ArrayList<>();



    FetchDataCommand fdc = new FetchDataCommand();
    PredictionCommand pc = new PredictionCommand();
    SaveResultsCommand src = new SaveResultsCommand();

    public void addCommand() {
        // add commands to the list of commands


    }
    public void executeCommands(){

    }

    public PredictionInvoker() {

    }


    @Override
    public void execute() {

    }
}

/*

manage and execute tasks in the correct order. This class will:
Allow commands (representing each task) to be added to a list using addCommand().
Execute all commands in sequence using executeCommands().
The PredictionInvoker class provides flexibility to track, add, or remove individual steps without changing the overall workflow.


 */
