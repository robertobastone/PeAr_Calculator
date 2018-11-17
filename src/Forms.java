import java.util.Scanner;

public class Forms 
{
	public Shapes[] forme;
	Scanner scan = new Scanner(System.in);             

	public int HowMany()
	{
		System.out.print("How many shapes do you want to choose? ");
		int howmany = scan.nextInt();
		return howmany;
	}
	
	int times = HowMany(); 
	
	public Forms()
	{
		forme = new Shapes[times];
	}

	public void TheCircle(int i)
	{
		System.out.println("You have chosen the circle");
		System.out.print("Insert the radius: ");
		float radius = scan.nextFloat();                   
		Circle	shape = new Circle();
		shape.Radius = radius;
		forme[i] = shape;
	}


	public void TheRectangle(int i)
	{
		System.out.println("You have chosen the rectangle");
		System.out.print("Insert the width: ");
		float width = scan.nextFloat();                      // nextInt metodo di scan
		System.out.print("Insert the lenght: ");
		int lenght = scan.nextInt();  
		Rectangle shape1 = new Rectangle();
		shape1.width = width;
		shape1.lenght = lenght;
		forme[i] = shape1;
	}

	public void TheSquare(int i)
	{
		System.out.println("You have chosen the square");
		System.out.print("Insert the side: ");
		float side = scan.nextFloat(); 
		Square shape2 = new Square();
		shape2.sides = side;
		forme[i] = shape2;
	}

	public void Printing()
	{
		System.out.println("------------------------------------------------------");
		for(int i = 0; i < times; ++i ) 
		{
			System.out.println("Perimeter of shape #"+ (i+1) + ": "+ forme[i].Perimeter());
			System.out.println("Surface of shape #"+ (i+1) + ": "+ forme[i].Area());
			System.out.println("------------------------------------------------------");
		}
	}
	
	public void Geometry()
	{
		for(int i = 0; i < times; ++i ) 
		{
			System.out.print("Which shape? ");
			String operazione = scan.next();
			switch(operazione)
			{
			case "C":
			case "c":
				TheCircle(i);
				break;
			case "r":
			case "R":
				TheRectangle(i);
				break;
			case "s":
			case "S":
				TheSquare(i);
				break;
			default:
				System.out.println("ERROR! Type in valid shape.");
				break;
			}
		}
		Printing();
	}
}
