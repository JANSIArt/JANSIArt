package ansi.Controller;

import ansi.ArtWorkModel;

public abstract class GUIController implements org.eclipse.swt.widgets.Listener {
	protected ArtWorkModel model;
	protected int type;
	public GUIController(ArtWorkModel m, int t){
		type = t;
		model = m;
	}
	public int getType(){
		return this.type;
	}
}
