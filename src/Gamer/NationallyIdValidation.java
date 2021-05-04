package Gamer;

public class NationallyIdValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
		
		if(gamer.getNationallyId() == null && gamer.getNationallyId().length() < 11 && gamer.getNationallyId().length() > 11) {
			System.out.println("L�tfen TC kimlik numaran�z� kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullan�c�n�n TC do�rulamas� ba�ar�l�! ");
		}
		
	}
}
