public abstract class HurricanePredictionTemplate {

    public void predictHurricane(){
        fetchData();
        preprocessData();
        applyPredictionModel();
        postProcessResults();
    }

    // abstract methods... apparently only using this with print statements

    public abstract void fetchData();

    public abstract void preprocessData();

    public abstract void applyPredictionModel();

    public abstract void postProcessResults();

}
