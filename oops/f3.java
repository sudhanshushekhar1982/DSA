package oops;
import java.util.*;
public class f3 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        //p1.setColor("red");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        this.color =  newColor;
    }
    void setTip(int newTip) {
        this.tip = newTip;
    }
}
