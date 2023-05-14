import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

import java.io.IOException;

import bridges.base.Color;
import bridges.base.ColorGrid;

public class Pattern
{

	// SAMPLE PROBLEM: method to draw sample  (use this as a template)
	public static void drawSample(ColorGrid grid, Bridges bridges) throws RateLimitException, IOException {
		//Display a two-eyeballs pattern to the grid (two meager beady eyes -- how lame)
		// first eyeball
		grid.set(5, 6, new Color("yellow"));
		// second eyeball
		grid.set(5, 9, new Color("yellow"));
		// call to the Bridges object called ‘bridges’ -- set the data structure to the Grid type
		bridges.setDataStructure(grid);
		// call to the Bridges object called ‘bridges’ -- show the ColorGrid object called ‘grid’
		bridges.visualize();
	}  // end method drawSample()


    // YOUR METHODS (for problems 1 through 7)  HERE:
    // PROBLEM 1: method to draw horizontal stripes
	public void drawHorizontalStripes(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int row = 0; row < grid.getHeight(); row++) {
			for(int col = 0; col < grid.getWidth(); col++) {
				if(row % 2 == 0){
					grid.set(row, col, c1);
				}else{
					grid.set(row, col, c2);
				}
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 2: method to draw vertical stripes
	public void drawVerticalStripes(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int col = 0; col < grid.getWidth(); col++) {
			for(int row = 0; row < grid.getHeight(); row++) {
				if(col % 2 == 0){
					grid.set(row, col, c1);
				}else{
					grid.set(row, col, c2);
				}
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 3: method to draw checkerboard
	public void drawCheckerboard(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				grid.set(row, col, c1);
			}
		}
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				if(row % 2 == 0 && col % 2 == 0){
					grid.set(row, col, c2);
				}else if(row % 2 != 0 && col % 2 != 0){
					grid.set(row, col, c2);
				}
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 4: method to draw border
	public void drawBorder(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				if(row == 0 || col == 0 || row == grid.getHeight() - 1  || col == grid.getWidth() - 1){
					grid.set(row, col, c1);
				}else{
					grid.set(row, col, c2);
				}
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 5: method to draw X
	public void drawX(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				grid.set(row, col, c2);
			}
		}
		int col = 0;
		for(int row = 0; row < grid.getHeight(); row++){
			grid.set(row, col, c1);
			col++;
		}
		col = 0;
		for(int row = grid.getHeight() - 1; row >= 0; row--){
			grid.set(row, col, c1);
			col++;
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 6: method to draw diagonal split
	public void drawDiagSplit(ColorGrid grid, Bridges bridges, Color c1, Color c2) throws RateLimitException, IOException {
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				grid.set(row, col, c1);
			}
		}
		int c = 3;
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < c; col++){
				grid.set(row, col, c2);
			}
			c++;
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


	// PROBLEM 7: method to draw 4 quadrants
	public void drawQuadrants(ColorGrid grid, Bridges bridges, Color c1, Color c2, Color c3, Color c4) throws RateLimitException, IOException {
		int rHalf = grid.getHeight() / 2;
		int cHalf = grid.getWidth() / 2;
		for(int row = 0; row < grid.getHeight(); row++){
			for(int col = 0; col < grid.getWidth(); col++){
				if(row < rHalf && col < cHalf){
					grid.set(row, col, c1);
				}else if(row < rHalf && col >= cHalf){
					grid.set(row, col, c2);
				}else if(row >= rHalf && col < cHalf){
					grid.set(row, col, c3);
				}else{
					grid.set(row, col, c4);
				}
			}
		}
		bridges.setDataStructure(grid);
		bridges.visualize();
	}


}  // end class