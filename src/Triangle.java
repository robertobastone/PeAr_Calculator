public class Triangle extends Shapes 
{
	public float side1;
	public float side2;
	public float side3;
	
	public float Perimeter()
	{
		return side1 + side2 +side3;
	}
	
	public float Area()
	{
		float semiperimeter = Perimeter()/2;
		return (float) Math.sqrt( 
				semiperimeter*
			   (semiperimeter-side1)*
			   (semiperimeter-side2)*
			   (semiperimeter-side3)
			   );
	}
}
