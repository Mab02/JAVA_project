package fr.tp.inf112.projects.canvas.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class QuitMenuItem extends JMenuItem implements ActionListener {
	
	private final CanvasViewer canvasViewer;

	public QuitMenuItem(CanvasViewer canvasViewer) {
		super("Quit");
		this.canvasViewer = canvasViewer;
		addActionListener( this );
	}

	@Override
	public void actionPerformed( ActionEvent evt ) {
//		if ( drawingApp.isModified() ) {
//			int response = JOptionPane.showInternalOptionDialog(this, "Drawing not saved. Save it ?",
//					"Quit application", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,
//					null);
//			switch (response) {
//			case JOptionPane.CANCEL_OPTION:
//				return;
//			case JOptionPane.OK_OPTION:
//				drawingAppModel.saveToFile();
//				break;
//			case JOptionPane.NO_OPTION:
//				break;
//			}
//		}
		
		canvasViewer.dispose();
		canvasViewer.setVisible(false);
	}
}
