package addo;
/**
 * LightSense.java
 * Senses a light coloured ball and grabs it
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class LightSense implements Behavior{
	private LightSensor light = new LightSensor(SensorPort.S1);
	private boolean suppress=false;
	@Override
	/**
	 * If light value increases due to a white ball in its path, take control
	 */
	public boolean takeControl() {
		if (light.getLightValue()>=30){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * Does grab ball method
	 */
	public void action() {
		 suppress=false;
		 if(!suppress){
			 grabBall();
			 Thread.yield();
		 }
		 Motor.A.rotateTo(90);
	}

	@Override
	public void suppress() {
		suppress=true;
	}
	/**
	 * Positions the robot and claw grabs the ball
	 */
	public void grabBall(){
		Motor.B.stop();
		Motor.C.rotate(165);
		Motor.C.stop();
		Delay.msDelay(1000);
		Motor.B.rotate(25,true);
		Motor.C.rotate(25,true);
		Motor.A.rotateTo(-155);
		Motor.A.stop();

	}
	
	

}
