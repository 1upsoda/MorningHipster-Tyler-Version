package src.ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import src.ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	/**
	 * starts the controller
	 */
	private HipsterAppController baseController;
	/**
	 * makes a list that uses the albums
	 */
	private JComboBox albumBox;
	/**
	 * the text that changes depending on what song is chosen
	 */
	private JLabel albumLabel;
	/**
	 * the picture of me
	 */
	private JLabel hipsterImage;
	/**
	 * they way to hold the things in the panel
	 */
	private SpringLayout baseLayout;
	
	/**
	 * sets the info for everything
	 * @param baseController
	 */
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album Information");
		
		hipsterImage = new JLabel("Me as a Hipster", new ImageIcon(HipsterPanel.class.getResource("/src/ctec/hipster/view/images/isaac3.jpg")), JLabel.CENTER);
		
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 80, SpringLayout.NORTH, this);
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * sets the model 
	 */
	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getMyHipster().getHipsterAlbums()));
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(400, 600);
		this.setBackground(Color.ORANGE);
		this.add(hipsterImage);
		this.add(albumLabel);
		this.add(albumBox);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 32, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 158, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, hipsterImage, 115, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 41, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, albumBox, -150, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{

			@Override
			public void itemStateChanged(ItemEvent itemSelected)
			{
				if(albumBox.getSelectedIndex() == 2)
				{
					albumLabel.setText("real hipster");
					hipsterImage.setIcon(new ImageIcon(HipsterPanel.class.getResource("/src/ctec/hipster/view/images/hipsTyler.jpg")));
				}
				else
				{
					albumLabel.setText("not really hipster");
					hipsterImage.setIcon(new ImageIcon(HipsterPanel.class.getResource("/src/ctec/hipster/view/images/isaac3.jpg")));
				}
			}
			
		});
	}

}
