import java.io.IOException;

import bridges.base.Color;
import bridges.base.ColorGrid;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;

public class PatternRunner {
    public static void main(String[] args) throws RateLimitException, IOException {
        // Instantiate a Bridges object with your:
        // assignment number
        // your username,
        // and your API key
        Bridges bridges = new Bridges(2, "cng", "1048575341021");
        bridges.setTitle("Grid Patterns");
        bridges.setDescription("Using nested loops and conditionals to create grid patterns");

        // Instantiate a ColorGrid object with 14 rows and 20 columns
        ColorGrid grid = new ColorGrid(14, 20);

        // Instantiate an object of the Pattern class called pat
        Pattern pat = new Pattern();

        // CALL METHOD FOR SAMPLE PROBLEM: drawSample() sample pattern (two meager beady eyes)
        // Two arguments: your ColorGrid instance, your Bridges instance
        //pat.drawSample(grid, bridges);

        // CALL METHOD FOR PROBLEM 1: drawHorizontalStripes()  Make every other row a different color.
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        //pat.drawHorizontalStripes(grid, bridges, new Color("red"), new Color("yellow"));

        // CALL METHOD FOR PROBLEM 2: drawVerticalStripes() Make every other column a different color.
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        //pat.drawVerticalStripes(grid, bridges, new Color("blue"), new Color("red"));

        // CALL METHOD FOR PROBLEM 3: drawCheckerboard()  Create a checkerboard pattern
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        pat.drawCheckerboard(grid, bridges, new Color("orange"), new Color("black"));

        // CALL METHOD FOR PROBLEM 4: drawBorder()  Make all the border cells one color and all the interior cells another color
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        //pat.drawBorder(grid, bridges, new Color("yellow"), new Color("blue"));

        // CALL METHOD FOR PROBLEM 5: drawX()  Make an “X” design
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        // NOTE: If your grid is not square, it is okay that your "X" is not centered
        //pat.drawX(grid, bridges, new Color("blue"), new Color("yellow"));

        // CALL METHOD FOR PROBLEM 6: drawDiagSplit() Along the "slope = -1 diagonal", split the grid, one color each side
        // Four arguments: your ColorGrid instance, your Bridges instance, color, color)
        //pat.drawDiagSplit(grid, bridges, new Color("blue"), new Color("yellow"));

        // CALL METHOD FOR PROBLEM 7: drawQuadrants()  Show the 4-quadrants in a different color for each.
        // If the ColorGrid has  an odd number of rows and an odd number of columns,
        // show the x and y axes in yet another color. Otherwise, the four quadrants will show
        // and the x and y axes will merely be suggested by the color changes
        // Six arguments: your ColorGrid instance, your Bridges instance, color, color, color, color)
        // pat.drawQuadrants(grid, bridges, new Color("blue"), new Color("yellow"), new Color("green"), new Color("red"));

    } // end main method
} // end class