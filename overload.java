//Costructor and method overloading 
class rect
{
	int length;
	int breadth;
	int height = 1;// int height , height =1 ->error

	public rect(){
		System.out.println("In base constructor ");
	}


	/*public rect()
	{
				System.out.println("In base1 constructor ");

	}*/


	public rect(int a,int b){//overloading constructor 
		System.out.println("In overloaded/parameterized constructor ");

	length = a;
	breadth = b;
	}


	public int area(){
	return length*breadth;
	}


	public int area(int l,int b){//overloading method
	return l*b;
	}

}
class  overload
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		rect obj = new rect();
		rect o = new rect(2,3);

		System.out.println(o.length+"->"+o.breadth);
		System.out.println(o.area());
		System.out.println(obj.area(3,4));
		System.out.println(obj.height);
		o.length = 5;
		System.out.println("new "+o.length+"->"+o.breadth);



		}
}
