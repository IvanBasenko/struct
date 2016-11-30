import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество студентов в группе: ");
        int n = sc.nextInt();
        School[] students = new School[n];
        Controller controller = new Controller();
        View view = new View();
        for (int i = 0; i < n; i++) {
            students[i] = new School();
            controller.learner(students[i]);
            controller.alphabet(students[i]);
        }
        Arrays.sort(students);
        for (int i = 0; i < n; i++) {
            verification(students[i], view, n);
        }

    }

         static int count = 0;

    public static void verification(School sc, View view, int n) {

        for (int i = 0; i < 1; i++) {
            if (sc.subject[i] <= 2) {
                view.display(sc);
            } else {
                count++;
            }
        }
        if (count == n)
            System.out.println("В группе нет студентов с неудолитворительными оценками");
    }
}
