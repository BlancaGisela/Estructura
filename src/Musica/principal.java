package Musica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtid_cancion;
	private JTextField txtalbum;
	private JTextField txtartista;
	private JTextField txtgenero;
	ListaDe nueva=new ListaDe();
	

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
		setTitle("MUSICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 292);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNodoAdelante = new JButton("Insertar Nodo Adelante");
		btnNodoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NodoDe ejecutar=new NodoDe();
				
				ejecutar.setId_cancion(Integer.parseInt(txtid_cancion.getText()));
				ejecutar.setAlbum(txtalbum.getText());
				ejecutar.setArtista(txtartista.getText());
				ejecutar.setGenero(txtgenero.getText());
				
				nueva.insertarnodoadelante(ejecutar);
				JOptionPane.showMessageDialog(null, "Valores insertados correctamente.");
				
				
			}
		});
		btnNodoAdelante.setBounds(258, 35, 145, 23);
		contentPane.add(btnNodoAdelante);
		
		JButton btnNodoAtras = new JButton("Insertar Nodo Atras");
		btnNodoAtras.setBounds(243, 84, 168, 23);
		contentPane.add(btnNodoAtras);
		
		JButton btnEliminarPrimero = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimero.setBounds(243, 117, 168, 23);
		contentPane.add(btnEliminarPrimero);
		
		JButton btnEliminarUltimo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimo.setBounds(243, 151, 168, 23);
		contentPane.add(btnEliminarUltimo);
		
		JButton btnRecorridoAdelante = new JButton("Recorrido Adelante");
		btnRecorridoAdelante.setBounds(243, 185, 168, 23);
		contentPane.add(btnRecorridoAdelante);
		
		JButton btnRecorridoAtras = new JButton("Recorrido Atras");
		btnRecorridoAtras.setBounds(243, 219, 168, 23);
		contentPane.add(btnRecorridoAtras);
		
		JLabel lblIngreseElTipo = new JLabel("ID CANCION");
		lblIngreseElTipo.setBounds(26, 11, 168, 14);
		contentPane.add(lblIngreseElTipo);
		
		txtid_cancion = new JTextField();
		txtid_cancion.setBounds(26, 36, 129, 20);
		contentPane.add(txtid_cancion);
		txtid_cancion.setColumns(10);
		
		JLabel lblIngreseLaCancion = new JLabel("ALBUM");
		lblIngreseLaCancion.setBounds(26, 67, 110, 14);
		contentPane.add(lblIngreseLaCancion);
		
		txtalbum = new JTextField();
		txtalbum.setBounds(26, 92, 129, 20);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		JLabel lblIngreseElAlbum = new JLabel("ARTISTA");
		lblIngreseElAlbum.setBounds(26, 123, 110, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtartista = new JTextField();
		txtartista.setBounds(26, 148, 121, 20);
		contentPane.add(txtartista);
		txtartista.setColumns(10);
		
		JLabel lblIngreseElAutor = new JLabel("GENERO");
		lblIngreseElAutor.setBounds(26, 179, 98, 14);
		contentPane.add(lblIngreseElAutor);
		
		txtgenero = new JTextField();
		txtgenero.setBounds(26, 211, 129, 20);
		contentPane.add(txtgenero);
		txtgenero.setColumns(10);
	}
}