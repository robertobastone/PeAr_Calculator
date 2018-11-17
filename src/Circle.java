
public class Circle extends Shapes 
{

	public float Radius;
	
	public float Perimeter()
	{
		return 2f * 3.1415f * Radius;
	}
	
	public float Area()
	{
		return 3.1415f * Radius * Radius;
	}
}