package Musica;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textalbum;
	private JTextField textartista;
	private JTextField textgenero;
	private JTextField textnombre;
	ListaDe ld=new ListaDe();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Blanca Gisela\\Downloads\\music-note-1275177_960_720.png"));
		setTitle("Musica");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnIngresarNodoAdelante = new JButton("Ingresar nodo Adelante");
		btnIngresarNodoAdelante.setForeground(Color.BLACK);
		btnIngresarNodoAdelante.setBounds(276, 20, 181, 23);
		btnIngresarNodoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textid.getText().isEmpty()||textnombre.getText().isEmpty()||textalbum.getText().isEmpty()||textartista.getText().isEmpty()||textgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Verifique sus datos");
				}else {


					musica ingresar=new musica();
					ingresar.setId_cancion(textid.getText());
					ingresar.setNombrecancion(textnombre.getText());
					ingresar.setAlbum(textalbum.getText());
					ingresar.setArtista(textartista.getText());
					ingresar.setGenero(textgenero.getText());


					ld.insertarfinal(ingresar);
					JOptionPane.showMessageDialog(null,"valores insertados adelante");
					textid.setText("");
					textnombre.setText("");
					textalbum.setText("");
					textartista.setText("");
					textgenero.setText("");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnIngresarNodoAdelante);

		JButton btnIngresarNodoAtras = new JButton("Ingresar nodo Atras ");
		btnIngresarNodoAtras.setForeground(Color.BLACK);
		btnIngresarNodoAtras.setBounds(276, 47, 181, 23);
		btnIngresarNodoAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textid.getText().isEmpty()||textnombre.getText().isEmpty()||textalbum.getText().isEmpty()||textartista.getText().isEmpty()||textgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"verifique sus datos ");
				}else {


					musica nuevo=new musica ();
					nuevo.setId_cancion(textid.getText());
					nuevo.setNombrecancion(textnombre.getText());
					nuevo.setAlbum(textalbum.getText());
					nuevo.setArtista(textartista.getText());
					nuevo.setGenero(textgenero.getText());


					ld.insertarfinal(nuevo);
					JOptionPane.showMessageDialog(null,"valores insertados atras");
					textid.setText("");
					textnombre.setText("");
					textalbum.setText("");
					textartista.setText("");
					textgenero.setText("");
				}
			}
		});
		contentPane.add(btnIngresarNodoAtras);

		JButton btnEliminarPrimerNodo = new JButton("Eliminar primer Nodo");
		btnEliminarPrimerNodo.setForeground(Color.BLACK);
		btnEliminarPrimerNodo.setBounds(276, 81, 181, 23);
		btnEliminarPrimerNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Eliminar?", "!!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarprimero();
					JOptionPane.showMessageDialog(null, "Eliminado ");
				}
				else
					JOptionPane.showMessageDialog(null, "Error ");


			}
		});
		contentPane.add(btnEliminarPrimerNodo);

		JButton btnEliminarUltimoNodo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimoNodo.setForeground(Color.BLACK);
		btnEliminarUltimoNodo.setBounds(276, 122, 181, 23);
		btnEliminarUltimoNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Eliminar?", "!!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarultimo();
					JOptionPane.showMessageDialog(null, "Eliminado");
				}
				else
					JOptionPane.showMessageDialog(null, "Error");


			}
		});
		contentPane.add(btnEliminarUltimoNodo);



		JButton btnRecorridoAdelante = new JButton("Recorrido adelante");
		btnRecorridoAdelante.setForeground(Color.BLACK);
		btnRecorridoAdelante.setBounds(276, 164, 147, 23);
		btnRecorridoAdelante.addMouseListener(new MouseAdapter() {
			
		
		});
		contentPane.add(btnRecorridoAdelante);

		JButton btnRecorridoAtras = new JButton("Recorrido atras");
		btnRecorridoAtras.setForeground(Color.BLACK);
		btnRecorridoAtras.setBounds(276, 198, 147, 23);
		btnRecorridoAtras.addMouseListener(new MouseAdapter() {
			
			
		});
		contentPane.add(btnRecorridoAtras);

		JLabel lblIngreseIdDe = new JLabel("ID CANCION");
		lblIngreseIdDe.setBounds(10, 23, 162, 18);
		lblIngreseIdDe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblIngreseIdDe);

		JLabel lblIngreseElAlbum = new JLabel("ALBUM");
		lblIngreseElAlbum.setBounds(20, 87, 140, 14);
		lblIngreseElAlbum.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblIngreseElAlbum);

		JLabel lblIngreseElArtista = new JLabel("ARTISTA");
		lblIngreseElArtista.setBounds(20, 127, 147, 14);
		lblIngreseElArtista.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblIngreseElArtista);

		JLabel lblIngreseElGenero = new JLabel("GENERO");
		lblIngreseElGenero.setBounds(20, 164, 140, 14);
		lblIngreseElGenero.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblIngreseElGenero);

		textid = new JTextField();
		textid.setBounds(90, 21, 112, 20);
		contentPane.add(textid);
		textid.setColumns(10);

		textalbum = new JTextField();
		textalbum.setBounds(90, 83, 112, 20);
		contentPane.add(textalbum);
		textalbum.setColumns(10);

		textartista = new JTextField();
		textartista.setBounds(90, 123, 112, 20);
		contentPane.add(textartista);
		textartista.setColumns(10);

		textgenero = new JTextField();
		textgenero.setBounds(90, 160, 112, 20);
		contentPane.add(textgenero);
		textgenero.setColumns(10);

		JLabel lblNombreDeLa = new JLabel("NOMBRE");
		lblNombreDeLa.setBounds(20, 52, 162, 14);
		lblNombreDeLa.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		contentPane.add(lblNombreDeLa);

		textnombre = new JTextField();
		textnombre.setBounds(90, 52, 112, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);

	}
}