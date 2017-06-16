package addo;

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
	public boolean takeControl() {
		if (sonic.getDistance() <= 25) {
			return true;
		}
		return false;
	}

	@Override
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
