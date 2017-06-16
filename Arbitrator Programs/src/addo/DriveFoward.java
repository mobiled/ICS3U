package addo;
/**
 * DriveForward.java
 * Drives forward unless another behavior is in control
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveFoward implements Behavior{
	private boolean suppress=false;
	@Override
	/**
	 * Lowest priority behavior, does action whenever nothing else is in control
	 */
	public boolean takeControl() {
		return true;
	}

	@Override
	/**
	 * Drives forward and stops when another behavior takes control
	 */
	public void action() {
		suppress=false;
		Motor.B.forward();
		Motor.C.forward();
		while(!suppress){
			Thread.yield();
		} 
		Motor.B.stop();
		Motor.C.stop();
	}

	@Override
	public void suppress() {
		suppress=true;
	}
	

}
