package throAndCostm;

public class Age {
	public void a(int age)throws AgeLowException,AgeHighException
	{
		if(age<0)
		{
			throw new AgeLowException("age is low");
		}
		else if(age>80)
		{
			throw new AgeHighException("age is high");
		}
		else {
			System.out.println("age is valide");
		}
	}
	public static void main(String[] args) {
		Age a=new Age();
		try {
			a.a(44);
		}
		catch(AgeLowException e)
		{
			System.out.println(e.getMessage());
		}
		catch (AgeHighException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
