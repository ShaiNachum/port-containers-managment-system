///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.ArrayList;

public class ListOfStacks {
	private ArrayList<StackOfConts> contList;
	private final int START_X = 90;
	private int markedStackIndex;
	private boolean isMarked;

	public ListOfStacks() {
		contList = new ArrayList<StackOfConts>();
		int currentX = START_X;
		isMarked = false;
		for (int i = 0; i < 4; i++) {
			contList.add(new StackOfConts(currentX));
			currentX += 120;
		}
	}

	public void moveCont(StackOnTruck sot, TmpStack ts) {
		int index = getMarkedStackIndex();
		contList.get(index).moveCont(sot, ts);
	}

	public boolean isMarked() {
		for (int i = 0; i < contList.size(); i++) {
			if (contList.get(i).isMarked() == true)
				return true;
		}
		return false;
	}

	public void setMarked(int clickX, int clickY) {
		if ((clickX >= 90) && (clickX <= 200)) {
			contList.get(0).setIsMarked(clickY);
		} else if ((clickX >= 210) && (clickX <= 320)) {
			contList.get(1).setIsMarked(clickY);
		} else if ((clickX >= 330) && (clickX <= 440)) {
			contList.get(2).setIsMarked(clickY);
		} else if ((clickX >= 450) && (clickX <= 560)) {
			contList.get(3).setIsMarked(clickY);
		}
	}

	public int getMarkedStackIndex() {
		for (int i = 0; i < contList.size(); i++) {
			if (contList.get(i).isMarked())
				markedStackIndex = i;
		}
		return markedStackIndex;
	}

	public ArrayList<StackOfConts> getList() {
		return contList;
	}
}
