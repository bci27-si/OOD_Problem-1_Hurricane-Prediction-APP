public abstract class HurricanePredictionTemplate {
// should i have this class call the command add and execute ?
// connects parts together. would place in the pred hurricane method

    // settig up recivere classes
    FetchData fd = new FetchData();
    Predict predict = new Predict();
    SaveResults sr = new SaveResults();

    // adding commands to list in invoker
    PredictionInvoker i = new PredictionInvoker();


    // probably should put the commands in here to connect patterns, but worry later after everything works

    public void predictHurricane(){
        i.addCommand(new FetchDataCommand(fd));
        i.addCommand(new PredictionCommand(predict));
        i.addCommand(new SaveResultsCommand(sr));

        // just thinking rn if the method calls should be here or if i should be explicitly adding the commands and running that...

        fetchData();
        preprocessData();
        applyPredictionModel();
        postProcessResults();

        // executing commands in invoker class
        i.executeCommands();
    }

    // abstract methods... apparently only using this with print statements

    public abstract void fetchData();

    public abstract void preprocessData();

    public abstract void applyPredictionModel();

    public abstract void postProcessResults();

}
