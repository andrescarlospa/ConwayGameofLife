package oclc.codekata.gameoflife;

/**
 * 
 * @author Andres Panamito
 *
 */
public class Main {

	public static void main(String[] args) {

		BasicGame g = new BasicGame();
		
		g.loadSampleData();

		//Uncomment the following line to enter the initial state manually
		g.readInitialState();
		
		System.out.println("=============");
		System.out.println("Initial State");
		System.out.println("=============");
		
		g.print();
		g.evolve();
		
		System.out.println("=============");
		System.out.println("Updated State");
		System.out.println("=============");
		
		g.print();

	}
	
}
