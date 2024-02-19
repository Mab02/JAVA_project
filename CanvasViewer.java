package fr.tp.inf112.projects.canvas.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import fr.tp.inf112.projects.canvas.controller.Controller;
import fr.tp.inf112.projects.canvas.model.Observer;

@SuppressWarnings("serial")
public class CanvasViewer extends JFrame implements Observer {

	private final Controller controller;
	
	private final FiguresPanel figuresPanel;
	
	public CanvasViewer( final Controller controller ) {
		super( controller.getCanvasName() );
		
		this.controller = controller;
		this.controller.addObserver( this );
		
		setJMenuBar( new CanvasViewerMenuBar( this ) );
		
		final Dimension screenSize = getToolkit().getScreenSize();
		final int panelWidth = screenSize.width - getInsets().left - getInsets().right;
		final int panelHeight = screenSize.width - getInsets().left - getInsets().right;
		figuresPanel = new FiguresPanel( new Dimension( panelWidth, panelHeight ), controller );
		setContentPane( figuresPanel );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		pack();
		setVisible( true );
	}

	@Override
	public void modelChanged() {
		getJMenuBar().repaint();
		figuresPanel.repaint();
	}
	
	public void startAnimation() {
		controller.startAnimation();
	}
	
	public void stopAnimation() {
		controller.stopAnimation();
	}
	
	public boolean isAnimationRunning() {
		return controller.isAnimationRunning();
	}
}
