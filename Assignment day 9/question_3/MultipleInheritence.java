package question_3;

public class MultipleInheritence {

/*
 * The reason behind this is to prevent ambiguity. 
 * Consider a case where class B extends class A and Class C 
 * and both class A and C have the same method display().
 *  Now java compiler cannot decide, which display method it 
 *  should inherit. To prevent such situation, multiple 
 *  inheritances is not allowed in java
 *  
 *  
 *  Consider a scenario where A, B, and C are three classes. The C class inherits A and B
classes. If A and B classes have the same method and you call it from child class
object, there will be ambiguity to call the method of A or B class.
Since compile-time errors are better than runtime errors, Java renders compile-time
error if you inherit 2 classes. So whether you have same method or different, there will
be compile time error.

 */
	

}
