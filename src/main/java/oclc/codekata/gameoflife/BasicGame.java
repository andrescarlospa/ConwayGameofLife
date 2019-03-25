package oclc.codekata.gameoflife;

import java.util.Arrays;

/**
 * Implementation of the basic Conway's Game of Life
 * 
 * @author Andres Panamito
 *
 */
public class BasicGame extends GameTemplate {

	/**
	 * Read initial state from file
	 */
	public void loadSampleData() {
		data = Util.loadStateData("resources/init-state.txt");
		y = data.length;
		x = data[0].length;
	}

	@Override
	public void evolve() {
		Character[][] evolution = new Character[y][x];
		for (int i = 0; i < data.length; i++) {
			evolution[i] = Arrays.copyOf(data[i], data[i].length);
			for (int j = 0; j < data[i].length; j++) {
				int alive = countAliveNeighbors(i, j);
				if (data[i][j].equals('o')) {
					if (alive < 2) {
						evolution[i][j] = '.';
					} else if (alive > 3) {
						evolution[i][j] = '.';
					}
				} else if (alive == 3) {
					evolution[i][j] = 'o';
				}
			}
		}
		this.data = evolution;
	}

	@Override
	protected int countAliveNeighbors(int i, int j) {
		return getAliveState(j - 1, i) + getAliveState(j + 1, i) + getAliveState(j, i - 1) + getAliveState(j, i + 1)
				+ getAliveState(j - 1, i - 1) + getAliveState(j - 1, i + 1) + getAliveState(j + 1, i - 1)
				+ getAliveState(j + 1, i + 1);
	}

}
