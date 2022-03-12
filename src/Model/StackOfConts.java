///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.Stack;

public class StackOfConts {
	private Stack<Container> stk;
	private boolean isMarked;
	private final int START_Y = 395;
	private int currentY;
	private int stackX;

	public StackOfConts(int x) {
		stackX = x;
		stk = new Stack<Container>();
		createStack(x);
		isMarked = false;
		currentY = 260;
	}

	public void moveCont(StackOnTruck sot, TmpStack ts) {
		if (!stk.isEmpty()) {
			if ((!stk.peek().isMarked()) && (sot.isEmpty())) {
				ts.addToTmp(stk.pop());
				currentY += 45;
			} else if (stk.peek().isMarked()) {
				currentY += 45;
				sot.addToTruck(stk.pop());
			} else if ((!stk.peek().isMarked()) && (!sot.isEmpty())) {
				if (!ts.isEmpty()) {
					currentY -= 45;
					stk.push(ts.getLast());
					stk.peek().setX(stackX);
					stk.peek().setY(currentY);
				}
			}
		} else if ((stk.isEmpty()) && (!sot.isEmpty())) {
			currentY -= 45;
			stk.push(ts.getLast());
			stk.peek().setX(stackX);
			stk.peek().setY(currentY);
		}
	}

	public void createStack(int x) {
		int currentY = START_Y;
		for (int i = 0; i <= 3; i++) {
			stk.push(new Container(x, currentY));
			currentY -= 45;
		}
	}

	public void setIsMarked(int y) {
		for (int i = 0; i < stk.size(); i++) {
			stk.get(i).setMarked(y);
			if (stk.get(i).isMarked()) {
				this.isMarked = true;
			}
		}
	}

	public int getSize() {
		return stk.size();
	}

	public Container getElement(int index) {
		return stk.get(index);
	}

	public boolean isMarked() {
		return isMarked;
	}

}
