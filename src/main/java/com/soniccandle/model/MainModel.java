package com.soniccandle.model;

import java.awt.Container;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.soniccandle.model.ImageSequence;

public class MainModel {
	public JFileChooser fcBG;
	public JFileChooser fcIn;
	public JFileChooser fcOut;
	public Container pane;
	public JButton setAudioButton;
	public JLabel audioFileNameLabel;
	public File audioFile;
	public File outputTo;
	public JButton setOutputButton;
	public JLabel outputToNameLabel;
	public JButton renderButton;
	public JProgressBar progressBar;
	public JComboBox<String> outputMethod;
	public JTextField bgColorRed;
	public JTextField bgColorGreen;
	public JTextField bgColorBlue;
	public JPanel bgColorPanel;
	public JPanel bgBuiltInPanel;
	public JPanel bgOtherImagePanel;
	public JPanel bgImageSequencePanel;
	public File backgroundImageFile;
	public ImageSequence bgImageSequence;
	public JLabel bgImageNamelabel;
	public JLabel bgSequenceFFLabel;
	public JButton setBgOtherImageButton;
	public JButton setBgSequenceFFButton;
	public ButtonGroup bgTypeGroup;
	public JComboBox<String> bgBuiltIn;
	public JRadioButton flatColorRb;
	public JRadioButton builtInImageRb;
	public JRadioButton otherImageRb;
	public JRadioButton imageSequenceRb;
	public JComboBox<String> barStyle;
	public JTextField barColorRed;
	public JTextField barColorGreen;
	public JTextField barColorBlue;
	public JTextField videoSetFrameRate;
	public JTextField videoSetWidth;
	public JTextField videoSetHeight;
	public JTextField barAlpha;
	public JPanel videoProperties;
	public JTextField previewFrame;
	public JButton previewButton;
	public JButton detailsButton;
	public JButton bgColorButton;
	public JButton barColorButton;

}
