package studio7;

public class Die {
	private int sides;

	public Die(int sides) {
		this.sides = sides;
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getRandom() {
		return (int)(Math.random()* sides) + 1;
	}
	
	
	public static void main(String[] args) {
		Die D1 = new Die(8);
		Die D2 = new Die(20);
		System.out.println(D1.getSides());
		System.out.println(D2.getSides());
		System.out.println(D1.getRandom());
		System.out.println(D1.getRandom());
		System.out.println(D1.getRandom());
		System.out.println(D1.getRandom());
		System.out.println(D1.getRandom());
		System.out.println(D2.getRandom());				

	}

}
