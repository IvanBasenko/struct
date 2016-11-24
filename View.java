import java.util.Arrays;

public class View {
    public void display(School stud) {
        String text;
        text = stud.name + " " + stud.group + " " + Arrays.toString(stud.subject);
        System.out.println(text);
    }
}
