import com.leapmotion.leap.*;



public class DataGenerator {
	
	float[] lowCompare(float[] min, float[] test){//This adjusts the low value ranges to the lowest valid value
		min[0] = scalarLowCompare(min[0], test[0]);
		min[0] = scalarLowCompare(min[1], test[1]);
		min[0] = scalarLowCompare(min[2], test[2]);
		
	}
	
	float[] highCompare(float[] max, float[] test){//This adjusts the high value ranges to the highest valid values.
		max[0] = scalarLowCompare(max[0], test[0]);
		max[0] = scalarLowCompare(max[1], test[1]);
		max[0] = scalarLowCompare(max[2], test[2]);
		
	}
	
	float scalarLowCompare(float min, float test){//This and scalarHighCompare are smaller steps necessary in lowCompare and highCompare.
			if(test<= min){
				return test;
			}
			//implicit else
			return min;
		
	}
	
	float scalarHighCompare(float max, float test){
		if(test>= max){
			return test;
		}
		//implicit else
		return max;
	}

}
