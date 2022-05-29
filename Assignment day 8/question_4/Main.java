package question_4;

public class Main {

	public static void main(String[] args){
		//create an array of Animal class with size 3
		Animal [] animalArr = new Animal[3];
		//initialize all 3 elements of this Animal class with
		//Dog, Cat and Tiger class object.
		animalArr[0] = new Dog();
		animalArr[1] = new Cat();
		animalArr[2] = new Tiger();
		
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].eat();
			animalArr[i].walk();
			animalArr[i].makeNoise();
		}
		
		}
	
}
