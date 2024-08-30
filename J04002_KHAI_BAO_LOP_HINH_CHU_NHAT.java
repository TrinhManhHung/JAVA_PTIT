import java.util.*;

class Rectangle {
    //Attribute
    private double width;
    private double height;
    private String color;
    //Method
    Rectangle (){
        this.height = 1;
        this.width = 1;
    }
    Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double findArea (){
        return this.height * this.width;
    }
    public double findPerimeter (){
        return 2 * (this.height + this.width);
    }
    public void chuanHoaColor (){
        StringBuilder sb = new StringBuilder(this.color);
        String newColor = "";
        newColor += Character.toUpperCase(sb.charAt(0));
        for (int i = 1; i < sb.length(); i++) {
            newColor += Character.toLowerCase(sb.charAt(i));
        }
        this.color = newColor;
    }
    public String toString(){
        if(this.height <=0 || this.width <=0 || (int) this.height != this.height || (int) this.width != this.width) 
            return "INVALID";
        return (long) findPerimeter() + " " + (long) findArea() + " " + this.color;
    }
}

public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle x = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextLine().trim());
        x.chuanHoaColor();
        System.out.println(x);
        sc.close();
    }
}