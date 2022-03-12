///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.Random;

public class Container {
	private int x, y;
	private int r, g, b;
	private int width, height;
	private boolean isMarked;
	private boolean isOnTruck;

	public Container(int x, int y) {
		Random rnd = new Random();
		this.x = x;
		this.y = y;
		r = rnd.nextInt(255);
		g = rnd.nextInt(255);
		b = rnd.nextInt(255);
		width = 110;
		height = 45;
		isMarked = false;
		isOnTruck = false;

	}

	public boolean isMarked() {
		return isMarked;
	}

	public void setMarked(int y) {
		if ((y >= this.y) && (y <= this.y + this.height)) {
			isMarked = true;
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean getIsOnTruck() {
		return isOnTruck;
	}

	public void setMarked(boolean isMarked) {
		this.isMarked = isMarked;
	}

}
