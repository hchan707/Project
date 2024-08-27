package MethodsRefresherAreas;
/*Name : Hon Chi Chan
 Date : 06/25/2024
2.3*/
//2. Create a java class called Areas
public class Areas {
    //3. Create a method for the following

    //Method must have return instead of print
    public static double areaCricle(double radius){
        double _PI = 3.14;
        return Math.PI * Math.pow(radius,2);
    }

    public static double areaSquare(double side_lenght){
        double area = Math.pow(side_lenght,2);
        return area;
    }

    public static double areaTriangle(double base, double tri_height){
        double area = (base * tri_height)/2;
        return area;
    }

    public static double areaRectangle(double rec_height, double rec_width){
        double area = rec_height * rec_width;
        return area;
    }
    
    public static double areaTrapezoid(double top_lenght, double bottom_lenght, double tra_height){
        double area = ((top_lenght + bottom_lenght)*tra_height)/2;
        return area;
    }
}
