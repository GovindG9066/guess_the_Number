package Games;

import java.util.Random;
import java.util.Scanner;

class guess{
	public int number;
	public int inputNumber;
	public int gusses=0;
	
	public int getGusses() {
		return gusses;
	}
	
	public void setGusses(int gusses) {
		this.gusses = gusses;
	}
	
	 guess(){
		Random rand=new Random();
		this.number=rand.nextInt(100)+1;		
	}
	
	void userInput() {
		System.out.println("Guess the Number...");
		Scanner sc =new Scanner(System.in);
		this.inputNumber=sc.nextInt();
		this.gusses++;
		
		
	}
	boolean isCorrect() {
		if(inputNumber==number) {
			System.out.println("congrats you guess the number in "+gusses+" attepmt");
		return true;
		}
		else if(inputNumber<number) {
			System.out.println("Too small...");
		}
		else if(inputNumber>number) {
			System.out.println("Too Large...");
		}
		else {
			return false;			
		}
		return false;			
	}
	
}
	
public class Guess_The_Number {
	public static void main(String[] args) {
			guess g=new guess();
			boolean b=false;
			
			while(!b) {
			g.userInput();
			b=g.isCorrect();
			
			}
		}
	}


