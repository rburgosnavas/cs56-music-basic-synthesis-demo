package edu.ucsb.cs56.projects.music.basic_synthesis_demo;

import java.lang.Math;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;

/**
   @author Chris Atanasian
   @author Marc Lindsay

   A melody gui for the music sythesis program.
   Allows editing of the parameters with JTextFields and JSliders.
   There is a play sound button that plays the sound with the parameters set.
   There is a button that adds the note to a list.
   There is a button that plays the notes in the list as a melody.
*/

public class MelodyGui extends BasicGuiForSynth
    implements ActionListener, ChangeListener {
    
    /**
       creates the GUI, calling BasicGuiForSynth's go method first
    */
    
    public void go(JFrame frame) {
	super.go(frame);
	
	JPanel buttonRows = new JPanel();	
	buttonRows.setLayout(new GridLayout(2,1));
		
	JPanel saveFunctionality = new JPanel();
	saveFunctionality.setLayout(new GridLayout(5,1));
	
	JPanel topButtonRow = new JPanel();	
	topButtonRow.setLayout(new GridLayout(1,2));
	
	JRadioButton noteOne = new JRadioButton("One");	
	JRadioButton noteTwo = new JRadioButton("Two");
	JRadioButton noteThree = new JRadioButton("Three");	
	JRadioButton noteFour = new JRadioButton("Four");
	JRadioButton noteFive = new JRadioButton("Five");
	
	saveFunctionality.add(noteOne);
	saveFunctionality.add(noteTwo);
	saveFunctionality.add(noteThree);
	saveFunctionality.add(noteFour);
	saveFunctionality.add(noteFive);
	
	JButton saveButton = new JButton("Save Note");
	JButton melodyButton = new JButton("Play Melody!");

	topButtonRow.add(saveButton);
	topButtonRow.add(super.playButton);
	buttonRows.add(topButtonRow);	
	//buttonRows.add(saveFunctionality);
	buttonRows.add(melodyButton);

	frame.add(buttonRows, BorderLayout.SOUTH);
	frame.add(saveFunctionality, BorderLayout.EAST);

	frame.setVisible(true);
    }
    
    /**
       executes the program so it will run
    */

    public static void main(String[] args) {
	MelodyGui melodyGui = new MelodyGui();
	JFrame frame = new JFrame();
	melodyGui.go(frame);
    }
}
