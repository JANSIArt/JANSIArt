package ansi;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainWIndow {

	protected Shell shlJansiart;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWIndow window = new MainWIndow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents(display);
		shlJansiart.open();
		shlJansiart.layout();
		while (!shlJansiart.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	/**
	 * Create contents of the window.
	 */
	protected void createContents(Display display) {
		shlJansiart = new Shell();
		shlJansiart.setSize(559, 460);
		shlJansiart.setText("JANSIART");
		shlJansiart.setLayout(new GridLayout(1, false));
		
		display.addFilter(SWT.MouseDown, new Listener(){
			public void handleEvent(Event e){
				System.out.println("Get mouse!");
			}
		});
		
		Menu menu = new Menu(shlJansiart, SWT.BAR);
		shlJansiart.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.NONE);
		mntmFile.setText("\u6A94\u6848");
		
		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("\u7DE8\u8F2F");
		
		MenuItem menuItem = new MenuItem(menu, SWT.NONE);
		menuItem.setText("\u6A21\u5F0F");
		
		MenuItem menuItem_1 = new MenuItem(menu, SWT.NONE);
		menuItem_1.setText("\u5DE5\u5177");
		
		MenuItem menuItem_2 = new MenuItem(menu, SWT.NONE);
		menuItem_2.setText("\u95DC\u65BC");
		
		Group group = new Group(shlJansiart, SWT.NONE);
		group.setLayout(new FormLayout());
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Group group_1 = new Group(group, SWT.NONE);
		group_1.setLayout(new FormLayout());
		FormData fd_group_1 = new FormData();
		fd_group_1.bottom = new FormAttachment(0, 295);
		fd_group_1.right = new FormAttachment(0, 540);
		fd_group_1.top = new FormAttachment(0, -16);
		fd_group_1.left = new FormAttachment(0, 7);
		group_1.setLayoutData(fd_group_1);
		
		Group group_2 = new Group(group_1, SWT.SHADOW_OUT);
		FormData fd_group_2 = new FormData();
		fd_group_2.bottom = new FormAttachment(0, 295);
		fd_group_2.right = new FormAttachment(0, 54);
		fd_group_2.top = new FormAttachment(0, -16);
		fd_group_2.left = new FormAttachment(0, -14);
		group_2.setLayoutData(fd_group_2);
		
		Group group_3 = new Group(group_2, SWT.NONE);
		group_3.setText("\u524D\u666F");
		group_3.setBounds(10, 22, 50, 126);
		
		Group group_4 = new Group(group_2, SWT.NONE);
		group_4.setText("\u80CC\u666F");
		group_4.setBounds(10, 169, 50, 105);
		
		Composite composite = new Composite(group_1, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 295);
		fd_composite.right = new FormAttachment(0, 530);
		fd_composite.top = new FormAttachment(0, -6);
		fd_composite.left = new FormAttachment(0, 60);
		composite.setLayoutData(fd_composite);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite.addPaintListener(new PaintListener(){
			public void paintControl(PaintEvent e){
				e.gc.setForeground(display.getSystemColor(SWT.COLOR_BLUE)); 
				e.gc.drawText("Hello World", 30, 30);
			}
		});
		Group group_5 = new Group(group, SWT.NONE);
		FormData fd_group_5 = new FormData();
		fd_group_5.bottom = new FormAttachment(0, 386);
		fd_group_5.right = new FormAttachment(0, 540);
		fd_group_5.top = new FormAttachment(0, 301);
		fd_group_5.left = new FormAttachment(0, -14);
		group_5.setLayoutData(fd_group_5);
		group_5.setLayout(null);
	}
}
