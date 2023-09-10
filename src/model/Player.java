package model;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera
 * CIS175 Fall 2023
 * Aug, 30
 */
public class Player {
	
	private String gamerTag;
	private int diamonds;
	private int xpLevels;
	
	public Player() {
		super();
	}

	public Player(String gamerTag, int diamonds, int xpLevels) {
		super();
		this.gamerTag = gamerTag;
		this.diamonds = diamonds;
		this.xpLevels = xpLevels;
	}

	public String getGamerTag() {
		return gamerTag;
	}

	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	public int getXpLevels() {
		return xpLevels;
	}

	public void setXpLevels(int xpLevels) {
		this.xpLevels = xpLevels;
	}
	
	public String printAll() {
		return gamerTag + diamonds + xpLevels;
	}
	
	
	

}
