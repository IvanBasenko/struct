import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kilk stud");
        int n = sc.nextInt();
        School[] students = new School[n];
        Controller controller = new Controller();
        for (int i = 0; i < n; i++) {
            students[i] = new School();
            controller.learner(students[i]);
            controller.alphabet(students[i]);
        }
//        School school = new School("hdsjakl");

//       controller.learner(students);
//        controller.alphabet(students);
        View view = new View();

    }
}
