package ansi;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

import ansi.Controller.*;


public class MainEntry {

	protected Shell shlJansiart;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		try {
			ArtWorkModel m = new ArtWorkModel();
			
			/*Should Implement Factory pattern to generate listeners*/
			MouseController c = new MouseController(m, SWT.MouseDown);
			GUIController[] list = new GUIController[1];
			list[0] = c;
			/*End binding*/
			
			GUIView window = new GUIView(list); // Link GUI components to controllers.
			m.addObserver(window);              // When data updating has finished, 
												// the notifyObservers() will call view to update. 
			window.open();						// Program Start.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
