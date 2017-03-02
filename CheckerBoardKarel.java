import stanford.karel.*;
public class CheckerBoardKarel extends SuperKarel {
	public void run() {
		boolean direction = false;

	}
	public void newRow() {
		boolean justPlaced = false;
		while(frontIsClear()) {
			if(justPlaced == false) {
				putBeeper();
			}
			justPlaced = !justPlaced;
			move();
		}
	}
	public boolean changeRow(boolean turn) {
		if(turn == false) {
			turnLeft();
		}
		else {
			turnRight();
		}
		return = !turn;
	}
}
