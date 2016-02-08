
public class Deep implements Deep2 {
	public String name;
	
	public void display(String name)
	{
		//this.name=name;
		System.out.println("Name is "+ name);
	}

	@Override
	public void start() {
		
		System.out.println("New genere has been started");
		
	}

}
