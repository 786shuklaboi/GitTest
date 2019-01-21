class Cylinder extends Circle
{
	private double height;

	Cylinder()
	{
		super();
		this.height=1;
	}
     Cylinder( double radius)
     {
     	super(radius);
     	this.height=1;
     }
     double getheight()
     {
     	return height;
     }
     void setheight(double h)
     {
     	this.height=1;
     }
     
}
