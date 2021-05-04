package Gamer;

public class NameValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
	
		if(gamer.getGamerName() == null && gamer.getGamerName().length() < 5) {
			System.out.println("Ad�n�z� l�tfen kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullan�c�n�n isim do�rulamas� ba�ar�l�!");
		}
		
	}

}
