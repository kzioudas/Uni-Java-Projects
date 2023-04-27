class RationalTest
{
	public static void main(String args[])
	{
		Rational r1 = new Rational();
		System.out.println("r1 = " + r1);
		Rational r2 = new Rational(2);
		System.out.println("r2 = " + r2);
		Rational r3 = new Rational(-4,-2);
		System.out.println("r3 = " + r3);
		Rational r4 = new Rational(3,-4);
		System.out.println("r4 = " + r4);
		Rational r5 = r1.addWith(r2);
		System.out.println(r1 + "+" + r2 + "=" + r5);
		Rational r6 = r2.addWith(r3);
		System.out.println(r2 + "+" + r3 + "=" + r6);
		Rational r7 = r1.subtractFrom(r2);
		System.out.println(r1 + "-" + r2 + "=" + r7);
		Rational r8 = r2.multiplyWith(r3);
		System.out.println(r2 + "*" + r3 + "=" + r8);
		Rational r9 = r2.divideWith(r1);
		System.out.println(r2 + ":" + r1 + "=" + r9);
		Rational r10 = r3.divideWith(r4);
		System.out.println(r3 + ":" + r4 + "=" + r10);
		System.out.println(r1 + "==" + r2 + " : " + r1.equals(r2));		
		System.out.println(r2 + "==" + r3 + " : " + r2.equals(r3));		
	}
}

