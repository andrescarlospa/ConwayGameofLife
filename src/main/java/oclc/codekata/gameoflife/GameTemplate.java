package oclc.codekata.gameoflife;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Conway's Game of Life Skeleton 
 * 
 * @author Andres Panamito
 *
 */
public abstract class GameTemplate {

	protected int x;
	protected int y;
	protected Character[][] data;

	/**
	 * Read the initial state - Input: keyboard
	 */
	public void readInitialState() {
		Scanner read = new Scanner(System.in);
	
		System.out.print("X = ");
		this.x = read.nextInt();
	
		System.out.print("Y = ");
		this.y = read.nextInt();
	
		System.out.println("Enter Initial State: Sample (.o.oo..o)");
		int j = -1;
	
		this.data = new Character[y][x];
		do {
			System.out.print((j + 1) + " row | ");
			read = new Scanner(System.in);
			try {
				String line = read.next(Pattern.compile("^[o\\.]*$"));
				line = line.replaceAll("\\s", "");
				if (line.length() == x) {
					j++;
					data[j] = line.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
				} else
					System.out.println("Enter again, length > " + x);
			} catch (Exception e) {
				System.out.println("Enter again, allowed states: dead : . | live : o");
			}
		} while (j < y-1);
		read.close();
	}

	/**
	 * Get the state based in its coordinates
	 * @param x
	 * @param y
	 * @return state 1 or 0
	 */
	public int getAliveState(int x, int y) {
		if (x > -1 && y > -1 && x < data[0].length && y < data.length) {
			return data[y][x].charValue() == 'o' ? 1 : 0;
		}
		return 0;
	}

	/**
	 * Prints the Game State
	 */
	public void print() {
		Arrays.stream(data).forEach(row -> {
			Arrays.stream(row).forEach(cell -> System.out.print(cell));
			System.out.println();
	
		});
	}
	
	/**
	 * Algorithm to evolve
	 */
	public abstract void evolve();
	
	/**
	 * Algorithm to count alive neighbors
	 * @param i
	 * @param j
	 * @return
	 */
	protected abstract int countAliveNeighbors(int i, int j);

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Character[][] getData() {
		return data;
	}
	
}