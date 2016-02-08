
public class Deep1 implements Deep2 {
	public String gender;
	
	public void displays()
	{
		System.out.println("Your gender"+ gender);
	}

	@Override
	public void start() {
		//// TODO Auto-generated method stub
		System.out.println("You can start");
		
	}
	

}
