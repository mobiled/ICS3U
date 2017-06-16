package addo;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class EndProgram implements Behavior{

	@Override
	public boolean takeControl() {
		if(Button.ESCAPE.isDown()){		
		return true;
		}
		return false;
	}

	@Override
	public void action() {
		System.exit(0);
		
	}

	@Override
	public void suppress() {
		
	}

}
