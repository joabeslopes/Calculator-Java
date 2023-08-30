package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class guiCalculator extends JFrame {

	final int WIDHT = 350;
	final int HEIGHT = 390;
	private JTextField textFieldInput;
	private String input;
	private String regexNumb = "[0-9]*.[0-9]*";
	private double numb = 0.0;
	private double result = 0.0;
	private JTextField textFieldResult;
	boolean pointPressed = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiCalculator frame = new guiCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public guiCalculator() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				textFieldInput.requestFocus();
			}
		});
		
		setResizable(false);
		setSize(WIDHT, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, WIDHT, HEIGHT);
		panel.setBackground(new Color(129, 61, 156));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textFieldInput = new JTextField();
		textFieldInput.setEditable(false);

		textFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInput.setFont(new Font("Dialog", Font.PLAIN, 20));
		textFieldInput.setBounds(12, 57, 326, 40);
		textFieldInput.setColumns(10);
		panel.add(textFieldInput);
		
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Double.parseDouble(input);
					result +=numb;
					textFieldResult.setText(Double.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				pointPressed = false;
			}
		});
		
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 22));
		btnAdd.setBounds(247, 109, 80, 50);
		panel.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Double.parseDouble(input);
					result -=numb;
					textFieldResult.setText(Double.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				pointPressed = false;
			}
		});
		btnSub.setFont(new Font("Dialog", Font.BOLD, 22));
		btnSub.setBounds(247, 171, 80, 50);
		panel.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Double.parseDouble(input);
					result *=numb;
					textFieldResult.setText(Double.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				pointPressed = false;
			}
		});
		btnMult.setFont(new Font("Dialog", Font.BOLD, 22));
		btnMult.setBounds(247, 232, 80, 50);
		panel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Double.parseDouble(input);
					result /=numb;
					textFieldResult.setText(Double.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				pointPressed = false;
				
			}
		});
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 22));
		btnDiv.setBounds(247, 294, 80, 50);
		panel.add(btnDiv);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = 0;
				numb = 0;
				pointPressed = false;
				textFieldResult.setText(Double.toString(result) );
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 20));
		btnClear.setBounds(22, 294, 95, 50);
		panel.add(btnClear);
		
		textFieldResult = new JTextField();
		textFieldResult.setText("0.0");
		textFieldResult.setEditable(false);
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Dialog", Font.PLAIN, 20));
		textFieldResult.setBounds(115, 12, 120, 35);
		textFieldResult.setColumns(10);
		panel.add(textFieldResult);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("1"));
			}
		});
		button1.setFont(new Font("Dialog", Font.BOLD, 20));
		button1.setBounds(22, 109, 50, 50);
		panel.add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("2"));
			}
		});
		button2.setFont(new Font("Dialog", Font.BOLD, 20));
		button2.setBounds(102, 109, 50, 50);
		panel.add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("3"));
			}
		});
		button3.setFont(new Font("Dialog", Font.BOLD, 20));
		button3.setBounds(178, 109, 50, 50);
		panel.add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("4"));
			}
		});
		button4.setFont(new Font("Dialog", Font.BOLD, 20));
		button4.setBounds(22, 171, 50, 50);
		panel.add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("5"));
			}
		});
		button5.setFont(new Font("Dialog", Font.BOLD, 20));
		button5.setBounds(102, 171, 50, 50);
		panel.add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("6"));
			}
		});
		button6.setFont(new Font("Dialog", Font.BOLD, 20));
		button6.setBounds(178, 171, 50, 50);
		panel.add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("7"));
			}
		});
		button7.setFont(new Font("Dialog", Font.BOLD, 20));
		button7.setBounds(22, 232, 50, 50);
		panel.add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("8"));
			}
		});
		button8.setFont(new Font("Dialog", Font.BOLD, 20));
		button8.setBounds(102, 232, 50, 50);
		panel.add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("9"));
			}
		});
		button9.setFont(new Font("Dialog", Font.BOLD, 20));
		button9.setBounds(178, 232, 50, 50);
		panel.add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("0"));
			}
		});
		button0.setFont(new Font("Dialog", Font.BOLD, 20));
		button0.setBounds(178, 294, 50, 50);
		panel.add(button0);
		

		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!pointPressed) {
					input = textFieldInput.getText();
					textFieldInput.setText(input.concat("."));
					pointPressed = true;
				}
			}
		});
		buttonPoint.setFont(new Font("Dialog", Font.BOLD, 20));
		buttonPoint.setBounds(126, 294, 43, 50);
		panel.add(buttonPoint);

	}
}
