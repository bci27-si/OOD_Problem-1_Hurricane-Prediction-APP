public class StatisticalPrediction
        extends HurricanePredictionTemplate {

    // add commands to each from the comadn pattern
    @Override
    public void fetchData() {
        System.out.println("STAT TEMPLATE; Fetching statistical data..." );
    }

    @Override
    public void preprocessData() {
        System.out.println("STAT TEMPLATE; Preprocessing statistical data..." );
    }

    @Override
    public void applyPredictionModel() {
        System.out.println("STAT TEMPLATE; Applying Statistical prediction..." );
    }

    @Override
    public void postProcessResults() {
        System.out.println("STAT TEMPLATE; Post processing statistical results..." );
    }
}
