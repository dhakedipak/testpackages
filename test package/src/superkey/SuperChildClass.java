package superkey;

public class SuperChildClass extends SuperParentClass 
{
		String ChildName = "hi this is subclass";
		public void printname()
		{
			System.out.println(super.ChildName);
			System.out.println(ChildName);
		}
		public static void main(String[] args) 
		{
			SuperChildClass x = new SuperChildClass();
			x.printname();
		}
}
