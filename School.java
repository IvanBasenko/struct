public class School implements Comparable<School> {
    String name;
    String group;
    int[] subject = new int[5];

    @Override
    public int compareTo(School o) {
        return this.name.compareTo(o.name);
    }
}
