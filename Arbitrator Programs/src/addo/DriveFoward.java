package addo;

/**
 * DriveForward.java
 * Drives forward unless another behavior is in control
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveFoward implements Behavior {
	private boolean suppress = false;

	/**
	 * Lowest priority behavior, does action whenever nothing else is in control
	 */
	@Override
	public boolean takeControl() {
		return true;
	}

	/**
	 * Drives forward and stops when another behavior takes control
	 */
	@Override
	public void action() {
		suppress = false;
		Motor.B.forward();
		Motor.C.forward();
		while (!suppress) {
			Thread.yield();
		}
		Motor.B.stop();
		Motor.C.stop();
	}
	/**
	 * action stops because suppress is true
	 */
	@Override
	public void suppress() {
		suppress = true;
	}

}
