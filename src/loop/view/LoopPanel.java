package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;
import loop.model.Looper;

public class LoopPanel extends JPanel
{
	// Declaration Section
	private JButton submitButton;
	private JScrollPane textPane;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	protected String currentInput;
	private LoopController baseController;

	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		loopArea = new JTextArea(10, 35);
		textPane = new JScrollPane(loopArea);
		baseLayout = new SpringLayout();
		submitButton = new JButton("Click me to do something!");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(textPane);

		this.setBackground(Color.blue);

		loopArea.setEditable(false);
		loopArea.setWrapStyleWord(true);
		loopArea.setLineWrap(true);
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 27, SpringLayout.SOUTH, loopArea);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 147, SpringLayout.WEST, this);

	}

	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				loopArea.append(baseController.getLoopResults());
			}
		});
	}
}
