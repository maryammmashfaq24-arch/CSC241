public class PassByValueDemo {

    static void changeNumber(int x) {
        x = 99;
    }

    static void changeStudent(Student st) {
        st.completedCredits = 99;
    }

    static void replaceStudent(Student st) {
        st = new Student();
        st.name = "Temporary";
    }

    public static void main(String[] args) {
        // Experiment A: primitive
        int num = 10;
        System.out.println("A - Before: " + num);
        changeNumber(num);
        System.out.println("A - Inside method: x was set to 99 (local copy only)");
        System.out.println("A - After: " + num);

        // Experiment B: object reference, field mutation
        Student st = new Student();
        st.name = "Maryam Ashfaq";
        st.completedCredits = 40;
        System.out.println();
        System.out.println("B - Before: " + st.summary());
        changeStudent(st);
        System.out.println("B - Inside method: st.completedCredits set to 99");
        System.out.println("B - After: " + st.summary());

        // Experiment C: object reference, reassignment attempt
        Student st2 = new Student();
        st2.name = "Original";
        System.out.println();
        System.out.println("C - Before: " + st2.name);
        replaceStudent(st2);
        System.out.println("C - Inside method: st reassigned to a new Student");
        System.out.println("C - After: " + st2.name);
    }
}