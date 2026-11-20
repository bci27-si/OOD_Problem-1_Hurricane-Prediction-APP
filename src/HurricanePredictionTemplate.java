public abstract class HurricanePredictionTemplate {

    public void predictHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postProcessResults();
    }


    // not sure which method is abstract yet.

    public abstract void fetchData();

    public abstract void preprocessData();

    public abstract void applyPredictionModel();

    public abstract void postProcessResults();

}
