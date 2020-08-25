/*
 */
package collectiontrigfunctions;

/** COSC 4f00 assignment 2 trig library
 *
 * @author Rahul Chawla / Shivdeep Khangura
 * 5785407 / 5807797
 * November 13th, 2019
 */
public class CollectionTrigFunctions{
     
    public static class TrigFunctions{
        
         
        /**
         * This function converts the input to radian form
         * @param x
         * @return 
         */
        public double xToRadian(double x){
            return x % (2 * CalculatePi());
        };//xtoRadians
    
    
        /**
         * This function converts the input to degrees form
         * @param x
         * @return double
         */
        public double xToDegrees(double x){
            return x * (2 * CalculatePi()/360);  
        };//xtoDegrees
        
        
        /**
         * This function calculates the exponent y, on base of x
         * @param x
         * @param y
         * @return double product
         */
        public double MathPower(double x, double y){
            double product =1;
            for(int i =0; i <y; i++){
             product*=x;  
            }
            return product;
        };//MathPower

        /**This function approximates pi using the Gregory Rebinez Series (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 + 1/17 ... = pi/4)
        * @param null
        * 
        * @return double pi 
        */
        public double CalculatePi(){
            double pi=0;
            double initdenominator=1; //1/1-> 1
            int count=0;
        
            while(count<99999999){
                if(count%2==0){
                    pi+=(1/initdenominator);
                }
                else {
                pi-=1/initdenominator;}
                initdenominator+=2; //inc by 2
                count+=1;

            }
            return pi*=4;  
        };//CalculatePi
        
        
        /**
         * This function calculates sin x must be converted to deg/rad using helper methods then passed into sin func
         * @param x
         *  x must be converted toDegree/ToRadian before passed to func
         * @return double sum
         */
        public double Sin(double x){
          
            double exp = 3;
            double sum =x;
            double num = MathPower(x,exp);
            double dnum = factorial(exp);

            for (int i = 0; i<15 ; i++) {
                double frac = num/dnum;
                if (exp% 4 == 1) sum += frac;
                if (exp% 4 == 3) sum -= frac;
                    exp+=2;
                    num= MathPower(x,exp);
                    dnum = factorial(exp);
                    frac=num/dnum;    
            }   
            return sum;
        };//Sin
        
        
        /**
         * This function calculates cos x must be converted to deg/rad using helper methods then passed into cos func
         * @param x
         *  x must be converted toDegree/ToRadian before passed to func
         * @return double sum
         */
        public double Cos(double x) {
           
            double exp = 2;
            double sum =1;
            double num = MathPower(x,exp);
            double dnum = factorial(exp);

            for (int i = 0; i<15 ; i++) {
                double frac = num/dnum;
                if (i% 2 == 1) sum += frac;
                if (i% 2 == 0) sum -= frac;
                    exp+=2;
                    num= MathPower(x,exp);
                    dnum = factorial(exp);
                    frac=num/dnum;    
            }   
            return sum;
         };//Cos
        
        
       /**
         * This function calculates tan x must be converted to deg/rad using helper methods then passed into tan func
         * @param x
         *  x must be converted toDegree/ToRadian before passed to func
         * @return double sum
         */
        public double Tan(double x){
            double sin = Sin(x);
            double cos = Cos(x);

            //Tan = sin/cos
            double tan = sin/cos;
            return (tan);
        }//Tan

        
       /**
         * This function calculates arc sin, using Taylor series
         * @param x
         * @return double sum
         */
        //answer in radians from inverses
        public double SinInverse(double x){
            //x must less than 1 
            // sum = x + 1*
            double sum = x; //stores final result 
            double term1 = 1.0;
            double term2 = 2.0;
            double exp = 3.00;
            double frac1 = term1/term2;
            double num= MathPower(x,exp);
            double frac2 = num/exp;
            double pi = CalculatePi();

            for (int i = 0; i<15 ; i++) {
                sum+=frac1*frac2;
                term1+=2;
                term2+=2;
                frac1*=(term1)/(term2);

                exp+=2;

                num= MathPower(x,exp);
                frac2 = num/exp;
            }   
            return sum;
        };//SinInverse
        
        
        /**
         * This function calculates arc cos, using arc sin
         * @param x
         * @return double sum
         */
        //answer in radians from inverses
        public double CosInverse(double x){
            double pi = CalculatePi();
            double sum = pi/2;
            sum-=SinInverse(x);
            return sum;
        };//CosInverse
        
        
        /**
         * This function calculates arc tan, using Taylor Series
         * @param x
         * @return double sum
         */
        //answer in radians from inverses
        public double TanInverse(double x){
           
            double exp=3;
            double pi = CalculatePi();
            double num= MathPower(x,exp);
            
            
            if(x>-1 & x<1){
                double sum=x;
                double frac=num/exp;
                for(int i =0; i<15;i++){
                    if (exp % 4 == 1) sum += frac;
                    if (exp % 4 == 3) sum -= frac;
                    exp+=2;
                    num= MathPower(x,exp);
                    frac=num/exp;    
                }
            return sum;
            }     
            else {
                double sum = pi/2;
                sum-=1/x;
                double frac=1/(exp*(num));
                for(int i =0; i<15;i++){
                    if (exp % 4 == 1) sum -= frac;
                    if (exp % 4 == 3) sum += frac;
                    exp+=2;
                    num= MathPower(x,exp);
                    frac=1/(exp*(num)); 
                }
            return sum;
            }    
        };//TanInverse

        /**
         * This function calculates factorial of a number using a for loop
         * @param n
         * @return double prod
         */
        public double factorial(double n){
             double prod=1;
            for(double i=n;i>0;i--){
                prod*=i;
            }
            return prod;
        };//factorial
        
       
        /**
         * This function calculates secant using cosx
         * @param x
         *  x must be converted toDegree/ToRadian before passed to func
         * @return double
         */
        public double Secant(double x){ 
            return (1/Cos(x));
        };//Secant
        
        
        /**
         * This function calculates Cosecant using sinx
         *  x must be converted toDegree/ToRadian before passed to func
         * @param x
         * @return double
         */
        public double Cosecant(double x){   
            return(1/Sin(x));
        };//Cosecant
        
        /**
         * This function calculates cotangent using cosx/sinx
         * @param x must be converted toDegree/ToRadian before passed to func
         * @return double
         */
        public double Cot(double x){ 
            return (Cos(x)/Sin(x));
        };//Cot

        
   
  
    };//TrigFunctions

};//CollectionTrigFunctions