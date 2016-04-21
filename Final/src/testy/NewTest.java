package testy;



import org.testng.annotations.Test;

public class NewTest {
  @Test (groups ={"Cricket"})
  public void f() {
	  System.out.println("I am playing cricket");
  }
  @Test (groups = {"Badminton"})
  public void beforeMethod() {
	  System.out.println("Iam playing badminton");
  }

  @Test(groups={"Hockey"})
  public void afterMethod() {
	  System.out.println("I am Playing hockey");
  }

}
