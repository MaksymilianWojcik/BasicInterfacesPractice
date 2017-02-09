package Practice;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voice[] animals = new Voice[5];
		animals[0] = new Cat("Mruczek");
		animals[1] = new Dog("Samba");
		animals[2] = new Cat("Scala");
		animals[3] = new Cat("kana");
		
		for (int i = 0; i<=3; i++){
			animals[i].getVoice();
		}
		
		
		
		List<Voice> listAnimals = new ArrayList<Voice>();
		listAnimals.add(new Cat("mruczek"));
		listAnimals.add(new Dog("Samba"));
		
		for (Voice voice:listAnimals){
			voice.getVoice();
		}
	}

}
