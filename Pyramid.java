/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		for(int i=0;i<BRICKS_IN_BASE;i++){
			createBrickRow(i);
		}
	}

	private void createBrickRow(int i) {
		// TODO Auto-generated method stub
		int originalX,OriginalY;
		getOriginalCoordinate(i);
		for(int j=0;j<i;j++){
			GRect brick = new GRect(originalX,OriginalY,BRICK_WIDTH,BRICK_HEIGHT);
			add(brick);
		}
	}
}

