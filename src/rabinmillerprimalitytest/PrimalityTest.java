/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabinmillerprimalitytest;

/**
 *
 * @author efim
 */
public class PrimalityTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		MainUI ui = new MainUI();
		ui.setVisible(true);
	}
	
	public boolean isPrime(int number, double accuracy) {
		if (number < 2) {
			return false;
		}
		if (number % 2 == 0) {
			return false;
		}
		return RabinMillerPrimalityTest(number, accuracy);
	}
	
	/**
	 *
	 * @param number - number to be tested for primality
	 * @param accuracy - needed chance of misidentifying as prime
	 * @return false - if number is composite, true - if probably prime
	 */
	public boolean RabinMillerPrimalityTest(int number, double accuracy){
		int baseCap = number - 1;
		int evennessPower = 0;
		
		while (baseCap % 2 == 0) {
			evennessPower++;
			baseCap /= 2;
		}
		
		
		
		return false;
	}
	
	private int powerInModule(int base, int power, int module) {
		int result = 1;
		int multiplicant = base;
		
		while (power != 0) {
			if (power % 2 == 1) {
				result *= multiplicant;
				result = result % module;
				power--;
			}
			
			power = power >> 1;
			multiplicant *= multiplicant;
			multiplicant = multiplicant % module;
			
		}
		
		return result;
	}
}
