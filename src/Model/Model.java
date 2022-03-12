///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package Model;

import java.util.ArrayList;

public class Model {
	private ListOfStacks los;
	private StackOnTruck sot;
	private TmpStack ts;

	public Model() {
		los = new ListOfStacks();
		sot = new StackOnTruck();
		ts = new TmpStack();

	}

	public ArrayList<StackOfConts> getList() {
		return los.getList();
	}

	public void markCont(int cX, int cY) {
		if (los.isMarked() == false)
			los.setMarked(cX, cY);
	}

	public void moveCont() {
		los.moveCont(sot, ts);
	}

	public StackOnTruck getSot() {
		return sot;
	}

	public TmpStack getTs() {
		return ts;
	}
}
