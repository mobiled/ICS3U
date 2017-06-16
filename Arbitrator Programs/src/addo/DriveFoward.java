package addo;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveFoward implements Behavior{
	private boolean suppress=false;
	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
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
