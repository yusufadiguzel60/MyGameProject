package Gamer;

public class DateOfBirthValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
		
		if(gamer.getDateOfBirth() < 2003) {
			System.out.println("Lütfen doðum yýlýnýzý kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullanýcýnýn doðum tarihi doðrulamasý baþarýlý!");
		}
		
	}

}
