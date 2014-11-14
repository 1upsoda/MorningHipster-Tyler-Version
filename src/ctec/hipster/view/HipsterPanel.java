package src.ctec.hipster.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import src.ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("Album Information");
		
		hipsterImage = new JLabel("Me as a Hipster", new ImageIcon(HipsterPanel.class.getResource("/src/ctec/hipster/view/images/hipsTyler.jpg")), JLabel.CENTER);
		
		albumBox = new JComboBox();
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 80, SpringLayout.NORTH, this);
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
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
