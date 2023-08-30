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

	final int WIDHT = 330;
	final int HEIGHT = 380;
	private JTextField textFieldInput;
	private String input;
	private String regexNumb = "[0-9]+";
	private int numb = 0;
	private int result = 0;
	private JTextField textFieldResult;
	
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

		textFieldInput.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInput.setFont(new Font("Dialog", Font.PLAIN, 20));
		textFieldInput.setBounds(12, 57, 306, 40);
		textFieldInput.setColumns(10);
		panel.add(textFieldInput);
		
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Integer.parseInt(input);
					result +=numb;
					textFieldResult.setText(Integer.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
			}
		});
		
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 22));
		btnAdd.setBounds(30, 109, 120, 60);
		panel.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Integer.parseInt(input);
					result -=numb;
					textFieldResult.setText(Integer.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
			}
		});
		btnSub.setFont(new Font("Dialog", Font.BOLD, 22));
		btnSub.setBounds(180, 109, 120, 60);
		panel.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Integer.parseInt(input);
					result *=numb;
					textFieldResult.setText(Integer.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
			}
		});
		btnMult.setFont(new Font("Dialog", Font.BOLD, 22));
		btnMult.setBounds(30, 188, 120, 60);
		panel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = textFieldInput.getText();
				if (input.matches(regexNumb) ) {
					numb = Integer.parseInt(input);
					result /=numb;
					textFieldResult.setText(Integer.toString(result) );
					numb = 0;
				}
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				
			}
		});
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 22));
		btnDiv.setBounds(180, 188, 120, 60);
		panel.add(btnDiv);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = 0;
				numb = 0;
				textFieldResult.setText(Integer.toString(result) );
				textFieldInput.setText("");
				textFieldInput.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 22));
		btnClear.setBounds(105, 260, 120, 70);
		panel.add(btnClear);
		
		textFieldResult = new JTextField();
		textFieldResult.setText("0");
		textFieldResult.setEditable(false);
		textFieldResult.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResult.setFont(new Font("Dialog", Font.PLAIN, 20));
		textFieldResult.setBounds(105, 12, 120, 35);
		textFieldResult.setColumns(10);
		panel.add(textFieldResult);

	}
}
