package Maven_Project_01.Maven_Demo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTest {

	@Test(priority=1)
	public void add_1() {
 
		System.out.println("Addition of two number");
		int a=10,b=20;
		Assert.assertEquals(30,a+b);
		
	}
	
	@Test(priority=2)
	public void sub_2() {
 
		System.out.println("Substraction of two number");
		int a=10,b=20;
		Assert.assertEquals(10,b-a);
		
	}
	@Test(priority=3)
	public void multi_3() {
 
		System.out.println("Multipication of two number");
		int a=10,b=20;
		Assert.assertEquals(200,a*b);
		
	}
	@Test(priority=4)
	public void div_4() {
 
		System.out.println("Division of two number");
		int a=10,b=20;
		Assert.assertEquals(2,b/a);
	}	
		@Test(priority=5)
		public void div_5() {
	 
			System.out.println("Mod of two number");
			int a=10,b=20;
			Assert.assertEquals(0,b%a);
		
	}
}
