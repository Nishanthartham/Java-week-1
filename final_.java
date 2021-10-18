class A
{
	final int a;
	final int b = 10;
	static final int c;

	 A(){
		 a = 5;
		 System.out.println(a+","+b);
	}
 static {
	c = 3;
			 System.out.println(c);

}

}



class final_ 
{
	public static void main(String[] args) 
	{
		//system.out.println("Hello World!");
		A a = new A();
//system.out.println(a.C());
	}
}
