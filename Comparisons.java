import com.leapmotion.leap.*;

public class Comparisons {
	public static boolean basisInBounds(float[] min, float[] max, float[] test ){//This function tests whether a bone is within the accepted parameters
		if(scalarInBounds(min[0], max[0], test[0]) && scalarInBounds(min[1], max[1], test[1]) && scalarInBounds(min[2], max[2], test[2])){
			return true;
		}
		//implicit else
		return false;
	}
	public static boolean scalarInBounds(float min, float max, float test){//This is a smaller scale version of the basisInBounds function, it tests individual floats against each other rather than whole basis objects. 
		if(test >= min && test <= max){
			return true;
		}
		//implict else
		return false;
	}
}
