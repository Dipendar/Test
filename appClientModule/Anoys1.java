
class student{
	public void school()
	{
		System.out.println("Weelcome");
	}
	
}
	
	interface Plant
	{
		public void dispaly();
	}

public class Anoys1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student std=new student(){

			@Override
			public void school() {
				System.out.println("done");
			}
			
			
		};
		std.school();
		
		Plant plan=new Plant()
				{

					@Override
					public void dispaly() {
						// TODO Auto-generated method stub
						System.out.println("gooud");
						
						
					}
			
				};
				plan.dispaly();

	}

}
