package ansi.Controller;

import ansi.ArtWorkModel;

import org.eclipse.swt.widgets.Event;


/**
 * 
 * Get input from user, notify model and view to change their content 
 * Has mouse controller, keyboard controller, File Open Controller
 * 
 */
public class MouseController extends GUIController{
	public MouseController(ArtWorkModel m, int t){
		super(m, t);
	}
	public void handleEvent(Event e){
		System.out.println("GetMouse!");
		/*Change cursor or hover the target will cause view to change*/
	}
}
