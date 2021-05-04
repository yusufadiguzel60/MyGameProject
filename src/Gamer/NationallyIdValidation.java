package Gamer;

public class NationallyIdValidation implements GamerValidationService{

	@Override
	public void CheckIfPerson(Gamer gamer) {
		
		if(gamer.getNationallyId() == null && gamer.getNationallyId().length() < 11 && gamer.getNationallyId().length() > 11) {
			System.out.println("Lütfen TC kimlik numaranýzý kontrol ediniz!");
		}else {
			System.out.println(gamer.getGamerName() + " isimli kullanýcýnýn TC doðrulamasý baþarýlý! ");
		}
		
	}
}
