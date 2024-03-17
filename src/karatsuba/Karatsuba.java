package karatsuba;

import java.math.BigInteger;
import java.util.Random;

public class Karatsuba {
	
	private static BigInteger karatsuba(BigInteger x, BigInteger y) {
		
		int m = Math.max(x.bitLength(), y.bitLength()) / 2;
		
		if (m <= 100) {
			return x.multiply(y);
		}
		
		BigInteger x1 = x.shiftRight(m);
		BigInteger y1 = y.shiftRight(m);
		
		BigInteger x2 = x.subtract(x1.shiftLeft(m));
		BigInteger y2 = y.subtract(y1.shiftLeft(m));
		
		BigInteger A = karatsuba(x1, y1);
		BigInteger B = karatsuba(x2, y2);
		BigInteger C = karatsuba(x1.add(x2), y1.add(y2));
		BigInteger K = C.subtract(A.add(B));
		
		return A.shiftLeft(2*m).add(K.shiftLeft(m)).add(B);
	}

	public static void main(String[] args) {
		Random random = new Random(0);
		
		BigInteger x = new BigInteger(200, random);
		BigInteger y = new BigInteger(200, random);
		
		BigInteger resultadoKaratsuba = karatsuba(x, y);
		BigInteger resultadoMultiply = x.multiply(y);
		
		System.out.println(resultadoKaratsuba);
		System.out.println(resultadoMultiply);
		System.out.println(resultadoKaratsuba.equals(resultadoMultiply));
	}
	
}
