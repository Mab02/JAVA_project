package fr.tp.inf112.projects.canvas.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class StartAnimationMenuItem extends JMenuItem implements ActionListener {
	
	private final CanvasViewer canvasViewer;

	public StartAnimationMenuItem( final CanvasViewer canvasViewer ) {
		super( "Start Animation" );
		this.canvasViewer = canvasViewer;
		addActionListener( this );
		
		setEnabled( !canvasViewer.isAnimationRunning() );
	}

	@Override
	public void actionPerformed( ActionEvent evt ) {
		canvasViewer.startAnimation();
	}
	
	@Override
	public void repaint() {
		if ( canvasViewer != null ) {
			setEnabled( !canvasViewer.isAnimationRunning() );
		}
		
		super.repaint();
	}
}
