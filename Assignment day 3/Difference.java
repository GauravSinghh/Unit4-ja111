package com.masai;

//Static Variables: When a variable is declared as static, then a single copy of the variable is created and
//shared among all objects at a class level. Static variables are, essentially, global variables.
//All instances of the class share the same static variable.
//Important points for static variables :-
//We can create static variables at class-level only. See here
//static block and static variables are executed in order they are present in a program.

/*Instance Variables: Instance variables are non-static variables and are declared in a class outside any method,
 *  constructor or block.
As instance variables are declared in a class, these variables are created when an object of the class is created
 and destroyed when the object is destroyed.
Unlike local variables, we may use access specifiers for instance variables. 
If we do not specify any access specifier then the default access specifier will be used.
Initialisation of Instance Variable is not Mandatory. Its default value is 0
Instance Variable can be accessed only by creating objects.
*/


public class Difference {
	 // static variable
    static int a = m1();
  
    // non-static variable
    int rk = 10;
  
    // static method
    static int m1()
    {
        System.out.println("from m1");
        return 20;
    }
  
    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("------");
        
        
     
        // a non static variable.
        Difference f = new Difference(); //object created for non static variable
  
        
        System.out.println("Non Static variable "
                           + f.rk);
    }

}
