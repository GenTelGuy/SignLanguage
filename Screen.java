import com.leapmotion.leap.*;

public class Screen {
	PShape cursor;
	Controller leap;
	int windowHeight = 800;
	int windowWidth = 800;
	color cursorNormalColor = color(0, 0, 128);
	color cursorHoverColor = color(0, 128, 0);
	color cursorTouchColor = color(128, 0, 0);
	color backgroundColor = color(250, 235, 200);

	void setup() {
		size(windowWidth, windowHeight, P2D);
		leap = new Controller();
		cursor = createShape(ELLIPSE, 0, 0, 40, 40);
		cursor.stroke(cursorNormalColor);
		cursor.fill(colorWithAlpha(cursorNormalColor, 16));
	}

	void draw() {
	  background(backgroundColor);

	  InteractionBox iBox = leap.frame().interactionBox();
	  PointableList pointables = leap.frame().pointables();
	  for(int p = 0; p < pointables.count(); p++) {
	    Pointable pointable = pointables.get(p);
	    Vector normalizedPosition = iBox.normalizePoint(pointable.stabilizedTipPosition());
	    float pixelX = normalizedPosition.getX() * windowWidth;
	    float pixelY = windowHeight - normalizedPosition.getY() * windowHeight;
	    int cx = (int) pixelX - 20;
	    int cy = (int) pixelY - 20;

	    Pointable.Zone fingerzone = pointable.touchZone();
	    
	    if(pointable.touchDistance() > 0 && fingerzone != Pointable.Zone.ZONE_NONE) {
	        cursor.stroke(cursorHoverColor);
	        cursor.fill(colorWithAlpha(cursorHoverColor, (int)(64 - pointable.touchDistance() * 48)));
	    }
	    else if(pointable.touchDistance() <= 0) {
	        cursor.stroke(cursorTouchColor);
	        cursor.fill(colorWithAlpha(cursorTouchColor, (int)(64 - pointable.touchDistance() * 126)));
	    }
	    else {
	       cursor.stroke(cursorNormalColor);
	       cursor.fill(colorWithAlpha(cursorNormalColor, 16));
	    }
	    shape(cursor, cx, cy);
	  }
	}

	color colorWithAlpha(color rgb, int alpha) {
	   return color(red(rgb), green(rgb), blue(rgb), alpha);
	}
}