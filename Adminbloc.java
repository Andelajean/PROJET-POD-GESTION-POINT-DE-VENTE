/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template

 */
package Vente;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Adminbloc extends javax.swing.JFrame {

   private void icone() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"));
        this.setIconImage(icon.getImage());
    }
    public Adminbloc() {
        initComponents();
        tableau();
        icone();
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notification = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        dert = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nom = new javax.swing.JTextField();
        mdp = new javax.swing.JPasswordField();
        mdp1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        note = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        mp = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        nom1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOUR A'S Center Market");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notification.setBackground(new java.awt.Color(153, 255, 153));
        notification.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        notification.setForeground(new java.awt.Color(51, 0, 204));
        notification.setText("Inventaire");
        notification.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        notification.setIconTextGap(0);
        notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationActionPerformed(evt);
            }
        });
        getContentPane().add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 170, 40));

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setText("Acceuil");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 190, 40));

        dert.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        dert.setForeground(new java.awt.Color(255, 51, 51));
        dert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fichier", "Voir_Stock", "Inventaire", "", "" }));
        dert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dertActionPerformed(evt);
            }
        });
        getContentPane().add(dert, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 51), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mot De Passe");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 30));

        jLabel2.setBackground(new java.awt.Color(153, 255, 51));
        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Creez Un Compte ici");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 630, 30));

        jLabel3.setBackground(new java.awt.Color(153, 255, 51));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Comfirmer le MDP");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 30));

        jLabel4.setBackground(new java.awt.Color(153, 255, 51));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Role");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 260, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Creer un Compte");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 180, 40));

        nom.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 51, 51));
        nom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 72, 380, 30));

        mdp.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mdp.setForeground(new java.awt.Color(255, 51, 0));
        mdp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 380, 30));

        mdp1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mdp1.setForeground(new java.awt.Color(255, 51, 0));
        mdp1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(mdp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 112, 380, 30));

        jLabel5.setBackground(new java.awt.Color(153, 255, 51));
        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nom D'Utilisateur");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 30));

        role.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        role.setForeground(new java.awt.Color(255, 51, 51));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir", "Admin", "Gestionnaire", " ", " " }));
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 150, 30));

        jLabel7.setBackground(new java.awt.Color(153, 255, 51));
        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Comfirmer le MDP");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 460, 410));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -60, 400, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 710, 290));

        note.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        note.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(153, 255, 51));
        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Panel de modifications et de mises à jours");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        note.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 630, 30));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jTable1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        note.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 740, 120));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setText("Modifier");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        note.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 90, -1));

        jLabel8.setBackground(new java.awt.Color(153, 255, 51));
        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("User Name");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        note.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        mp.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        mp.setForeground(new java.awt.Color(255, 51, 0));
        mp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        note.add(mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 380, 30));

        jLabel9.setBackground(new java.awt.Color(153, 255, 51));
        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nouveau MDP");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        note.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 30));

        nom1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nom1.setForeground(new java.awt.Color(255, 51, 51));
        nom1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        note.add(nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 380, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        note.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 400, 380));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        note.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 400, 380));

        getContentPane().add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 770, 580));

        jButton4.setBackground(new java.awt.Color(153, 255, 153));
        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 204));
        jButton4.setText("Voir Stock");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationActionPerformed
Adminbloc.super.dispose();
            Inventaire in = new Inventaire();
            in.setVisible(true);        
    }//GEN-LAST:event_notificationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            
               String m= new String (mp.getPassword());
        String n=nom1.getText().toString();
        if(n.isEmpty()||m.isEmpty()){
            JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs");
        }
        //int c=jTable1.getSelectedRow();
        //String selec = (String)jTable1.getValueAt(c,0);
        else{
         connect();
        pst =con.prepareStatement("UPDATE users SET mdp =? WHERE nom=?");
        pst.setString(1, m);
        pst.setString(2,n);
        pst.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null,"Mise a jour éffectuée avec succès");
        }
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erreur"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
       int c=jTable1.getSelectedRow();
       DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
      // String selec = (String)jTable1.getValueAt(c,0);
      nom1.setText(model.getValueAt(c, 1).toString());
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      try{
       String nm=nom.getText().toString();
      String mp1= new String (mdp1.getPassword());
      String mp2=new String (mdp.getPassword());
      String ro=role.getSelectedItem().toString();
      if(nm.isEmpty()||mp1.isEmpty()||mp2.isEmpty()){
          JOptionPane.showMessageDialog(null,"Veuillez remplir tous les champs");
      }
      else if("Choisir".equals(ro)){
        JOptionPane.showMessageDialog(null,"Veuillez un role");
    }
      else if(mp1.equals(mp2)){
          connect();
           pst=con.prepareStatement("INSERT INTO users (nom,mdp,role) VALUES (?,?,?)");
            pst.setString(1,nm);
            pst.setString(2,mp1);
            pst.setString(3,ro);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compte créer avec succés");
            con.close();
      }
      else{
          JOptionPane.showMessageDialog(null, "Veuillez mettre le meme mot de pass");
      }
      }catch(Exception e){
          e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erreur"+e.getMessage());
          
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Adminbloc.super.dispose();
        Notification vo = new Notification();
        vo.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dertActionPerformed
        String ro=dert.getSelectedItem().toString();
        if("Voir_Stock".equals(ro)){
            Adminbloc.super.dispose();
            Stock st = new Stock();
            st.setVisible(true);
        }
        else if ("Inventaire".equals(ro)){
            Adminbloc.super.dispose();
            Inventaire in = new Inventaire();
            in.setVisible(true);
        }
    }//GEN-LAST:event_dertActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Adminbloc.super.dispose();
            Stock st = new Stock();
            st.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
   public void tableau(){
       String [] entete={"Motif","User Name","Date"};
       String [] montere = new String[5];
       DefaultTableModel model = new DefaultTableModel(null,entete);
       String req = "SELECT *  FROM oublie";
    try{
        connect();
        Statement st = con.createStatement();
        rs= st.executeQuery(req);
        while(rs.next()){
            montere [0]=rs.getString("motif");
            montere [1]=rs.getString("nomu");
            montere [2]=rs.getString("date_c");
            model.addRow(montere);
            
        }
        jTable1.setModel(model);
        con.close();
    
    }
    catch(Exception e){
        e.printStackTrace();
    }
   // jTable1.getColumn("Nom2").setCellRenderer(new ButtonRenderer());
    
   // jTable1.getColumn("Nom").setCellEditor(new ButtonEditor(new jTextField()));
}
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
            java.util.logging.Logger.getLogger(Adminbloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminbloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminbloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminbloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminbloc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField mdp;
    private javax.swing.JPasswordField mdp1;
    private javax.swing.JPasswordField mp;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nom1;
    private javax.swing.JPanel note;
    private javax.swing.JButton notification;
    private javax.swing.JComboBox<String> role;
    // End of variables declaration//GEN-END:variables
}
