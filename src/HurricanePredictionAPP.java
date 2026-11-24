public class HurricanePredictionAPP {

    public static void main(String[] args) {
        // create teh output for ML and analog / Statystical prediction models using the template patttern

        HurricanePredictionTemplate s = new StatisticalPrediction();
        HurricanePredictionTemplate ml = new MachineLearningPrediction();
    // fixed. this actually is the whole purpose of using template pattern

        s.predictHurricane();
        ml.predictHurricane();


        // not sure if imsupposed to ad the commnads to the list here, but :

        PredictionInvoker p = new PredictionInvoker();
        //FIXME
        //p.addCommand(Command fetchData);


    }

}



