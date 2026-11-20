public class HurricanePredictionAPP {

    public static void main(String[] args) {
        // create teh output for ML and analog / Statystical prediction models using the template patttern

        StatisticalPrediction s = new StatisticalPrediction();
        MachineLearningPrediction ml = new MachineLearningPrediction();

        s.predictHurricane();
        ml.predictHurricane();


        // not sure if imsupposed to ad the commnads to the list here, but :

        PredictionInvoker p = new PredictionInvoker();

        p.addCommand(Command fetchData);


    }

}



