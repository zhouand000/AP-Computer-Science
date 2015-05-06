/**
 * 
 */
package examples.ap.skyview;

/**
 * @author Andrew
 * 
 */
public class SkyView {
	
	private double[][] view;
	
	/**
	 * @param numRows
	 * @param numCols
	 * @param scanned
	 * 
	 */
	public SkyView (int numRows, int numCols, double[] scanned) {
		
		view = new double[numRows][numCols];
		
		for (int i = 0; i < numRows; i++) {
			
			if (i % 2 == 0) {
				
				for (int j = 0; i < numCols; i++) {
					
					view[i][j] = scanned[i * numRows + j];
					
				}
				
			}
			else {
				
				for (int j = 0; j < numCols; j++) {
					
					view[i][numCols - j - 1] = scanned[i * numRows + j];
					
				}
				
			}
			
		}
		
	}
	
	/**
	 * @param startRow
	 * @param endRow
	 * @param startCol
	 * @param endCol
	 * @return the average of the values in the specified section of view
	 */
	public double getAverage (int startRow, int endRow, int startCol, int endCol) {
		
		int numberOfSquares = endRow + endCol - startRow - startCol;
		double total = 0d;
		for (int i = startRow; i < endRow; i++) {
			
			for (int j = startCol; i < endCol; i++) {
				
				total += view[i][j];
				
			}
			
		}
		
		return total / (double) numberOfSquares;
		
	}
	
}
