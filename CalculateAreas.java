package MethodsRefresherAreas;

//4. Create another class called CalculateAreas
public class CalculateAreas {
    //5. Have the main class called CaculateAreas class
    public static void main(String[] args){
        //6. Initialize variables for the appropriate sides 
        double cricle_r = 7.5;
        double square_len = 8.5;
        double tri_b = 10.3, tri_h = 5.6;
        double rec_h = 7, rec_w = 8;
        double trap_top = 5, trap_bot = 10, trap_h = 20;

        //7. Initialize variables for the 5 areas from the Area class
        double cricle = Areas.areaCricle(cricle_r);
        double square = Areas.areaSquare(square_len);
        double triangle = Areas.areaTriangle(tri_b, tri_h);
        double rectangle = Areas.areaRectangle(rec_h, rec_w);
        double trapezoid = Areas.areaTrapezoid(trap_top, trap_bot, trap_h);

        //8. print out the 5 areas
        System.out.println("Circle: " + cricle);
        System.out.println("Square: " + square);
        System.out.println("Triangle: " + triangle);
        System.out.println("Rectangle: " + rectangle);
        System.out.println("Trapezoid: " + trapezoid);
    }

}