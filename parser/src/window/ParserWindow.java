package window;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import parser.EG2;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class ParserWindow {

	private JFrame frmMinic;
	boolean key = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParserWindow window = new ParserWindow();
					window.frmMinic.setVisible(true);
					//EG2.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ParserWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinic = new JFrame();
		frmMinic.setResizable(false);
		frmMinic.setTitle("MiniC\u7F16\u8BD1\u5668");
		frmMinic.setBounds(100, 100, 666, 550);
		frmMinic.setLocationRelativeTo(null);
		frmMinic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinic.getContentPane().setLayout(null);
		
		final TextArea textArea = new TextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textArea.setBounds(141, 112, 494, 392);
		textArea.setEditable(false);	
		
		frmMinic.getContentPane().add(textArea);
		
		final JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u6587\u4EF6");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		lblNewLabel.setBounds(307, 66, 90, 31);
		frmMinic.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\u8BCD\u6CD5\u5206\u6790");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = "Lexical.txt";
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("´Ê·¨·ÖÎö");
				// EG2.showLexical();
			}
		});
		btnNewButton.setBounds(14, 218, 113, 40);
		frmMinic.getContentPane().add(btnNewButton);

		JButton button = new JButton("\u8BED\u6CD5\u5206\u6790");
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = "ParserTree.txt";
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("Óï·¨Ê÷");
				// EG2.showParserTree();
			}
		});
		button.setBounds(14, 271, 113, 40);
		frmMinic.getContentPane().add(button);

		JButton button_1 = new JButton("\u56DB\u5143\u5F0F");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = "QTList.txt";
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("ËÄÔªÊ½");
			}
		});
		button_1.setBounds(14, 324, 113, 40);
		frmMinic.getContentPane().add(button_1);

		JButton button_2 = new JButton("\u7B26\u53F7\u8868");
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = "ArgList.txt";
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("·ûºÅ±í");
				// EG2.showArgList();
			}
		});
		button_2.setBounds(14, 377, 113, 40);
		frmMinic.getContentPane().add(button_2);

		JButton button_3 = new JButton("\u9519\u8BEF\u4FE1\u606F");
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = "ErrorList.txt";
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("´íÎóÁÐ±í");
				// EG2.showErrorList();
			}
		});
		button_3.setBounds(14, 430, 113, 40);
		frmMinic.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u8BFB\u53D6\u6587\u4EF6");
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser jChooser = new JFileChooser("./");
				jChooser.setDialogTitle("open file");
				int returnVal = jChooser.showOpenDialog(null);
				java.io.File file =jChooser.getSelectedFile();
				if (JFileChooser.APPROVE_OPTION == returnVal) {
					EG2.filePath = file.getAbsolutePath();
					EG2 parser = null;
					
				    FileInputStream fileInput = null;
				    try
				    {
				      fileInput = new FileInputStream(EG2.filePath);
				    }
				    catch (FileNotFoundException e1)
				    {
				      // TODO Auto-generated catch block
				      //e1.printStackTrace();
				      String errorInfo = "Error: File can not found.";
				      EG2.errorList.addError(errorInfo);
				    }
				    //System.out.println("Reading from file: " + filePath);
				    if(key)
				    	EG2.ReInit(fileInput);
				    else
				    	parser = new EG2(fileInput);
					
					EG2.run(parser);
					key = true;
					//System.out.println(strPath);
				 }
			}
		});
		button_4.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button_4.setBounds(14, 112, 113, 40);
		frmMinic.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("\u6E90\u4EE3\u7801");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String pathname = EG2.filePath;
				String str = "";
				FileReader reader = null;
				try {
					reader = new FileReader(pathname);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader br = new BufferedReader(reader);
				String line;
				try {
					while ((line = br.readLine()) != null) {
						str += (line + "\n");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textArea.setText(str);
				lblNewLabel.setText("Ô´´úÂë");
			}
		});
		button_5.setFont(new Font("Ó×Ô²", Font.BOLD, 18));
		button_5.setBounds(14, 165, 113, 40);
		frmMinic.getContentPane().add(button_5);
		
		JLabel lblMinic = new JLabel("MiniC\u7F16\u8BD1\u5668");
		lblMinic.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 28));
		lblMinic.setBounds(268, 13, 180, 40);
		frmMinic.getContentPane().add(lblMinic);
		
		JLabel lbljinec = new JLabel("@Jinec");
		lbljinec.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbljinec.setBounds(44, 483, 72, 21);
		frmMinic.getContentPane().add(lbljinec);
		
	}
}
