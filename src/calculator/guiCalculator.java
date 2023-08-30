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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class guiCalculator extends JFrame {

	final int WIDHT = 350;
	final int HEIGHT = 390;
	private JTextField textFieldInput;
	private String input;
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
					frame.textFieldInput.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public guiCalculator() {
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
		textFieldInput.setBounds(22, 57, 305, 40);
		textFieldInput.setColumns(10);
		panel.add(textFieldInput);
		
		
		// +
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				numb = Double.parseDouble(input);
				result +=numb;
				textFieldResult.setText(Double.toString(result) );
				numb = 0;
				
				textFieldInput.setText("");
				pointPressed = false;
				textFieldInput.requestFocus();
			}
		});
		buttonAdd.setFont(new Font("Dialog", Font.BOLD, 22));
		buttonAdd.setBounds(247, 109, 80, 50);
		panel.add(buttonAdd);
		
		
		// -
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				numb = Double.parseDouble(input);
				result -=numb;
				textFieldResult.setText(Double.toString(result) );
				numb = 0;
				textFieldInput.setText("");
				pointPressed = false;
				textFieldInput.requestFocus();
			}
		});
		buttonSub.setFont(new Font("Dialog", Font.BOLD, 22));
		buttonSub.setBounds(247, 171, 80, 50);
		panel.add(buttonSub);
		
		
		// *
		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				numb = Double.parseDouble(input);
				result *=numb;
				textFieldResult.setText(Double.toString(result) );
				numb = 0;

				textFieldInput.setText("");
				pointPressed = false;
				textFieldInput.requestFocus();
			}
		});
		buttonMult.setFont(new Font("Dialog", Font.BOLD, 22));
		buttonMult.setBounds(247, 232, 80, 50);
		panel.add(buttonMult);
		
		
		// /
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				numb = Double.parseDouble(input);
				result /=numb;
				textFieldResult.setText(Double.toString(result) );
				numb = 0;
				textFieldInput.setText("");
				pointPressed = false;
				textFieldInput.requestFocus();
				
			}
		});
		buttonDiv.setFont(new Font("Dialog", Font.BOLD, 22));
		buttonDiv.setBounds(247, 294, 80, 50);
		panel.add(buttonDiv);
		
		
		// Clear
		JButton buttonClear = new JButton("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = 0;
				numb = 0;
				textFieldResult.setText(Double.toString(result) );
				textFieldInput.setText("");
				pointPressed = false;
				textFieldInput.requestFocus();
				
			}
		});
		buttonClear.setFont(new Font("Dialog", Font.BOLD, 20));
		buttonClear.setBounds(22, 294, 95, 50);
		panel.add(buttonClear);
		
		
		textFieldResult = new JTextField();
		textFieldResult.setText("0.0");
		textFieldResult.setEditable(false);
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Dialog", Font.PLAIN, 20));
		textFieldResult.setBounds(102, 12, 150, 35);
		textFieldResult.setColumns(10);
		panel.add(textFieldResult);
		
		
		// 1
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("1"));
				textFieldInput.requestFocus();
			}
		});
		button1.setFont(new Font("Dialog", Font.BOLD, 20));
		button1.setBounds(22, 109, 50, 50);
		panel.add(button1);
		
		
		// 2
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("2"));
				textFieldInput.requestFocus();
			}
		});
		button2.setFont(new Font("Dialog", Font.BOLD, 20));
		button2.setBounds(102, 109, 50, 50);
		panel.add(button2);
		
		
		// 3
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("3"));
				textFieldInput.requestFocus();
			}
		});
		button3.setFont(new Font("Dialog", Font.BOLD, 20));
		button3.setBounds(178, 109, 50, 50);
		panel.add(button3);
		
		
		// 4
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("4"));
				textFieldInput.requestFocus();
			}
		});
		button4.setFont(new Font("Dialog", Font.BOLD, 20));
		button4.setBounds(22, 171, 50, 50);
		panel.add(button4);

		
		// 5
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("5"));
				textFieldInput.requestFocus();
			}
		});
		button5.setFont(new Font("Dialog", Font.BOLD, 20));
		button5.setBounds(102, 171, 50, 50);
		panel.add(button5);
		
		
		// 6
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("6"));
				textFieldInput.requestFocus();
			}
		});
		button6.setFont(new Font("Dialog", Font.BOLD, 20));
		button6.setBounds(178, 171, 50, 50);
		panel.add(button6);
		
		
		// 7
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("7"));
				textFieldInput.requestFocus();
			}
		});
		button7.setFont(new Font("Dialog", Font.BOLD, 20));
		button7.setBounds(22, 232, 50, 50);
		panel.add(button7);
		
		
		// 8
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("8"));
				textFieldInput.requestFocus();
			}
		});
		button8.setFont(new Font("Dialog", Font.BOLD, 20));
		button8.setBounds(102, 232, 50, 50);
		panel.add(button8);
		
		
		// 9
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("9"));
				textFieldInput.requestFocus();
			}
		});
		button9.setFont(new Font("Dialog", Font.BOLD, 20));
		button9.setBounds(178, 232, 50, 50);
		panel.add(button9);
		
		
		// 0
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText(input.concat("0"));
				textFieldInput.requestFocus();
			}
		});
		button0.setFont(new Font("Dialog", Font.BOLD, 20));
		button0.setBounds(178, 294, 50, 50);
		panel.add(button0);
		

		// .
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (!pointPressed) {
					input = textFieldInput.getText();
					textFieldInput.setText(input.concat("."));
					pointPressed = true;
					textFieldInput.requestFocus();
				}
			}
		});
		buttonPoint.setFont(new Font("Dialog", Font.BOLD, 20));
		buttonPoint.setBounds(126, 294, 43, 50);
		panel.add(buttonPoint);
		
		
		// Backspace
		JButton buttonBackspace = new JButton("<-");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = textFieldInput.getText();
				textFieldInput.setText( input.substring(0, input.length()-1) );
			}
		});
		buttonBackspace.setFont(new Font("Dialog", Font.BOLD, 15));
		buttonBackspace.setBounds(264, 12, 63, 33);
		panel.add(buttonBackspace);
		
		
		textFieldInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent k) {
			
				if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE)
			    {  
			        buttonBackspace.doClick();
			    } else 
			    {
			    	Character key = k.getKeyChar();
			    	String keyValue = key.toString();
					
					switch (keyValue) {
						case "0":
							button0.doClick();
							break;
						case "1":
							button1.doClick();
							break;
						case "2":
							button2.doClick();
							break;
						case "3":
							button3.doClick();
							break;
						case "4":
							button4.doClick();
							break;
						case "5":
							button5.doClick();
							break;
						case "6":
							button6.doClick();
							break;
						case "7":
							button7.doClick();
							break;
						case "8":
							button8.doClick();
							break;
						case "9":
							button9.doClick();
							break;
						case ".":
							buttonPoint.doClick();
							break;
						case "+":
							buttonAdd.doClick();
							break;
						case "-":
							buttonSub.doClick();
							break;
						case "/":
							buttonDiv.doClick();
							break;
						case "*":
							buttonMult.doClick();
							break;
					}
			    	
			    }

			
			}
		});

	}
}
