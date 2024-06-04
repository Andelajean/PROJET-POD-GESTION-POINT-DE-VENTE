package Ventes;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class recu1 {

	private JFrame frame;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTable table;
	private DefaultTableModel tableModel;
	private JLabel lblTotal;

	private int numeroFacture = 1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recu1 window = new recu1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public recu1() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 643, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 2, 10, 10));

		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBackground(new Color(128, 128, 192));
		lblNom.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNom);

		txtNom = new JTextField();
		txtNom.setBackground(new Color(128, 128, 192));
		txtNom.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(txtNom);
		txtNom.setColumns(10);

		JLabel lblPrenom = new JLabel("Prénom:");
		lblPrenom.setBackground(new Color(128, 128, 192));
		lblPrenom.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblPrenom);

		txtPrenom = new JTextField();
		txtPrenom.setBackground(new Color(128, 128, 192));
		txtPrenom.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(txtPrenom);
		txtPrenom.setColumns(10);

		JLabel lblDate = new JLabel("Date de facturation:");
		lblDate.setBackground(new Color(128, 128, 192));
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblDate);

		JTextField txtDate = new JTextField();
		txtDate.setBackground(new Color(128, 128, 192));
		txtDate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(txtDate);
		txtDate.setColumns(10);
		txtDate.setEditable(false);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		txtDate.setText(dateFormat.format(new Date()));

		JLabel lblNumeroFacture = new JLabel("Numéro de facture:");
		lblNumeroFacture.setBackground(new Color(128, 128, 192));
		lblNumeroFacture.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNumeroFacture);

		JTextField txtNumeroFacture = new JTextField();
		txtNumeroFacture.setBackground(new Color(128, 128, 192));
		txtNumeroFacture.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel.add(txtNumeroFacture);
		txtNumeroFacture.setColumns(10);
		txtNumeroFacture.setEditable(false);

		JPanel panelTable = new JPanel();
		frame.getContentPane().add(panelTable, BorderLayout.CENTER);
		panelTable.setLayout(new BorderLayout(0, 0));

		tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Quantité", "Désignation",
				"Prix unitaire", "Montant" });
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panelTable.add(scrollPane, BorderLayout.CENTER);

		JPanel panelTotal = new JPanel();
		panelTotal.setBackground(new Color(128, 128, 128));
		panelTotal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(panelTotal, BorderLayout.SOUTH);
		panelTotal.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

		JLabel lblTotalLabel = new JLabel("Total:");
		panelTotal.add(lblTotalLabel);

		lblTotal = new JLabel("0.00");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelTotal.add(lblTotal);
		
		

		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBackground(new Color(64, 128, 128));
		btnAjouter.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String quantiteStr = JOptionPane.showInputDialog(frame, "Quantité :");
				String designation = JOptionPane.showInputDialog(frame, "Désignation :");
				String prixUnitaireStr = JOptionPane.showInputDialog(frame, "Prix unitaire :");

				try {
					int quantite = Integer.parseInt(quantiteStr);
					double prixUnitaire = Double.parseDouble(prixUnitaireStr);
					double montant = quantite * prixUnitaire;

					tableModel.addRow(new Object[] { quantite, designation, prixUnitaire, montant });

					double total = calculateTotal();
					lblTotal.setText(String.format("%.2f", total));
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Veuillez entrer des valeurs numériques valides.", "Erreur",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panelTable.add(btnAjouter, BorderLayout.SOUTH);

		JButton btnGenererFacture = new JButton("Générer Facture");
		btnGenererFacture.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnGenererFacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = txtNom.getText();
				String prenom = txtPrenom.getText();
				String dateFacturation = txtDate.getText();

				String numeroFacture = generateNumeroFacture();

				StringBuilder sb = new StringBuilder();
				sb.append("Numéro de facture: ").append(numeroFacture).append("\n");
				sb.append("Nom: ").append(nom).append("\n");
				sb.append("Prénom: ").append(prenom).//Voici la suite du code :

//```java
append("\n\n");
				sb.append("Date de facturation: ").append(dateFacturation).append("\n\n");

				sb.append("Détails de la facture:\n\n");

				for (int i = 0; i < tableModel.getRowCount(); i++) {
					int quantite = (int) tableModel.getValueAt(i, 0);
					String designation = (String) tableModel.getValueAt(i, 1);
					double prixUnitaire = (double) tableModel.getValueAt(i, 2);
					double montant = (double) tableModel.getValueAt(i, 3);

					sb.append("Désignation: ").append(designation).append("\n");
					sb.append("Quantité: ").append(quantite).append("\n");
					sb.append("Prix unitaire: ").append(prixUnitaire).append("\n");
					sb.append("Montant: ").append(montant).append("\n\n");
				}

				sb.append("Total: ").append(lblTotal.getText());

				JOptionPane.showMessageDialog(frame, sb.toString(), "Facture", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panelTotal.add(btnGenererFacture);

		txtNumeroFacture.setText(generateNumeroFacture());
	}

	private double calculateTotal() {
		double total = 0;

		for (int i = 0; i < tableModel.getRowCount(); i++) {
			double montant = (double) tableModel.getValueAt(i, 3);
			total += montant;
		}

		return total;
	}

	private String generateNumeroFacture() {
		String numeroFacture = String.format("%04d", this.numeroFacture);
		this.numeroFacture++;
		return numeroFacture;
	}
}