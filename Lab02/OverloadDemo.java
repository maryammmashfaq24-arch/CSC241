public class OverloadDemo {

    // enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled using course code: " + courseCode);
    }

    // enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println("Enrolled in " + courseCode + ", section " + section);
    }

    // enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println("Enrolled using numeric code: " + numericCourseCode);
    }
    // int enroll(String courseCode) {
      //  return 0;
 //   }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        // Valid calls
        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);

            }
}