
public class Rectangle extends Shapes 
{
	public float width;
	public float lenght;
	
	public float Perimeter()
	{
		return (width + lenght) * 2;
	}
	
	public float Area() 
	{
		return width * lenght;
	}
}