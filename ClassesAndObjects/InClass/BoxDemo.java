class BoxDemo
{
	public static void main(String[] args) {
		
	double width,height,depth;
	box b = new box();
	box b1 = new box(width = 2, height = 2, depth = 2);
	box b2 = new box(width = 2, depth = 2);
	

	b.setDim();
	b.volume();
	b1.volume();
	b2.volume();

	}
}