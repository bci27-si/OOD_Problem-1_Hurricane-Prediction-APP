public class StatisticalPrediction
        extends HurricanePredictionTemplate implements MachineLearningPredictionModel {

    // add commands to each from the comadn pattern
    @Override
    public void fetchData() {
        System.out.println("Fetching data..." );

    }

    @Override
    public void preprocessData() {
        System.out.println("Preprocessing data..." );
    }

    @Override
    public void applyPredictionModel() {
        System.out.println("Applying Statistical prediction..." );
    }

    @Override
    public void postProcessResults() {
        System.out.println("Post processing results..." );
    }
}
