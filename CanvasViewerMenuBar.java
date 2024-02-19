package fr.tp.inf112.projects.canvas.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class CanvasViewerMenuBar extends JMenuBar {
	
	private final JMenu animateMenu;

	public CanvasViewerMenuBar( final CanvasViewer canvasViewer ) {
		super();

		add( new FileMenu( canvasViewer ) );
		
		animateMenu = new JMenu( "Animation" );
		animateMenu.add( new StartAnimationMenuItem( canvasViewer ) );
		animateMenu.add( new StopAnimationMenuItem( canvasViewer ) );
		add( animateMenu );
	}
	
	@Override
	public void repaint() {
		if ( animateMenu != null ) {
			for ( int index = 0; index < animateMenu.getItemCount(); index++ ) {
				animateMenu.getItem( index ).repaint();
			}
		}
	}
}
