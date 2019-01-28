class Circle implements GeometricObject{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public double getPerimeter(){
		double peri = 2*3.14*radius;
		return peri;
	}
	public double getArea(){
		double a = 3.14*radius*radius;
		return a;
	}
}