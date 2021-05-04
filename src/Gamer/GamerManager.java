package Gamer;

public class GamerManager implements GamerService{
	

	@Override
	public void Add(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli müþteri eklendi!");
		
	}

	@Override
	public void Remove(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli müþteri silindi!");
		
	}

	@Override
	public void Update(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli müþteri güncellendi!");
		
	}

}
