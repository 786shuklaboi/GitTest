class Test{
	public static void main(String[] args) {
		ResizableCircle c = new ResizableCircle(6);
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
		System.out.println(c.resize(10));
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
	}
}