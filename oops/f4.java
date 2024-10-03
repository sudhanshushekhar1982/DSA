// package oops;
// import java.util.*;

// public class f4 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//     //     Student s2 = new Student("SUDHANSHU");
//     //     Student s3 = new Student(50);
//     //     Student s4  = new Student("ankit kumar",37);
//         s1.name = "sudhanshu";
//         s1.roll = 50;
//         s1.password = "xyz";

//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;
        

//         Student s2  = new Student(s1);
//         s2.password = "heritageinstitute of technology";

//         for(int i =0 ;i<3;i++) {
//             System.out.println(s1.marks[i]);
//         }
       
//     }
// }

// class Student  {
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     // Student() {//constructor
//     //     // this.name = name;
//     //     System.out.println("constructor was called .... !");
//     // }
//     Student(Student s1) {
//         marks  = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i =0;i<marks.length;i++) {
//             this.marks[i]  = s1.marks[i];
//         }
//     }
//     Student() {
//         System.out.println("constructor is beinbg called.. !");
//     }
//     Student(String name) {
//         this.name = name;
//     }
//     Student(int roll) {
//         this.roll = roll;
//     }
//     Student(String name,int roll) {
//         this.name= name;
//         this.roll= roll;
//     }
// }


package oops;
import java.util.*;

public class f4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("SUDHANSHU");
        // Student s3 = new Student(50);
        // Student s4  = new Student("ankit kumar",37);
        
        s1.name = "sudhanshu";
        s1.roll = 50;
        s1.password = "xyz";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copy constructor
        s2.password = "heritage institute of technology";

        for(int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Default constructor
    Student() {
        System.out.println("Default constructor is being called.. !");
        marks = new int[3]; // Initialize marks array
    }

    // Copy constructor
    Student(Student s1) {
        marks = new int[3]; // Initialize marks array
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Overloaded constructors
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

