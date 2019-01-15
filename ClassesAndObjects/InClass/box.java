class box{
	double width;
	double height;
	double depth;
	double volume;
	box()
	{
		width = 1;
		height = 1;
		depth = 1;
	}
	

	box(double w, double h, double d)
	{
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	box(double w, double d)
	{
		width = w;
		height = 1;
		depth = d;
	}
	
	void setDim()
	{
		width = 20;
		height = 10;
		depth = 15;

	}
	double volume()
	{ 
		volume = width * height * depth; 
	    System.out.println("Volume : " +volume);
	    return volume;
	}
	
}