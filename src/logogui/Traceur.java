/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;

import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class Traceur {
	private Group g;
	// -- Position initiale -- //
	private double initx = 300, inity = 300;
	// -- Position courante -- //
	private double posx = initx, posy = inity;
	private int angle = 90;
	private double teta;
	private boolean isDown;
	private Color color;
	
	public Traceur() {
		setTeta();
		setIsDown(true);
		// On initialise la couleur par defaut de nos lignes
		// Toutefois, en vue de la documentaton oracle, il semble
		// que BLACK soit la couleur par defaut (ceci est donc facultatif)
		setColor(Color.BLACK);
	}

	public void setGraphics(Group g) {
		this.g = g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		// Si le crayon est descendu, on trace la ligne, sinon on avance juste
		if (getIsDown()) {
			Line line = new Line(x1,y1,x2,y2);
			line.setStroke(getColor());
			g.getChildren().add(line);
		}
		posx = a;
		posy = b;
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void lc() {
		setIsDown(false);
	}
	
	public void bc() {
		setIsDown(true);
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}
	
	private void setIsDown(boolean b) {
		isDown = b;
	}
	
	private void setColor(Color c) {
		color = c;
	}
	
	private Color getColor() {
		return this.color;
	}
	
	public boolean getIsDown() {
		return this.isDown;
	}
	
	public void fcc(double couleur) throws IllegalArgumentException {
		// Comme nous travaillons aves des doubles partout dans
		// ce projet, l'argument de cette fonction est aussi un double
		// et on assure la conversion de double vers int
		int c = (int) Math.round(couleur);
		switch (c) {
		case 0: 
			setColor(Color.BLACK);
			break;
		case 1: 
			setColor(Color.RED);
			break;
		case 2: 
			setColor(Color.GREEN);
			break;
		case 3: 
			setColor(Color.YELLOW);
			break;
		case 4: 
			setColor(Color.BLUE);
			break;
		case 5: 
			setColor(Color.PURPLE);
			break;
		case 6: 
			setColor(Color.LIGHTBLUE);
			break;
		case 7: 
			setColor(Color.WHITE);
			break;
		default:
			setColor(Color.BLACK);
			throw new IllegalArgumentException(String.format("Invalid color code: '%1$d' is not supported (default is BLACK)", c));
		}
	}
	
	public void fpos(double x, double y) {
		posx = x;
		posy = y;
	}
	
	public void re(double r) {
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if (getIsDown()) {
			Line line = new Line(x1,y1,x2,y2);
			line.setStroke(getColor());
			g.getChildren().add(line);
		}
		posx = a;
		posy = b;
	}
	
	public void ve() {
		// -- Nettoyage de la zone de dessin -- //
		g.getChildren().clear();
	}
}
