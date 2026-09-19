public class AIExperimentDemo {

    void trainMore(AIExperiment exp, int epochs) {
        exp.completedEpochs = exp.completedEpochs + epochs;
        System.out.println("Inside trainMore: " + exp.status());
    }

    public static void main(String[] args) {
        AIExperimentDemo demo = new AIExperimentDemo();

        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "Image Classifier";
        exp1.completedEpochs = 5;
        exp1.targetEpochs = 20;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "Text Sentiment Model";
        exp2.completedEpochs = 10;
        exp2.targetEpochs = 25;

        System.out.println("Initial state:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(5);
        System.out.println();
        System.out.println("After exp1.runEpochs(5) - exp2 must be unchanged:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp2.runEpochs(5, 3);
        System.out.println();
        System.out.println("After exp2.runEpochs(5, 3) - exp1 must be unchanged:");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        System.out.println();
        System.out.println("Remaining epochs:");
        System.out.println(exp1.experimentName + " remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.experimentName + " remaining: " + exp2.remainingEpochs());

        System.out.println();
        System.out.println("Before trainMore: " + exp1.status());
        demo.trainMore(exp1, 4);
        System.out.println("After trainMore: " + exp1.status());
    }
}