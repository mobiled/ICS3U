package addo;

/**
 * SenseWall.java
 * Senses a wall or object in its path and changes direction
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class SenseWall implements Behavior {
	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
	private boolean suppress = false;

	@Override
	/**
	 * If the ultra sonic sensor finds an object/wall in the way, take control
	 */
	public boolean takeControl() {
		if (sonic.getDistance() <= 25) {
			return true;
		}
		return false;
	}

	@Override
	/**
	 * The robot rotates its direction
	 */
	public void action() {
		suppress = false;
		Motor.B.backward();
		Motor.C.stop();
		Delay.msDelay(1000);

	}

	@Override
	public void suppress() {
		suppress = true;
	}

}
