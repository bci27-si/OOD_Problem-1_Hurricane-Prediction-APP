public class HurricanePredictionAPP {

    public static void main(String[] args) {
        // create teh output for ML and analog / Statystical prediction models using the template patttern

        HurricanePredictionTemplate s = new StatisticalPrediction();
        HurricanePredictionTemplate ml = new MachineLearningPrediction();
    // fixed. this actually is the whole purpose of using template pattern

        // so lucky for rollback per class.

        // settig up recivere classes
        FetchData fd = new FetchData();
        Predict predict = new Predict();
        SaveResults sr = new SaveResults();

        // adding commands to list in invoker
        PredictionInvoker i = new PredictionInvoker();
        i.addCommand(new FetchDataCommand(fd));
        i.addCommand(new PredictionCommand(predict));
        i.addCommand(new SaveResultsCommand(sr));

        // executing commands in invoker class
        i.executeCommands();

        // this is wrong
        s.predictHurricane();
        ml.predictHurricane();

    }
}
        // not sure if I'm supposed to and the commands to the list here, but :
/*
        well, technically the actual commands should be per template,
         but I think maybe it Should be in the template abstract class, so the commands get executed at least...
         though I guess main would still need to handle or each template handle the adding commands to the actual list...

 */

        //PredictionInvoker p = new PredictionInvoker();
        //FIXME
        //p.addCommand(Command fetchData);


