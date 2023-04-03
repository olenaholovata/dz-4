public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        String newValue = String.format("\"~~~%d~~~\"%n", student.age);
        System.out.println(newValue);
        student.age();
    }
}
