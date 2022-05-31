package question_4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape s1 = new Area();
		System.out.println("Enter radius");
		int radius = scan.nextInt();
		
//		System.out.println("Enter Rectangle length");
//		int length = scan.nextInt();
//		System.out.println("Enter breadth");
//		int breadth = scan.nextInt();
//		
//		System.out.println("Enter square side");
//		int side = scan.nextInt();
//		System.out.println("--------");
		
		System.out.println("Area of Circle :"+s1.circleArea(radius));
//		System.out.println("Area of Rectangle :" +s1.rectangleArea(length, breadth));
//		System.out.println("Area of square :"+s1.squareArea(side));

	}

}
