public class MachineLearningPrediction
        extends HurricanePredictionTemplate implements MachineLearningPredictionModel {
    @Override
    public void fetchData() {
        System.out.println("Fetching data...");
    }

    @Override
    public void preprocessData() {
        System.out.println("Preprocessing data...");
    }

    @Override
    public void applyPredictionModel() {
        System.out.println("Applying prediction...");
    }

    @Override
    public void postProcessResults() {
        System.out.println("Finished applying prediction...");
    }


    // probably:
    /**
     * This will utilize data from its own class and data from the Statystical for analog data
     */


}
