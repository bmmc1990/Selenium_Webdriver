package testy;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(dependsOnMethods= {"first"})
	public void second()
	{
		System.out.println("This is second method depends on first method" );
	}
	@Test
	public void first()
	{
		System.out.println("This should be executed firstly");
	}
	@Test(dependsOnMethods= {"second"})
	public void third()
	{
		System.out.println("This is the third method executed after second method");
	}

}
