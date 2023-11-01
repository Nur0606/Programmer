public class Programmer {
    String name;
    String surname;
    int age;
public void vozrast(){
    int a = (age - 2023);
    System.out.println(a);
}
    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
