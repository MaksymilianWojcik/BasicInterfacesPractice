package Practice;

public class Cat implements Voice{
	
	private String name;
	
	public Cat(String name){
		this.name = name;
	}

	@Override
	public void getVoice() {
		// TODO Auto-generated method stub
		System.out.println("miau");
		
	}
	
	

}
