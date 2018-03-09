/*
 *@HenryHuang
 *MathClass.java
 *March 9, 2018
 *This program is uses to calculate the sin,cos,tan while the angle is 45 degrees.
 */

package mathclass;

/**
 *
 * @author shhua8751
 */
import java.text.*;

public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Identifing the variables which will be use in this program.
        double angle;
        double sinAngle;
        double cosAngle;
        double tanAngle;
        
        angle = 45; //The anglr is 45 degree.
        
       
        sinAngle = java.lang.Math.sin(Math.toRadians(angle));
        //This equation is uses to calculate the sin of 45 degrees.
        
        cosAngle = java.lang.Math.cos(Math.toRadians(angle));
        //This equation is uses to calculate the cos of 45 degrees.
        
        tanAngle = java.lang.Math.tan(Math.toRadians(angle));
        //This equation is uses to calculate the tan of 45 degrees.
        
        DecimalFormat x = new DecimalFormat("###.##");
        //This code is to round the number into 2 decimal places.
        
        System.out.println( "While the angle is 45 degree:"+ 
                "\nThe sin of the angle is : " + x.format(sinAngle) + 
                "\nThe cos of the angle is : " + x.format(cosAngle) +
                "\nThe tan of the angle is : " + x.format(tanAngle));
        //Outprint the result from the calculations.
        
        
    }
    
}
