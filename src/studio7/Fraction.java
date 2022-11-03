package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public String toString() {
		return numerator + " / " + denominator;
	}
	
	public String add(Fraction f2) {
		if (denominator == f2.getDenominator()) {
			Fraction f3 = new Fraction(numerator + f2.getNumerator(), denominator); 
			return f3.simplify();
		}
		else {
			Fraction f3 = new Fraction(numerator * f2.getDenominator() + f2.getNumerator() * denominator, denominator * f2.getDenominator());
			return f3.simplify();
		}
	}
	
	public String multiply(Fraction f2) {
		Fraction f3 = new Fraction(numerator * f2.getNumerator(), denominator * f2.getDenominator()); 
		return f3.simplify();
	}
	
	public String reciprocal() {
		return denominator + " / " + numerator;
	}
	
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		}
		else {
			return gcd(q, p % q);
		}
	}
	
	public String simplify() {
		int gcd = gcd(numerator, denominator);
		return (numerator / gcd) + " / " + (denominator / gcd);
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(4, 8);
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(f1.add(f2));
		System.out.println(f1.multiply(f2));
		System.out.println(f1.reciprocal());
		System.out.println(f2.simplify());
	}

}
