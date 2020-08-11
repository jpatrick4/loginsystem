package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField taxField;
	private JTextField subTotalField;
	private JTextField totalField;
	private JTextField classField;
	private JTextField ticketField;
	private JTextField adultField;
	private JTextField childField;
	private JTextField fromField;
	private JTextField toField;
	private JTextField dateField;
	private JTextField timeField;
	private JTextField ticketNumField;
	private JTextField priceField;
	private JTextField routeField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1270, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(137, 48, 927, 78);
		frame.getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Travelling Ticket Systems");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));

		JLabel lblTicketClass = new JLabel("Ticket Type");
		lblTicketClass.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTicketClass.setBounds(57, 142, 158, 31);
		frame.getContentPane().add(lblTicketClass);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(55, 215, 138, 29);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnEconomy.setBounds(55, 252, 138, 29);
		frame.getContentPane().add(rdbtnEconomy);

		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFirstClass.setBounds(55, 289, 138, 29);
		frame.getContentPane().add(rdbtnFirstClass);

		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnReturnTicket.setBounds(200, 252, 184, 29);
		frame.getContentPane().add(rdbtnReturnTicket);

		JRadioButton rdbtnSingle = new JRadioButton("Single Ticket");
		rdbtnSingle.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnSingle.setBounds(200, 215, 184, 29);
		frame.getContentPane().add(rdbtnSingle);

		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnAdult.setBounds(391, 215, 110, 29);
		frame.getContentPane().add(rdbtnAdult);

		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnChild.setBounds(391, 252, 110, 29);
		frame.getContentPane().add(rdbtnChild);

		JSeparator separator = new JSeparator();
		separator.setBounds(67, 189, 426, 14);
		frame.getContentPane().add(separator);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Kilburn", "Preston", "Oxford", "Leed"}));
		comboBox.setBounds(240, 307, 249, 26);
		frame.getContentPane().add(comboBox);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(57, 360, 436, 12);
		frame.getContentPane().add(separator_1);

		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTax.setBounds(57, 388, 69, 20);
		frame.getContentPane().add(lblTax);

		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSubtotal.setBounds(57, 424, 91, 20);
		frame.getContentPane().add(lblSubtotal);

		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal.setBounds(57, 460, 69, 20);
		frame.getContentPane().add(lblTotal);

		taxField = new JTextField();
		taxField.setFont(new Font("Tahoma", Font.BOLD, 18));
		taxField.setBounds(163, 385, 78, 26);
		frame.getContentPane().add(taxField);
		taxField.setColumns(10);

		subTotalField = new JTextField();
		subTotalField.setFont(new Font("Tahoma", Font.BOLD, 18));
		subTotalField.setBounds(163, 422, 78, 26);
		frame.getContentPane().add(subTotalField);
		subTotalField.setColumns(10);

		totalField = new JTextField();
		totalField.setFont(new Font("Tahoma", Font.BOLD, 18));
		totalField.setBounds(163, 458, 78, 26);
		frame.getContentPane().add(totalField);
		totalField.setColumns(10);

		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost, eco = 3.85, fClass = 5.60;

				// standard ticket=====================================================================
				if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
							&& comboBox.getSelectedItem().equals("Kilburn"))
					{
						totalCost = (tax * (MilesK8 * 2)) / 100;
						String sTax = String.format("$%.2f", totalCost);
						taxField.setText(sTax);
						String subTotal = String.format("$%.2f", MilesK8 * 2);
						subTotalField.setText(subTotal);
						String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
						totalField.setText(total);
						priceField.setText(total);
						classField.setText("STD");
						ticketField.setText("RETURN");
						adultField.setText("ONE");
						childField.setText("NIL");
					}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8 - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8 - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8 * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8 - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * MilesK8) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + MilesK8 - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnNewRadioButton.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("STD");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				// economy ticket=======================================================================
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + eco + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = ((tax * MilesK8 + eco)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + eco + MilesK8 - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8 * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + eco + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + eco + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8 * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + eco + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + eco + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8 * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + eco + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * MilesK8 + eco) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + eco);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + eco + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8 * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("ECONOMY");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				// first class====================================================================
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 + fClass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + fClass + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * MilesK8 + fClass) / 100;
					String sTax = String.format("$%.2f", (totalCost + fClass) - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + fClass + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Kilburn"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 + fClass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + fClass + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * MilesK8 + fClass) / 100;
					String sTax = String.format("$%.2f", (totalCost + fClass) - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + fClass + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Preston"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 + fClass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + fClass + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * MilesK8 + fClass) / 100;
					String sTax = String.format("$%.2f", (totalCost + fClass) - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + fClass + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Oxford"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 + fClass)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", totalCost + fClass + MilesK8);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnAdult.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + MilesK8) * 2);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("ONE");
					childField.setText("NIL");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnSingle.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * MilesK8 + fClass) / 100;
					String sTax = String.format("$%.2f", (totalCost + fClass) - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 + fClass);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", (totalCost + fClass + MilesK8) - 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("ONE WAY");
					adultField.setText("NIL");
					childField.setText("ONE");
				}
				else if(rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && rdbtnChild.isSelected()
						&& comboBox.getSelectedItem().equals("Leed"))
				{
					totalCost = (tax * (MilesK8 * 2)) / 100;
					String sTax = String.format("$%.2f", totalCost - 18);
					taxField.setText(sTax);
					String subTotal = String.format("$%.2f", MilesK8 * 2);
					subTotalField.setText(subTotal);
					String total = String.format("$%.2f", ((totalCost + MilesK8) * 2)- 18);
					totalField.setText(total);
					priceField.setText(total);
					classField.setText("FIRST");
					ticketField.setText("RETURN");
					adultField.setText("NIL");
					childField.setText("ONE");
				}

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// time ==============================================
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				timeField.setText(tTime.format(timer.getTime()));
				// date ==============================================
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
				dateField.setText(tDate.format(timer.getTime()));
				fromField.setText("London *");
				toField.setText((String)comboBox.getSelectedItem() + " *");
				// random num generator ==============================
				int num1;
				String q1 = "";
				num1 = 1325 + (int)(Math.random() * 4238);
				q1 += num1 + 1325;
				ticketNumField.setText(q1);
				// ===================================================
				routeField.setText("any");

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(57, 527, 115, 29);
		frame.getContentPane().add(btnNewButton);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taxField.setText(null);
				subTotalField.setText(null);
				totalField.setText(null);
				rdbtnNewRadioButton.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnSingle.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				comboBox.setSelectedItem("Destination");
				classField.setText(null);
				ticketField.setText(null);
				adultField.setText(null);
				childField.setText(null);
				fromField.setText(null);
				toField.setText(null);
				dateField.setText(null);
				timeField.setText(null);
				ticketNumField.setText(null);
				priceField.setText(null);
				routeField.setText(null);

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(210, 527, 115, 29);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Login System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(361, 527, 115, 29);
		frame.getContentPane().add(btnExit);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(67, 500, 426, 11);
		frame.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(721, 516, -88, -315);
		frame.getContentPane().add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(690, 538, -61, -335);
		frame.getContentPane().add(separator_4);

		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(527, 199, 25, 392);
		frame.getContentPane().add(separator_5);

		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClass.setBounds(599, 172, 91, 20);
		frame.getContentPane().add(lblClass);

		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTicket.setBounds(721, 172, 69, 20);
		frame.getContentPane().add(lblTicket);

		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdult.setBounds(874, 172, 91, 20);
		frame.getContentPane().add(lblAdult);

		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChild.setBounds(1002, 173, 91, 20);
		frame.getContentPane().add(lblChild);

		classField = new JTextField();
		classField.setFont(new Font("Tahoma", Font.BOLD, 18));
		classField.setColumns(10);
		classField.setBounds(567, 218, 97, 26);
		frame.getContentPane().add(classField);

		ticketField = new JTextField();
		ticketField.setFont(new Font("Tahoma", Font.BOLD, 18));
		ticketField.setColumns(10);
		ticketField.setBounds(702, 218, 105, 26);
		frame.getContentPane().add(ticketField);

		adultField = new JTextField();
		adultField.setFont(new Font("Tahoma", Font.BOLD, 18));
		adultField.setColumns(10);
		adultField.setBounds(862, 218, 78, 26);
		frame.getContentPane().add(adultField);

		childField = new JTextField();
		childField.setFont(new Font("Tahoma", Font.BOLD, 18));
		childField.setColumns(10);
		childField.setBounds(986, 218, 78, 26);
		frame.getContentPane().add(childField);

		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(567, 199, 519, 2);
		frame.getContentPane().add(separator_6);

		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(567, 279, 519, 2);
		frame.getContentPane().add(separator_7);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFrom.setBounds(586, 314, 91, 20);
		frame.getContentPane().add(lblFrom);

		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTo.setBounds(586, 371, 91, 20);
		frame.getContentPane().add(lblTo);

		fromField = new JTextField();
		fromField.setFont(new Font("Tahoma", Font.BOLD, 16));
		fromField.setColumns(10);
		fromField.setBounds(675, 311, 78, 26);
		frame.getContentPane().add(fromField);

		toField = new JTextField();
		toField.setFont(new Font("Tahoma", Font.BOLD, 16));
		toField.setColumns(10);
		toField.setBounds(675, 369, 78, 26);
		frame.getContentPane().add(toField);

		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(797, 319, 16, 272);
		frame.getContentPane().add(separator_8);

		JLabel lblTicketNo = new JLabel("Ticket No.");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTicketNo.setBounds(874, 313, 91, 20);
		frame.getContentPane().add(lblTicketNo);

		dateField = new JTextField();
		dateField.setFont(new Font("Tahoma", Font.BOLD, 16));
		dateField.setColumns(10);
		dateField.setBounds(675, 435, 78, 26);
		frame.getContentPane().add(dateField);

		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDate.setBounds(586, 437, 91, 20);
		frame.getContentPane().add(lblDate);

		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTime.setBounds(586, 500, 91, 20);
		frame.getContentPane().add(lblTime);

		timeField = new JTextField();
		timeField.setFont(new Font("Tahoma", Font.BOLD, 16));
		timeField.setColumns(10);
		timeField.setBounds(675, 498, 78, 26);
		frame.getContentPane().add(timeField);

		ticketNumField = new JTextField();
		ticketNumField.setFont(new Font("Tahoma", Font.BOLD, 16));
		ticketNumField.setColumns(10);
		ticketNumField.setBounds(874, 349, 78, 26);
		frame.getContentPane().add(ticketNumField);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(874, 403, 91, 20);
		frame.getContentPane().add(lblPrice);

		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRoute.setBounds(874, 500, 91, 20);
		frame.getContentPane().add(lblRoute);

		priceField = new JTextField();
		priceField.setFont(new Font("Tahoma", Font.BOLD, 16));
		priceField.setColumns(10);
		priceField.setBounds(874, 435, 78, 26);
		frame.getContentPane().add(priceField);

		routeField = new JTextField();
		routeField.setFont(new Font("Tahoma", Font.BOLD, 16));
		routeField.setColumns(10);
		routeField.setBounds(874, 529, 78, 26);
		frame.getContentPane().add(routeField);
	}
}
