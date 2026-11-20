public class PredictionCommand implements Command {

    //run a prediction model. probably either Statystycal, or Machine Learning
    public void prediction() {

        System.out.println("Prediction command");
    }

    @Override
    public void execute() {
        prediction();
    }
}

