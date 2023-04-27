class Rational
{
	private int numerator;
	private int denominator;
	public Rational()
	{
		this.numerator=0;
		this.denominator=1;
	}
	public Rational(int wholeNumber)
	{
		this.numerator=wholeNumber;
		this.denominator=1;
	}
	public Rational(int numerator,int denominator)
	{ 
		if(denominator==0){
			this.numerator=0;
			this.denominator=1;
		}
		else if(denominator<0){
			this.numerator=(numerator*(-1));		
			this.denominator=(denominator*(-1));
		}
		else if(numerator==0){
			this.denominator=1;
		}
		else{
			this.numerator = numerator;
			this.denominator = denominator;
		}
	}
	public Rational addWith(Rational other)
	{
		int x = ((this.numerator*other.denominator)+(this.denominator*other.numerator));
		int y = (this.denominator*other.denominator);
		return new Rational(x,y);	
	}
	public Rational subtractFrom(Rational other)
	{
		int x = ((this.numerator*other.denominator)-(this.denominator*other.numerator));
		int y = (this.denominator*other.denominator);
		return new Rational(x,y);	
	}
	public Rational multiplyWith(Rational other)
	{
		int x = (this.numerator*other.numerator);
		int y = (this.denominator*other.denominator);
		return new Rational(x,y);
	}
	public Rational divideWith(Rational other)
	{
		int x = (this.numerator*other.denominator);
		int y = (this.denominator*other.numerator);
		if(y==0){
			return null;
		}
		else{
			return new Rational(x,y);
		}	
	}
	public boolean equals(Rational other)
	{
		if(this.numerator*other.denominator == this.denominator*other.numerator){
			return true;
		}
		else{
			return false;
		}
	}
	public String toString()
	{ 
		String s = this.numerator + "/" + this.denominator;
		return s;
	}
}
		
		
	
	
