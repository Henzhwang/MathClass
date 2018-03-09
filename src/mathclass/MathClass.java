/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        double angle;
        double sinAngle;
        double cosAngle;
        double tanAngle;
        
        angle = 45;
        
        
        sinAngle = java.lang.Math.sin(Math.toRadians(angle));
        cosAngle = java.lang.Math.cos(Math.toRadians(angle));
        tanAngle = java.lang.Math.tan(Math.toRadians(angle));
        
        DecimalFormat x = new DecimalFormat("###.##");
        
        System.out.println( "While the angle is 45 degree:"+ 
                "\nThe sin of the angle is : " + x.format(sinAngle) + 
                "\nThe cos of the angle is : " + x.format(cosAngle) +
                "\nThe tan of the angle is : " + x.format(tanAngle));
        
        
    }
    
}
