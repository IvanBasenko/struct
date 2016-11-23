import java.util.Arrays;
import java.util.Scanner;


public class Controller {

    Scanner scanner = new Scanner(System.in);

    public void learner(School sc) {
        System.out.println("Введите имя");
        sc.name =scanner.nextLine();
        System.out.println("group");
        sc.group = scanner.nextLine();
        System.out.println("Оценки");
        for (int i = 0; i < 5; i++) {
            sc.subject[i] = scanner.nextInt();
        }
    }
    public void alphabet(School sc){
        Arrays.sort(sc.subject);
        for (int i = 0; i < 5; i++) {
            System.out.print(sc.subject[i]);
        }
    }
}
