package view;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IElement;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewPanel.
 * 
 * @author Thibault, Timoté, Andréas, Thomas
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	
	/** The image. */
	private Image image;
	
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		try {
			this.image = ImageIO.read(getClass().getResource("/"+ "Air.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {

		Font font = new Font("Arial",Font.TYPE1_FONT,10);
        graphics.setFont(font);
        
        IModel model = this.getViewFrame().getModel();
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		for (int y = 0 ; y < model.getMap().size() ; y++ ) {
			System.out.print("| ");
			for (int x = 0 ; x < model.getMap().get(y).size() ; x++ ) {
				
				IElement Element = model.getMapElement(y, x);
				if (Element != null) {
					System.out.printf("%s ", Element.getSprite().getConsoleImage());
					graphics.drawImage(Element.getSprite().getImage(), Element.getPosition().getX()*32 , Element.getPosition().getY()*32 , 32,32, this);
				} else {
					System.out.print("  ");
					graphics.drawImage(this.image, x*32 , y*32 , 32, 32, this);
					
				}
			}
			System.out.println("|");
		}
		System.out.println("#=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=#");
	}
}

