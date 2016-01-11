 public class Letter {
	private Sign thisSign;
	private String name;
	
	public Letter(String n) {
		name = n;
		switch(n) {
			case "A":
				setSign(false, true, false, false, false, false, false, North);
				break;
			case "B":
				setSign(false, false, false, true, true, true, true, North);
				break;
			case "C":
				setSign();
				//how to curl
				break;
			case "D":
				setSign(true, false, false, true, false, false, false, North);
				break;
			case "E":
				setSign();
				//how to curl
				break;
			case "F":
				setSign(true, false, false, false, true, true, true, North);
				break;
			case "G":
				setSign(false, true, false, true, false, false, false, West);
				break;
			case "H":
				setSign(false, true, false, true, true, false, false, West);
				break;
			case "I":
				setSign(false, true, false, false, false, false, true, West);
				break;
			case "J":
				setSign();
				//gesture
				break;
			case "K":
				setSign(false, false, false, true, true, false, false, North);
				break;
			case "L":
				setSign(false, false, true, true, false, false, false, North);
				//the thumb is pointed away from the fist, so the direction would be east. hard code x2
				break;
			case "M":
				setSign(/*asdfasdf*/);
				// idk how to read in between fingers
				break;
			case "N":
				setSign(/*asdfasdf*/);
				//idk how to read in between fingers
				break;
			case "O":
				setSign(/*asdfasdf*/);
				break;
			case "P":
				setSign(/*asdfasdf*/);
				break;
			case "Q":
				setSign(/*asdfasdf*/);
				break;
			case "R":
				setSign(/*asdfasdf*/);
				break;
			case "S":
				setSign(/*asdfasdf*/);
				break;
			case "T":
				setSign(/*asdfasdf*/);
				break;
			case "U":
				setSign(/*asdfasdf*/);
				break;
			case "V":
				setSign(/*asdfasdf*/);
				break;
			case "W":
				setSign(/*asdfasdf*/);
				break;
			case "X":
				setSign(/*asdfasdf*/);
				break;
			case "Y":
				setSign(/*asdfasdf*/);
				break;
			case "Z":
				setSign(/*asdfasdf*/);
				break;
			default:
				break;
		}
	}
	public void setSign(boolean isPinch, boolean isFist, boolean extend0, boolean extend1, boolean extend2, boolean extend3, boolean extend4, Vector direction,  {
		
	}
	public void setSign(/*overloaded method*/) {
		
	}
	public String getName() {
		return name;
	}
	public Sign getSign() {
		return thisSign;
	}
}
