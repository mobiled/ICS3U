package addo;
/**
 * EndProgram.java
 * Ends the program when the escape button is pressed
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class EndProgram implements Behavior{
	/**
	 * When the escape button is pressed, take control
	 */
	@Override
	public boolean takeControl() {
		if(Button.ESCAPE.isDown()){		
		return true;
		}
		return false;
	}
	/**
	 * Exits the program
	 */
	@Override
	public void action() {
		System.exit(0);
		
	}
	/**
	 * no suppress
	 */
	@Override
	public void suppress() {
		
	}

}
