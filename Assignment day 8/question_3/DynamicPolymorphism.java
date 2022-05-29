package question_3;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*Dynamic Polymorphism
Dynamic polymorphism is a process or mechanism in which a call to an overridden method is to resolve at runtime rather than compile-time. It is also known as runtime polymorphism or dynamic method dispatch. We can achieve dynamic polymorphism by using the method overriding.

In this process, an overridden method is called through a reference variable of a superclass. The determination of the method to be called is based on the object being referred to by the reference variable.

Properties of Dynamic Polymorphism
It decides which method is to execute at runtime.
It can be achieved through dynamic binding.
It happens between different classes.
It is required where a subclass object is assigned to a super-class object for dynamic polymorphism.
Inheritance involved in dynamic polymorphism.
Method Overriding
It provides a specific implementation to a method that is already present in the parent class. it is used to achieve run-time polymorphism. Remember that, it is not possible to override the static method. Hence, we cannot override the main() method also because it is a static method.

Rules for Method Overriding
The name of the method must be the same as the name of the parent class method.
The number of parameters and the types of parameters must be the same as in the parent class.
There must exist an IS-A relationship (inheritance).*/