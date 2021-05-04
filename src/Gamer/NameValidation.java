package Gamer;

public class NameValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
	
		if(gamer.getGamerName() == null && gamer.getGamerName().length() < 5) {
			System.out.println("Adýnýzý lütfen kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullanýcýnýn isim doðrulamasý baþarýlý!");
		}
		
	}

}
