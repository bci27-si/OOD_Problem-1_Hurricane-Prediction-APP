public class MachineLearningPrediction
        extends HurricanePredictionTemplate {
    @Override
    public void fetchData() {
        System.out.println("ML TEMPLATE; Fetching ML data...");
    }
// ML Means Machine Learning
    @Override
    public void preprocessData() {
        System.out.println("ML TEMPLATE; Preprocessing ML data...");

    }

    @Override
    public void applyPredictionModel() {
        System.out.println("ML TEMPLATE; Applying ML prediction...");
    }

    @Override
    public void postProcessResults() {
        System.out.println("ML TEMPLATE; Finished applying ML prediction...");
    }

    // probably:
    /**
     * This will utilize data from its own class and data from the Statystical for analog data
     */


}
