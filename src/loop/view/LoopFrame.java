package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;
/**
 * GUI Framework for Loop project.
 * @author Mikel North
 * @version 1.0 11/5/13 basic setup of class.
 */
public class LoopFrame extends JFrame
{
	private LoopController baseController;
	private LoopPanel basePanel;
	/**
	 * creates a JFrame based window for the loop project.
	 * @param basecontroller a link to the controller vor MVC paradigm.
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	/**
	 * sets up the frame for the GUI
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(550,350);
		this.setVisible(true);
	}
}
