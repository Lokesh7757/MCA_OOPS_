/*Write a program in Java with class Rectangle with the data fields width, 
length, area and colour. The length, width and area are of double type and 
colour is of string type. The methods are get_length(), get_width(), 
get_colour() and find_area(). Create two objects of Rectangle and compare 
their area and colour. If the area and colour both are the same for the 
objects then display “Matching Rectangles”, otherwise display “Nonmatching Rectangle”.*/


import java.util.*;

public class Rectangle
{
    public float length,width,height,area;
    public String color;
    Scanner sc=new Scanner(System.in);
    public void get_length()
    {
        System.out.println("Enter the length of Rectangle:");
        length=sc.nextFloat();
    }
    public void get_width()
    {
        System.out.println("Enter the width of Rectangle:");
        width=sc.nextFloat();
    }
    public void get_color()
    {
        System.out.println("Enter the Colour of Rectangle:");
        color=sc.next();
    }
    public float find_area()
    {
        area=length*width;
        return area;
    }
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        r1.get_length();
        r1.get_width();
        r1.get_color();
        System.out.println("Area of  Rectangle 1:   "+r1.find_area());
        System.out.println("\n");

        Rectangle r2=new Rectangle();
        r2.get_length();
        r2.get_width();
        r2.get_color();
        System.out.println("Area ofRectanngle 2:"+r2.find_area());

        if((r1.area==r2.area)&& r1.color.compareTo(r2.color)==0)
        {
            System.out.println("Matching Rectangles");
        }
        else
        {
            System.out.println("Non-matching Recatngles");
        }
    }
}
