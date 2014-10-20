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
		return false;
	}
}
