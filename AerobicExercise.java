/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AerobicExercise extends ConsoleProgram {
	
	/*represent the days of exercise whose time is longer than 30 and 40*/
	private static int carHealthTimes = 0;
	private static int bloHealthTimes = 0;
	public void run() {
		
		inputMinutes();
		showAdvice();
	}

	/*input the minutes */
	private void inputMinutes() {
		for(int i = 1 ;i < 8; i++){
			int value = readInt("How many minutes of asrobic Execrcise did you do on day "+i+":");
			if (value > 30) carHealthTimes ++;
			if (value > 40) bloHealthTimes ++;
		}
	}

	private void showAdvice() {
		
	}
}
