import java.util.*;

public class Education {
    public static void main(String[] args) {
        Student[] students = {new Student("John" , 101, 17),
                              new Student("Alan", 102, 18)};

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }
    }
}
