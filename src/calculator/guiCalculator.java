package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiCalculator extends JFrame {

	final int WIDHT = 330;
	final int HEIGHT = 380;
	private JTextField textField;
	private int numb = 0;
	private int result = 0;
	
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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.PLAIN, 20));
		textField.setBounds(12, 12, 306, 50);
		textField.setColumns(10);
		textField.setText(Integer.toString(result));
		panel.add(textField);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numb = Integer.parseInt(textField.getText() );
				result +=numb;
				textField.setText(Integer.toString(result) );
			}
		});
		
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 22));
		btnAdd.setBounds(25, 74, 125, 72);
		panel.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Dialog", Font.BOLD, 22));
		btnSub.setBounds(176, 74, 125, 72);
		panel.add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.setFont(new Font("Dialog", Font.BOLD, 22));
		btnMult.setBounds(25, 171, 125, 72);
		panel.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 22));
		btnDiv.setBounds(176, 171, 125, 72);
		panel.add(btnDiv);
		
		JButton btnResult = new JButton("=");
		btnResult.setFont(new Font("Dialog", Font.BOLD, 22));
		btnResult.setBounds(100, 260, 125, 72);
		panel.add(btnResult);

	}
}
