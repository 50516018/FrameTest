package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Caluculation_lib;

import java.awt.event.WindowListener;


public class Frame_view extends Frame implements ActionListener,WindowListener
{
	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private Button button1 = new Button("Žl‘¥‰‰ŽZ");
	private TextField text3 = new TextField("", 10);
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);

	public Frame_view(){
		addWindowListener(this);
		setTitle("FrameTest");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		button1.addActionListener(this);
		add(new Label("‘«‚µŽZ“š‚¦"));
		add(text3);
		add(new Label("ˆø‚«ŽZ“š‚¦"));
		add(text4);
		add(new Label("Š|‚¯ŽZ“š‚¦"));
		add(text5);
		add(new Label("Š„‚èŽZ“š‚¦"));
		add(text6);
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double val1 = Double.parseDouble(text1.getText());
		double val2 = Double.parseDouble(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Caluculation_lib clib = new Caluculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getplus()));
		text4.setText(String.valueOf(clib.getMinus()));
		text5.setText(String.valueOf(clib.getSeki()));
		text6.setText(String.valueOf(clib.getSyou()));
	}

}
