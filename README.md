# ConwayGameofLife
Conway's Game of Life

## Requirements

In order to successfully run this project you need a few things:

1. Java 1.8
2. Maven
3. Eclipse IDE
 
## First Use Instructions

1. Clone the GitHub repo to your computer
2. Import in Eclipse
3. Run as Maven build

## Execution

1. Run: oclc.codekata.gameoflife.Main.java
2. It will play with sample initial state
3. To custom the input state you can uncomment the line 17 of the Main.java class

## Goal 

# Conway’s Game of Life Exercise 

The goal of this exercise is to calculate the next generation of Conway’s game of life  given any initial state. Take a look at the following for some background on  Conway’s game of life: 
 
http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life 
 
Background  The playing field for Conway’s game of life consists of a two dimensional grid of  cells. Each cell is identified as either alive or dead. For this exercise, let’s assume the  playing field is an 8x6 grid of cells (i.e. 8 columns, 6 rows). 
  The challenge is to calculate the next state of the playing field given any initial grid  state. To find the next state, follow these rules: 
 
1. Any live cell with fewer than two live neighbors dies, as if caused by underN population. 
2. Any live cell with more than three live neighbors dies, as if by overcrowding. 
3. Any live cell with two or three live neighbors lives on to the next generation. 
4. Any dead cell with exactly three live neighbors becomes a live cell. 
5. A cell’s neighbors are those cells which are horizontally, vertically or diagonally adjacent. Most cells will have eight neighbors. Cells placed on the edge of the grid will have fewer. 