package question_4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		int x = length*breadth;
		return x;
	}

	@Override
	public int squareArea(int side) {
		int x = side*side;
		return x;
	}

	@Override
	public int circleArea(int radius) {
		int y = (radius*radius*22)/7;
		return y;
	}

}
