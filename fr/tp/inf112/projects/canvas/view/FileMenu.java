package fr.tp.inf112.projects.canvas.view;

import javax.swing.JMenu;

@SuppressWarnings("serial")
public class FileMenu extends JMenu {
	
	public FileMenu( CanvasViewer canvasViewer ) {
		super( "File" );

		add( new QuitMenuItem( canvasViewer ) );
	}
}
