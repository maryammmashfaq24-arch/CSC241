public class Task2Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "BAI-018";
        s1.name = "Faiza Shakeel";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "BAI-030";
        s2.name = "Maryam Ashfaq";
        s2.completedCredits = 45;

        System.out.println("Before method calls:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        // Predicted: s1 completedCredits 30 becomes 36
        s1.addCredits(6);
        // Predicted: s2 completedCredits 45 becomes 55
        s2.addCredits(10);

        // Predicted: remaining for s1 = 130 - 36 = 94
        int remainingS1 = s1.remainingCredits(130);
        // Predicted: remaining for s2 = 130 - 55 = 75
        int remainingS2 = s2.remainingCredits(130);

        System.out.println();
        System.out.println("After addCredits on both objects:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println("Remaining credits for s1: " + remainingS1);
        System.out.println("Remaining credits for s2: " + remainingS2);
    }
}