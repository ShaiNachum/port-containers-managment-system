///////////////////////////////////////BY:  SHAI NACHUM, ID-207118498   AND   HADAR BERMAN, ID-318434669///////////////////////////////////////////////////////////
package View;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class ShipView {

	public ShipView() {
	}

	public void show(Group root) {
		Polygon p = new Polygon();
		p.getPoints().addAll(new Double[] { 70.0, 540.0, 540.0, 540.0, 660.0, 440.0, 50.0, 440.0 });
		p.setStroke(Color.BLACK);
		p.setFill(Color.FIREBRICK);

		root.getChildren().add(p);
	}

}
