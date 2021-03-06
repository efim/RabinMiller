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
		PrimalityTest test = new PrimalityTest();
		MainUI ui = new MainUI(test);
		ui.setVisible(true);
	}
	
	public boolean isPrime(int number, double accuracy) {
		if (number < 0) {
			return false;
		}
		if (number == 1 || number == 2) {
			return true;
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
		
		int testCount = testCountFromAccuracy(accuracy);
		
		WitnessLoop:
		for (int i = 0; i < testCount; i++) {
			int base = getRandomBase(number);
			
			int x = powerInModule(base, baseCap, number);
			if (x == 1 || x == number - 1) {
				continue;
			}
			
			for (int j = 0; j < evennessPower; j++) {
				x = multiplicationInModule(x, x, number);
				
				if (x == 1) {
					return false;
				}
				if (x == number - 1) {
					continue WitnessLoop;
				}
			}
			
			return false;
			
		}
		
		return true;
	}
	
	protected int getRandomBase(int number) {
		return (int) Math.floor(Math.random() * (number - 3) + 2);

	}
	
	protected int testCountFromAccuracy(double accuracy) {
		int count = 0;
		double acc = accuracy;
		while (acc < 1) {
			acc *= 4;
			count++;
		}
		
		return count;
	}
	
	protected int powerInModule(int base, int power, int module) {
		int result = 1;
		int multiplicant = base;
		
		while (power != 0) {
			if (power % 2 == 1) {
				result = multiplicationInModule(result, multiplicant, module);
				
				power--;
			}
			
			power = power >> 1;
			
			multiplicant = multiplicationInModule(multiplicant, multiplicant, module);
			
		}
		
		return result;
	}
	
	protected int multiplicationInModule(int left, int right, int module) {
		int sum = left;
		int result = 0;
		int multiplier = right;
		
		while (multiplier != 0) {
			if (multiplier % 2 == 1) {
				result += sum;
				result = result % module;
				multiplier--;
			}
			
			multiplier = multiplier >> 1;
			sum *= 2;
			sum = sum % module;
		}
		
		return result;
	}
}
