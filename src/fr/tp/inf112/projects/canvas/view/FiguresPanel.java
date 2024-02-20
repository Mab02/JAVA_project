package fr.tp.inf112.projects.canvas.view;
import java.util.Random;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Collection;
import java.util.Map;

import javax.swing.JPanel;

import fr.tp.inf112.projects.canvas.controller.Controller;
import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.FigureStyle;
import fr.tp.inf112.projects.canvas.model.OvalFigure;
import fr.tp.inf112.projects.canvas.model.PolygonFigure;
import fr.tp.inf112.projects.canvas.model.RectangleFigure;

@SuppressWarnings("serial")
public class FiguresPanel extends JPanel {
	
	private final Controller controler;

	public FiguresPanel( 	final Dimension panelSize,
							final Controller controler) {
		super();
		
		this. controler =  controler;
		
		setSize( panelSize );
		setPreferredSize( getSize() );
	}


	@Override
	public void paint( final Graphics drawingTool ) {
		super.paint( drawingTool );
		
		final Color previousColor = drawingTool.getColor();
		
		drawingTool.drawRect( 0, 0, scaleX( controler.getCanvasWidth() ), scaleY( controler.getCanvasHeight() ) );
		
		for ( final Figure figure : controler.getCanvasFigures() ) {
			final int scaledxCoordinate =  scaleX( figure.getxCoordinate() );
			final int scaledyCoordinate =  scaleY( figure.getyCoordinate() );
			
			final Color fillColor = mapColor( );
			
			drawingTool.setColor( fillColor == null ? previousColor : fillColor );
			
			if ( figure instanceof PolygonFigure ) {
				final Map<Integer, Integer> points = ( (PolygonFigure) figure ).getPoints();
				final int[] xCoord = scaleX( points.keySet() );//points.keySet().stream().mapToInt( Integer::intValue ).toArray();
				final int[] yCoord = scaleY( points.values() );//points.values().stream().mapToInt( Integer::intValue ).toArray();
				
				if ( fillColor == null ) {
					drawingTool.drawPolygon( xCoord, yCoord, points.size() );
				}
				else {
					drawingTool.fillPolygon( xCoord, yCoord, points.size() );
				}
			}
			else if ( figure instanceof OvalFigure ) {
				final OvalFigure ovalFig = (OvalFigure) figure;

				if ( fillColor == null ) {
					drawingTool.drawOval( scaledxCoordinate, scaledyCoordinate, scaleX( ovalFig.getWidth() ), scaleY( ovalFig.getHeight() ) );
				}
				else {
					drawingTool.fillOval( scaledxCoordinate, scaledyCoordinate, scaleX( ovalFig.getWidth() ), scaleY( ovalFig.getHeight() ) );
				}
			}
			else if ( figure instanceof RectangleFigure ) {
				final RectangleFigure rectFig = (RectangleFigure) figure;
				if ( fillColor == null ) {
					drawingTool.drawRect( scaledxCoordinate, scaledyCoordinate, scaleX( rectFig.getWidth() ), scaleY( rectFig.getHeight() ) );
				}
				else {
					drawingTool.fillRect( scaledxCoordinate, scaledyCoordinate, scaleX( rectFig.getWidth() ), scaleY( rectFig.getHeight() ) );
				}
			}
			else {
				throw new IllegalArgumentException( "Unknown figure of type '" + figure + "'" );
			}
			
			drawingTool.setColor( previousColor );
			drawingTool.drawString( figure.getName(), scaledxCoordinate, scaledyCoordinate );
		}
	}
	
	private Color mapColor( ) {
		
		Random random = new Random();

		return new Color( random.nextInt(255), random.nextInt(255),random.nextInt(255));
	}
	
	private int scaleX( int value ) {
		return value * getWidth() / controler.getCanvasWidth();
	}

	private int[] scaleX( Collection<Integer> values ) {
		final int[] scaledValues = new int[ values.size() ];
		int index = 0;
		
		for ( final Integer value : values ) {
			scaledValues[ index++ ] = scaleX( value );
		}
		
		return scaledValues;
	}
	
	private int scaleY( int value ) {
		return value * getHeight() / controler.getCanvasHeight();
	}

	private int[] scaleY( Collection<Integer> values ) {
		final int[] scaledValues = new int[ values.size() ];
		int index = 0;
		
		for ( final Integer value : values ) {
			scaledValues[ index++ ] = scaleX( value );
		}
		
		return scaledValues;
	}
}
