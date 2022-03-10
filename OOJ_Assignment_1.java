/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class complex
{
    private
    double real,imag;
    
      
    public
    complex(double p,double q)
    {
        real=p;
        imag=q;
    }
    complex()
    {
        
    }
    
    static void addition(complex c1,complex c2)
    {
         complex temp = new complex();
         temp.real = c1.real + c2.real;
         temp.imag = c1.imag + c2.imag;
          
         System.out.println("Addition of complex numbers:"+ temp.real+"+"+temp.imag+"i");
//         System.out.println("+"+temp.imag+"i");
    }
    
     static void subtraction(complex c1,complex c2)
    {
         complex temp = new complex();
         temp.real = c1.real - c2.real;
         temp.imag = c1.imag - c2.imag;
          
         System.out.println("Subtraction of complex numbers:"+ temp.real+"+"+temp.imag+"i");
//         System.out.println("+"+temp.imag+"i");
    }
      static void multiplication(complex c1,complex c2)
    {
         
         double real=c1.real*c2.real-c1.imag*c2.imag;
         double imag=c1.real*c2.imag+c1.imag*c2.real;
         complex temp = new complex(real,imag);
          
         System.out.println("Multiplication of complex numbers:"+ temp.real+"+"+temp.imag+"i");
//         System.out.println("+"+temp.imag+"i");
    }
      static void division(complex c1,complex c2)
      {
          double real=(c1.real*c2.real+c1.imag*c2.imag)/(((c2.real)*(c2.real))+((c2.imag)*(c2.imag)));
          double imag=(c1.imag*c2.real-c1.real*c2.imag)/(((c2.real)*(c2.real))+((c2.imag)*(c2.imag)));
          complex temp = new complex(real,imag);
          System.out.println("Divison of complex numbers:"+ temp.real+"+"+temp.imag+"i");
          // System.out.println("+"+temp.imag+"i");
      }
}

public class Complex_1{
    public static void main(String args[])
    {
       complex c1 = new complex(2,3);
       complex c2 = new complex(4,1);
       //complex1 c3 = new complex1();
       
       
       complex.addition(c1,c2);
       complex.subtraction(c1,c2);
       complex.multiplication(c1,c2);
       complex.division(c1,c2);
                          
       
    }
        
}
