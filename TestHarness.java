

package collectiontrigfunctions;
import java.util.Scanner;

/*
 * SIMPLE TEST HARNESS TO SHOW HOW TO USE LIBRARY, MUST BE CONVERTED TO DEGREES/RADIANS BEFORE CALLED BY VARIOUS TRIG METHODS
*/
/** COSC 4f00 assignment 2 trig library
 *
 * @author Rahul Chawla / Shivdeep Khangura
 * 5785407 / 5807797
 * November 13th, 2019
 */
/**
 *
 * @author rahulchawla/shivdeep khangura
 */
public class TestHarness {
    
    public static void main(String[] args){
        CollectionTrigFunctions.TrigFunctions TrigLib = new CollectionTrigFunctions.TrigFunctions();
        
        
        System.out.println("Enter 1 for Degrees/ Enter 2 for radians");
        
      
        //must choose if user wants to enter degrees or radians, this choice will be used for all trig functions,
        //must convert value to radians/degrees before called by method
        
        Scanner s = new Scanner(System.in); 
        int choice = s.nextInt();
        double x=0;
        
        switch(choice){
          
            case 1: System.out.println("Enter Degrees");
                    x=TrigLib.xToDegrees(s.nextDouble());
                    
                    
                    
                    System.out.println("Sin:");
                    double sinvaldeg=TrigLib.Sin(x);
                    System.out.println(sinvaldeg);
                    
                    System.out.println("Cos:");
                    double cosvaldeg=TrigLib.Cos(x);
                    System.out.println(cosvaldeg);
                    
                    System.out.println("Tan:");
                    double tanvaldeg=TrigLib.Tan(x);
                    System.out.println(tanvaldeg);
                
                    System.out.println("Sin Inverse answer in deg: Val<1");
                    x=s.nextDouble();
                    double sininversedeg=TrigLib.SinInverse(x);
                    System.out.println(sininversedeg*180/TrigLib.CalculatePi());
                    
                    System.out.println("Cos Inverse answer in deg: Val-1 to 1");
                    x=s.nextDouble();
                    double cosinversedeg=(TrigLib.CosInverse(x));
                    System.out.println(cosinversedeg*180/TrigLib.CalculatePi());
                    
                    System.out.println("Tan Inverse answer in deg: Val:-1 to 1 and any other num");
                    x=s.nextDouble();
                    double taninversedeg=TrigLib.TanInverse(x);
                    System.out.println(taninversedeg*(180/TrigLib.CalculatePi()));
                    
                    System.out.println("Secant answer in deg: Val:-1< or <1");
                    x=TrigLib.xToDegrees(s.nextDouble());
                    double secantdeg=TrigLib.Secant(x);
                    System.out.println(secantdeg);
                    
                    System.out.println("COsecant answer in deg: Val:-1< or <1");
                    x=TrigLib.xToDegrees(s.nextDouble());
                    double cosecantdeg=TrigLib.Cosecant(x);
                    System.out.println(cosecantdeg);
                    
                    System.out.println("COTANGENT answer in deg: Val:-1< or <1");
                    x=TrigLib.xToDegrees(s.nextDouble());
                    double cotdeg=TrigLib.Cot(x);
                    System.out.println(cotdeg);
                    
                   
                 
                    
                    break;
            
            case 2: System.out.println("Enter Radians");
                    x=TrigLib.xToRadian(s.nextDouble());
                    
                    System.out.println("Sin Radians:");
                    double sinvalrad=TrigLib.Sin(x);
                    System.out.println(sinvalrad);
                    
                    System.out.println("Cos Radians:");
                    double cosvalrad=TrigLib.Cos(x);
                    System.out.println(cosvalrad);
                    
                    System.out.println("Tan Radians:");
                    double tanvalrad=TrigLib.Tan(x);
                    System.out.println(tanvalrad);
                    
                    System.out.println("Sin Inverse answer in rad: Val<1");
                    x=s.nextDouble();
                    double sininverserad=TrigLib.SinInverse(x);
                    System.out.println(sininverserad);
                    
                    System.out.println("Cos Inverse answer in rad: Val:-1 to 1");
                    x=s.nextDouble();
                    double cosinverserad=TrigLib.CosInverse(x);
                    System.out.println(cosinverserad);
                  
                    
                    System.out.println("Tan Inverse answer in rad: Val:-1 to 1 and any other num");
                    x=s.nextDouble();
                    double taninverserad=TrigLib.TanInverse(x);
                    System.out.println(taninverserad);
                    
                     System.out.println("Secant answer in rad: Val:-1< or <1");
                    x=TrigLib.xToRadian(s.nextDouble());
                    double secantrad=TrigLib.Secant(x);
                    System.out.println(secantrad);
                    
                     System.out.println("COsecant answer in deg: Val:-1< or <1");
                    x=TrigLib.xToRadian(s.nextDouble());
                    double cosecantrad=TrigLib.Cosecant(x);
                    System.out.println(cosecantrad);
                    
                    System.out.println("COTANGENT answer in deg: Val:-1< or <1");
                    x=TrigLib.xToRadian(s.nextDouble());
                    double cotrad=TrigLib.Cot(x);
                    System.out.println(cotrad);
                    
                 
                    
                    
                    break;
                
            default: 
                double a=TrigLib.MathPower(10,5);
                System.out.println(a);
    }
        
        
             
    }
}
