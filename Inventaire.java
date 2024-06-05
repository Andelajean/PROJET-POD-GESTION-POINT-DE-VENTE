/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vente;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HACKER
 */
public class Inventaire extends javax.swing.JFrame {

    public void general(){
        connect();
        String [] entete={"Nom","Telephone","Article","Description","Refference","P.U","QTE","PT","Nature_op","Stock","Paiement","Date"};
       String [] montere = new String[13];
       DefaultTableModel model = new DefaultTableModel(null,entete);
       String req = "SELECT *  FROM vente";
    try{
        connect();
        Statement st = con.createStatement();
        rs= st.executeQuery(req);
        while(rs.next()){
            montere [0]=rs.getString("nomclt");
            montere [1]=rs.getString("telct");
            montere [2]=rs.getString("article");
             montere [3]=rs.getString("description");
            montere [4]=rs.getString("numf");
            montere [5]=rs.getString("pu");
            montere [6]=rs.getString("qte");
             montere [7]=rs.getString("pt");
            montere [8]=rs.getString("nature_op");
            montere [9]=rs.getString("stock");
            montere [10]=rs.getString("paiement");
            montere [11]=rs.getString("date_vente");
            model.addRow(montere);
            
        }
        jTable1.setModel(model);
        con.close();
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    public void Achat(){
         connect();
        String [] entete={"Nom","Telephone","Article","Description","Refference","P.U","QTE","PT","Nature_op","Stock", "Paiement","Date"};
       String [] montere = new String[13];
       DefaultTableModel model = new DefaultTableModel(null,entete);
       String req = "SELECT *  FROM vente WHERE nature_op ='achat' ";
    try{
        connect();
        Statement st = con.createStatement();
        rs= st.executeQuery(req);
        while(rs.next()){
            montere [0]=rs.getString("nomclt");
            montere [1]=rs.getString("telct");
            montere [2]=rs.getString("article");
             montere [3]=rs.getString("description");
            montere [4]=rs.getString("numf");
            montere [5]=rs.getString("pu");
            montere [6]=rs.getString("qte");
             montere [7]=rs.getString("pt");
            montere [8]=rs.getString("nature_op");
            montere [9]=rs.getString("stock");
            montere [10]=rs.getString("paiement");
            montere [11]=rs.getString("date_vente");
            model.addRow(montere);
            
        }
        jTable1.setModel(model);
        con.close();
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    public void Vente(){
         connect();
        String [] entete={"Nom","Telephone","Article","Description","Refference","P.U","QTE","PT","Nature_op","Stock","Paiemet","Date"};
       String [] montere = new String[13];
       DefaultTableModel model = new DefaultTableModel(null,entete);
       String req = "SELECT *  FROM vente WHERE nature_op ='vente' ";
    try{
        connect();
        Statement st = con.createStatement();
        rs= st.executeQuery(req);
        while(rs.next()){
            montere [0]=rs.getString("nomclt");
            montere [1]=rs.getString("telct");
            montere [2]=rs.getString("article");
             montere [3]=rs.getString("description");
            montere [4]=rs.getString("numf");
            montere [5]=rs.getString("pu");
            montere [6]=rs.getString("qte");
             montere [7]=rs.getString("pt");
            montere [8]=rs.getString("nature_op");
            montere [9]=rs.getString("stock");
            montere [10]=rs.getString("paiement");
            montere [11]=rs.getString("date_vente");
            model.addRow(montere);
            
        }
        jTable1.setModel(model);
        con.close();
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
            System.out.println("connection reussie");
            
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
    }
     public static void printComponent(Component comp) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2d = (Graphics2D) g;
                g2d.translate(pf.getImageableX(), pf.getImageableY());
                comp.printAll(g);
                return Printable.PAGE_EXISTS;
            }
        });
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Erreur d'impression : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
     private void icone() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"));
        this.setIconImage(icon.getImage());
    }
   
    public Inventaire() {
        initComponents();
        icone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        natur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOUR A'S Center Market");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quel invetaire Souhaitez Vous Faire??");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(102, 255, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenue Dans Votre Center Market!! Faites vos Inventaires Ici!!");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(102, 255, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 660, 40));

        jComboBox1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir.....", "General", "Des Ventes", "Des Achats" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 255, 0)));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 240, 40));

        jButton1.setBackground(new java.awt.Color(204, 255, 153));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton1.setText("Imprimer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 210, 40));

        jButton2.setBackground(new java.awt.Color(204, 255, 153));
        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setText("Acceuil");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 255, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 40));

        jButton3.setBackground(new java.awt.Color(204, 255, 153));
        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 204));
        jButton3.setText("Valider");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 255, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 210, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 980, 360));

        date.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 220, 40));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("En Date Du:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 110, 40));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GA Center Market Fiche de L'inventaire ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 40));

        natur.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        natur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(natur, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 220, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 1020, 500));

        setSize(new java.awt.Dimension(1193, 721));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String choix = jComboBox1.getSelectedItem().toString();
       natur.setText(choix);
       date.setText(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
       if("General".equals(choix)){
           general();
       }
       else if ("Des Achats".equals(choix)){
           Achat();
       }
       else if ("Des Ventes".equals(choix)){
           Vente();
       }
       else{
           JOptionPane.showMessageDialog(null, "Veuillez Faire un Choix");
       }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        printComponent(jPanel1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Inventaire.super.dispose();
       Notification an = new Notification();
       an.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel natur;
    // End of variables declaration//GEN-END:variables
}
