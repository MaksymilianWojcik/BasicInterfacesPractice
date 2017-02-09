package Practice;

public class Dog implements Voice{
	
	
	private String name;
	
	public Dog(String name){
		this.name = name;
	}

	@Override
	public void getVoice() {
		// TODO Auto-generated method stub
		System.out.println("hau hau");
	}

}
