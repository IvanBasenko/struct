import java.util.Arrays;
import java.util.Scanner;


public class Controller {

    Scanner scanner = new Scanner(System.in);
    public void learner(School sc) {
        System.out.print("Введите имя: ");
        sc.name = scanner.nextLine();
        System.out.print("Группа: ");
        sc.group = scanner.nextLine();
        System.out.print("Оценки: ");
        for (int i = 0; i < 5; i++) {
            sc.subject[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println();
    }
    public void alphabet(School sc) {
        Arrays.sort(sc.subject);
    }

}

