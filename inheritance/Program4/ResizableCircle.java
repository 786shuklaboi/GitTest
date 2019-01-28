class ResizableCircle extends Circle implements Resizable{
	ResizableCircle(double radius){
		super(radius);
		this.radius = radius;
	}
    public double resize(double percent){
    	radius = (percent/100)*radius - radius;
    	return radius;
    }
}