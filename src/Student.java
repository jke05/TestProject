public class Student {
    String name;
    int studentID;
    int age;

    public Student(String n, int Id, int a){
        this.name = n;
        this.studentID = Id;
        this.age = a;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return studentID;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "This mfs info: " + "\n" + "Name: " + getName() + ", Student ID: " + getID() + ", Age: " + getAge();
    }
}
