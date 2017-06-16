package addo;
/**
 * AhmedCulminating.java
 * Robot roams around and if a white ball is in the way it grabs it and drives along
 * 15/06/17
 * @author Ahmed Addo
 */
import lejos.nxt.Button;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class AhmedCulminating {

	public static void main(String[] args) {
		//end program behavior
		Behavior b0 = new EndProgram();
		//Drive Forward
		Behavior b1 = new DriveFoward();
		//Rotate if a wall is in the way
		Behavior b2=new SenseWall();
		//if a light ball is detected grabs ball
		Behavior b3 = new LightSense();
		Behavior[] behaviours = {b1,b2,b3,b0};
		Arbitrator arb = new Arbitrator(behaviours);
		//Arbitrator runs when a button is pressed
		Button.waitForAnyPress();
		arb.start();
		Button.waitForAnyPress();
		


	}

}
