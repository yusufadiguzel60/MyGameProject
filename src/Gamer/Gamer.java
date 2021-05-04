package Gamer;

public class Gamer {
	
	private String gamerName;
	private long gamerId;
	private String email;
	private String password;
	private String nationallyId;
	private int dateOfBirth;
	
	public Gamer(String gamerName, long gamerId, String email, String password, String nationallyId, int dateOfBirth) {
		super();
		this.gamerName = gamerName;
		this.gamerId = gamerId;
		this.email = email;
		this.password = password;
		this.nationallyId = nationallyId;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	public String getGamerName() {
		return gamerName;
	}
	public void setGamerFirstName(String gamerName) {
		this.gamerName = gamerName;
	}

	public long getGamerId() {
		return gamerId;
	}
	public void setGamerId(long gamerId) {
		this.gamerId = gamerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNationallyId() {
		return nationallyId;
	}

	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
