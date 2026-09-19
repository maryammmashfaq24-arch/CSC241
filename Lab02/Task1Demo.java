public class Task1Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "BAI-018";
        s1.name = "Faiza Shakeel";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "BAI-030";
        s2.name = "Maryam Ashfaq";
        s2.completedCredits = 45;

        Student s3 = new Student();
        s3.studentId = "BAI-031";
        s3.name = "Maryam Mumtaz";
        s3.completedCredits = 60;

        System.out.println("Before change:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println(s3.summary());

        s2.completedCredits = s2.completedCredits + 15;

        System.out.println();
        System.out.println("After change (only s2 modified):");
        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println(s3.summary());
// s1, s2 and s3 are three separate objects, and each one keeps its own
// copy of completedCredits, so updating s2 leaves s1 and s3 untouched.
}
}
       