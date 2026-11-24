public class PredictionCommand implements Command {

    private Predict fetch;

    public PredictionCommand(Predict fetch) {
        this.fetch = fetch;
    }

    @Override
    public void execute() {
        fetch.prediction();
    }
}

