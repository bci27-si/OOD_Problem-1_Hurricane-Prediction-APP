public abstract class HurricanePredictionTemplate {
// should i have this class call the command add and execute ?
// connects parts together. would place in the pred hurricane method

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
