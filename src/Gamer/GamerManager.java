package Gamer;

public class GamerManager implements GamerService{
	

	@Override
	public void Add(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli m��teri eklendi!");
		
	}

	@Override
	public void Remove(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli m��teri silindi!");
		
	}

	@Override
	public void Update(Gamer gamer) {
		
		System.out.println(gamer.getGamerName() + " isimli m��teri g�ncellendi!");
		
	}

}
