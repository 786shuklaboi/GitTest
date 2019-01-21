class Circle
{
 	private double radius;
  	private String color;
  	final double pi=3.14;
  	Circle()
  	{
       this.radius=1;
       this.color ="red";
  	}
  	Circle(double radius)
  	{
       this.radius=radius;
       this.color ="red"; 	
  	}
  	Circle(double radius,String color)
  	{
       this.radius=radius;
       this.color =color; 	 
  	}
    double getradius()
  	{
       return radius;
   	}
   	String getcolor()
  	{
       return color;
   	}
   	void setradius(double r)
   	{
       this.radius=r;
   	}
   	double getArea()
   	{
   		double Area=pi*radius*radius;
   		return Area;
   	}
  }