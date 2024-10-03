
package oops;
import java.util.*;
public class f1 {
    public static void main(String [] args) {
        Pen p1 = new Pen();//creating a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        System.out.println(p1.color);

        Students s1 = new Students();
        s1.name = "sudhanshu shekhar";
        System.out.println(s1.name);
        s1.calculatePercentage(94, 97, 100);
        System.out.println(s1.percentage);
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor) {
        color =  newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class Students {
    //properties(attributes)
    String name;
    int age;
    float percentage;

    //functions
    void calculatePercentage(int phy,int chem,int math) {
        percentage = (phy+chem+math) /3;
    }
}
