public class Student {

    public int age = 32;

    public String age() {
        String updatedValue = String.format("\"---%d---\"%n", age);
        System.out.println(updatedValue);
        return updatedValue;}
}
