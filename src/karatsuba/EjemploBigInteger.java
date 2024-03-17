package karatsuba;

import java.math.BigInteger;
import java.util.Random;

public class EjemploBigInteger {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		BigInteger miNumero = new BigInteger("73487984983749897349835735638965");
		BigInteger otroNumero = new BigInteger("1897389758937958538638956935");
		BigInteger aleatorio = new BigInteger(100, random);
		
		BigInteger big1024 = new BigInteger("1024");
		System.out.println(big1024.divide(new BigInteger("2")));
		System.out.println("Right " + big1024.shiftRight(2));
		System.out.println("Left " + big1024.shiftLeft(3));
		
		System.out.println("Aleatorio: " + aleatorio);
		System.out.println("Cantidad de bits de otroNumero " + otroNumero.bitLength());
		System.out.println("Cantidad de bits en 1 de otroNumero " + otroNumero.bitCount());
		
		System.out.println(miNumero.add(otroNumero));
		System.out.println(miNumero.subtract(otroNumero));
		System.out.println(miNumero.multiply(otroNumero));
		System.out.println(miNumero.divide(otroNumero));
		
	}

}
