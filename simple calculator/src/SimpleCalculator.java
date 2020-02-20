
public class SimpleCalculator {
	public int add(int x,int y) {
		int z=x+y;
		return z;
	}
	public float divide(int x,int y) throws RuntimeException{
		if(y==0) 
		throw new RuntimeException("ArithmeticException");
		else
			return (float)x/y;
	}
  }
