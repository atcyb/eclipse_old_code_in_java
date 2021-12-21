package opps;

class Rectangle {
	
	// TODO Auto-generated method stub
	
		int length, width; // Declartion of Variables
		
		void getData(int x, int y) // Defination of Method
		{
			length = x;
			width = y;

		}

		int rectArea() // Defination of another Method
		{
			int Area = length * width;
			return (Area);
		}
    
}

class RectArea {

	public static void main (String args[])
	{
		int area1, area2;
		Rectangle rect1 = new Rectangle(); // Crating objects
		Rectangle rect2 = new Rectangle(); 
		
		rect1.length = 15; //Accessing variables
		rect1.width = 10;
		
		area1 = rect1.length*rect1.width;
		
		rect2.getData(20,12); //Accessing methods
		area2 = rect2.rectArea();
		System.out.println("Area1 = " + area1);
		System.out.println("Area2 = " + area2);
	}
}

