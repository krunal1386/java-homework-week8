package week8_Homework_1;

//Java program to overload constructors
class Task18 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Task18(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Task18(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Task18 s1 = new Task18(111, "Karan");
        Task18 s2 = new Task18(222, "Aryan", 25);
        s1.display();
        s2.display();
    }

}
