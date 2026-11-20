public class StatisticalPrediction
        extends HurricanePredictionTemplate implements MachineLearningPredictionModel {


    @Override
    public void fetchData() {
        System.out.println("Fetching data..." );
        fetchDataCommand();
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
