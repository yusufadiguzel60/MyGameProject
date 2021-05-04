package Gamer;

public class DateOfBirthValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
		
		if(gamer.getDateOfBirth() < 2003) {
			System.out.println("L�tfen do�um y�l�n�z� kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullan�c�n�n do�um tarihi do�rulamas� ba�ar�l�!");
		}
		
	}

}
