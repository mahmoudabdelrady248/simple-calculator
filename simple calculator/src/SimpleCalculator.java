
public class SimpleCalculator {
	public int add(int x,int y) {
		int z=x+y;
		return z;
	}
	public float divide(int x,int y) {
		try {
			float z=(float)x/y;
			return z;
		} catch (ArithmeticException e) {
			throw new RuntimeException("Arithmetic Exception");
		}
	}
  }
