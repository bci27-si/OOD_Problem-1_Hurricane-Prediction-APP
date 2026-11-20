public class MachineLearningPrediction
        extends HurricanePredictionTemplate implements MachineLearningPredictionModel {
    @Override
    public void fetchData() {
        System.out.println("Fetching ML data...");
    }
// ML Means Machine Learning
    @Override
    public void preprocessData() {
        System.out.println("Preprocessing ML data...");
    }

    @Override
    public void applyPredictionModel() {
        System.out.println("Applying ML prediction...");
    }

    @Override
    public void postProcessResults() {
        System.out.println("Finished applying ML prediction...");
    }

    // probably:
    /**
     * This will utilize data from its own class and data from the Statystical for analog data
     */


}
