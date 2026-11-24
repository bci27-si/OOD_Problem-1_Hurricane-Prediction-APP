public class SaveResultsCommand implements Command {


    // this is a concrete command class which stores the variable of the reciever [class containing the actual logic] and executes the command
    private SaveResults save;

    public SaveResultsCommand(SaveResults save) {

        this.save = save;
    }

    @Override
    public void execute() {
        save.SaveResults();
    }
}
