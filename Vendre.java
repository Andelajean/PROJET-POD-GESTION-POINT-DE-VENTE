/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vente;

import java.awt.Component;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;


/**
 *
 * @author HACKER
 */
public class Vendre extends javax.swing.JFrame {

    /**
     * Creates new form Vendre
     */
    public Vendre() {
        initComponents();
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
      private void icone() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"));
        this.setIconImage(icon.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tele = new javax.swing.JTextField();
        nom1 = new javax.swing.JTextField();
        article = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        prixu = new javax.swing.JTextField();
        qte = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numf = new javax.swing.JLabel();
        telep = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        nomc = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nomc1 = new javax.swing.JLabel();
        nomc2 = new javax.swing.JLabel();
        nomc3 = new javax.swing.JLabel();
        nomc4 = new javax.swing.JLabel();
        nomc5 = new javax.swing.JLabel();
        nomc6 = new javax.swing.JLabel();
        nomc7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        numf1 = new javax.swing.JLabel();
        telep1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        nomc8 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nomc9 = new javax.swing.JLabel();
        nomc10 = new javax.swing.JLabel();
        nomc11 = new javax.swing.JLabel();
        nomc12 = new javax.swing.JLabel();
        nomc13 = new javax.swing.JLabel();
        nomc14 = new javax.swing.JLabel();
        nomc15 = new javax.swing.JLabel();
        nomc16 = new javax.swing.JLabel();
        nomc17 = new javax.swing.JLabel();
        nomc18 = new javax.swing.JLabel();
        nomc19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        prixt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOUR A'S Center Market");
        setBackground(new java.awt.Color(255, 255, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 0));
        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nature Paiement");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 230, 30));

        jLabel2.setBackground(new java.awt.Color(153, 255, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenue dans votre Center Market");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 600, 30));

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nom du Client");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 30));

        jLabel4.setBackground(new java.awt.Color(153, 255, 0));
        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Article");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 30));

        jLabel5.setBackground(new java.awt.Color(153, 255, 0));
        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Description");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 230, 30));

        jLabel6.setBackground(new java.awt.Color(153, 255, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Quantite");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 30));

        jLabel9.setBackground(new java.awt.Color(153, 255, 0));
        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRix Unitaire");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 30));

        tele.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        tele.setForeground(new java.awt.Color(255, 51, 0));
        tele.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(tele, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 390, 30));

        nom1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        nom1.setForeground(new java.awt.Color(255, 51, 0));
        nom1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 390, 30));

        article.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        article.setForeground(new java.awt.Color(255, 51, 0));
        article.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(article, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 390, 30));

        description.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        description.setForeground(new java.awt.Color(255, 51, 0));
        description.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 390, 30));

        prixu.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        prixu.setForeground(new java.awt.Color(255, 51, 0));
        prixu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(prixu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 390, 30));

        qte.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        qte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        qte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qteStateChanged(evt);
            }
        });
        qte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qteKeyReleased(evt);
            }
        });
        getContentPane().add(qte, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 390, 30));

        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setText("Imprimer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 120, 40));

        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Retirer Facture");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 180, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/logo.jpg"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 110, 110));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 300, -1));

        numf.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        numf.setText("Date");
        jPanel1.add(numf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, 20));

        telep.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        telep.setText("1");
        jPanel1.add(telep, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 160, 20));

        jLabel15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel15.setText("Date");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 50, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel16.setText("facture n_o:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel17.setText("Telephone");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, -1));

        date.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        date.setText("Date");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 630, 290));

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel18.setText("Total Facture");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, -1));

        nomc.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc.setText("1");
        jPanel1.add(nomc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 300, 20));

        jLabel19.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel19.setText("Nom Du Client");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, -1));

        nomc1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc1.setForeground(new java.awt.Color(51, 0, 204));
        nomc1.setText("1");
        jPanel1.add(nomc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 310, 20));

        nomc2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc2.setForeground(new java.awt.Color(51, 0, 204));
        nomc2.setText("Email:fouras@centermarket.com");
        jPanel1.add(nomc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 20));

        nomc3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc3.setForeground(new java.awt.Color(51, 0, 204));
        nomc3.setText("Efoulan , damas");
        jPanel1.add(nomc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 260, 30));

        nomc4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc4.setForeground(new java.awt.Color(51, 0, 204));
        nomc4.setText("BP:115 Yaounde");
        jPanel1.add(nomc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 20));

        nomc5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc5.setForeground(new java.awt.Color(51, 0, 204));
        nomc5.setText("Site Web: www.fourascm.com");
        jPanel1.add(nomc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 20));

        nomc6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc6.setForeground(new java.awt.Color(51, 0, 204));
        nomc6.setText("Tel: (+237) 620 690 733/673 429 591");
        jPanel1.add(nomc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 20));

        nomc7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc7.setForeground(new java.awt.Color(51, 0, 204));
        nomc7.setText("FOUR A'S Center Market SARL");
        jPanel1.add(nomc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(102, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/logo.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 110, 110));

        jLabel21.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 300, -1));

        numf1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        numf1.setText("Date");
        jPanel2.add(numf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, 20));

        telep1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        telep1.setText("1");
        jPanel2.add(telep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 160, 20));

        jLabel22.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel22.setText("Date");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 50, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel23.setText("facture n_o:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        jLabel24.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel24.setText("Telephone");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 90, -1));

        date1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        date1.setText("Date");
        jPanel2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 170, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 630, 290));

        jLabel25.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel25.setText("Total Facture");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, -1));

        nomc8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc8.setText("1");
        jPanel2.add(nomc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 300, 20));

        jLabel26.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel26.setText("Nom Du Client");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, -1));

        nomc9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc9.setForeground(new java.awt.Color(51, 0, 204));
        nomc9.setText("1");
        jPanel2.add(nomc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 310, 20));

        nomc10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc10.setForeground(new java.awt.Color(51, 0, 204));
        nomc10.setText("Email:fouras@centermarket.com");
        jPanel2.add(nomc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 20));

        nomc11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc11.setForeground(new java.awt.Color(51, 0, 204));
        nomc11.setText("Nos argence : awae escalier , Ngousso");
        jPanel2.add(nomc11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 260, 30));

        nomc12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc12.setForeground(new java.awt.Color(51, 0, 204));
        nomc12.setText("BP:115 Yaounde");
        jPanel2.add(nomc12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 20));

        nomc13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc13.setForeground(new java.awt.Color(51, 0, 204));
        nomc13.setText("Site Web: www.fourascm.com");
        jPanel2.add(nomc13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, 20));

        nomc14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc14.setForeground(new java.awt.Color(51, 0, 204));
        nomc14.setText("Tel: (+237) 620 690 733/673 429 591");
        jPanel2.add(nomc14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 20));

        nomc15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc15.setForeground(new java.awt.Color(51, 0, 204));
        nomc15.setText("FOUR A'S Center Market SARL");
        jPanel2.add(nomc15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 780, 620));

        nomc16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc16.setForeground(new java.awt.Color(51, 0, 204));
        nomc16.setText("Nos argence : awae escalier ");
        jPanel1.add(nomc16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 260, 30));

        nomc17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc17.setForeground(new java.awt.Color(51, 0, 204));
        nomc17.setText("Ngousso , etoa meki , etoudi");
        jPanel1.add(nomc17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 260, 30));

        nomc18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc18.setForeground(new java.awt.Color(51, 0, 204));
        nomc18.setText("Efoulan , damas");
        jPanel1.add(nomc18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 260, 30));

        nomc19.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        nomc19.setForeground(new java.awt.Color(51, 0, 204));
        nomc19.setText("Merci pour votre fidelite et votre confiance !!!");
        jPanel1.add(nomc19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 390, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 780, 620));

        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Ajouter Facture");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 40));

        jLabel13.setBackground(new java.awt.Color(153, 255, 0));
        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Prix Total");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 230, 30));

        prixt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        prixt.setForeground(new java.awt.Color(255, 51, 0));
        prixt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        prixt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prixtKeyReleased(evt);
            }
        });
        getContentPane().add(prixt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 390, 30));

        jButton4.setBackground(new java.awt.Color(153, 255, 0));
        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 204));
        jButton4.setText("Accueil");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 40));

        jLabel7.setBackground(new java.awt.Color(153, 255, 0));
        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telephone");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 230, 30));

        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("Payer");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 0), new java.awt.Color(255, 51, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 120, 40));

        jComboBox1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espece", "Orange MONNEY", "MTN MOMO", "Credit", "Cheque Bancaire" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 204, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(102, 255, 0)));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 390, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 420));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vente/IMG/Blue Minimalist Letter D Logo_20240521_200331_0000.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 360, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Voulez-vous imprimer le contenu du JPanel ?");
        if (option == JOptionPane.OK_OPTION) {
            printComponent(jPanel1);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
supprimer();
    }//GEN-LAST:event_jButton2ActionPerformed
   String [] entete={"Designation","Description","Quantite","Prix Unitaire","Prix Total"};
      String [] montere = new String[5];
      DefaultTableModel model = new DefaultTableModel(null,entete);
   
 
  
  private String mat(){
      String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
     StringBuilder ma = new StringBuilder();
      Random sr = new Random();
     for(int i=0;i<=10;i++){
         ma.append(code.charAt(sr.nextInt(code.length())));
    
     }
     
     
     return ma.toString();
     
 }
 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     try{
     String req = "SELECT stock FROM vente  WHERE article = '"+article.getText()+ "' AND description ='"+description.getText()+"' ORDER BY id DESC";
     String nom = nom1.getText();
      String nc = tele.getText();
      String pu=prixu.getText();
      String pt= prixt.getText();
      String desc = description.getText();
      String art= article.getText();
      int qt = (int) qte.getValue();
      String va = String.valueOf(qt);
      if(nom.isEmpty()|| nc.isEmpty()||pu.isEmpty()||pt.isEmpty()||art.isEmpty()){
          JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
      }
      
      
      else{
          try {
      connect();
      model.addRow(new Object []{art,desc,qt,pu,pt});
      jTable1.setModel(model);
     Statement st = con.createStatement();
        rs= st.executeQuery(req);
        
       updateTotalPrice();
     telep.setText(nc);
     nomc.setText(nom);
      date.setText(new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()));
     numf.setText(mat());
     String ng =numf.getText();
           pst=con.prepareStatement("INSERT INTO vente(nomclt,telct,numf,article,description,pu,qte,pt,nature_op,stock,paiement) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,nom);
            pst.setString(2,nc);
            pst.setString(3,ng);
             pst.setString(4,art);
            pst.setString(5,desc);
            pst.setString(6,pu);
             pst.setString(7,va);
            pst.setString(8,pt);
            pst.setString(9,"vente");
             if(rs.next()){
            //String re = rs.getString("stock");
             int de = rs.getInt("stock");;
            int stock = de-qt;
            String str = String.valueOf(stock); 
            pst.setString(10,str);
            pst.setString(11, jComboBox1.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ajout Effectué avec succès");
            con.close();
        }
             else{
                 JOptionPane.showMessageDialog(null, "Article Indisponible en stock");
             }
            
           
          }
          catch(Exception e){
              e.printStackTrace();
              
          }
      }
     }
     catch(Exception e){
         e.printStackTrace();
     }  
    }//GEN-LAST:event_jButton3ActionPerformed
 public void supprimer(){
      int sec = jTable1.getSelectedRow();
      try{
           if(sec != -1){
          connect();
        pst =con.prepareStatement("DELETE FROM vente WHERE numf=?");
        //numf.setText(mat());
        String ng =numf.getText();
        pst.setString(1,ng);
        pst.executeUpdate();
        updatesupp();
        JOptionPane.showMessageDialog(null, "Ligne supprimée avec succès");
          model.removeRow(sec);
      }
      else{
          JOptionPane.showMessageDialog(null, "Veuillez selectionner une ligne");
      }
          
      }
      catch(Exception e){
          e.printStackTrace();
      }
     
  }
 
 public void updateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double price = Double.parseDouble(model.getValueAt(i, 4).toString());
            totalPrice += price;
        }
        nomc1.setText(""+totalPrice);
    }
    public void updatesupp() {
    int c = jTable1.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    String n = model.getValueAt(c, 4).toString();
        
    double totalPrice = 0;
    String a = nomc1.getText();
    double a1 = Double.parseDouble(a);
    double as = Double.parseDouble(n);
    totalPrice = a1 - as;
    nomc1.setText(String.valueOf(totalPrice));
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
     
   
    private void qteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qteKeyReleased
       
    }//GEN-LAST:event_qteKeyReleased

    private void prixtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixtKeyReleased
        
    }//GEN-LAST:event_prixtKeyReleased

    private void qteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qteStateChanged
int pr = Integer.parseInt(prixu.getText());
				int qt =(int) qte.getValue();
				int to = pr * qt;
				prixt.setText(String.valueOf(to));
    }//GEN-LAST:event_qteStateChanged

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
         
       
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Vendre.super.dispose();
         Notification vo = new Notification();
        vo.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String pt = prixt.getText();
         String nom = nom1.getText();
      String nc = tele.getText();
      String pu=prixu.getText();
      String desc = description.getText();
      String art= article.getText();
       String apiKey = "18758113465f9bc1ec51923.22594668";
        String siteId = "5871814";
        String notifyUrl = "http://mondomaine.com/notify/";
        String mode = "PRODUCTION";
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("transaction_id", String.valueOf(new Random().nextInt(100000000)));
        paymentData.put("amount",pt);
        paymentData.put("currency", "XOF");
        paymentData.put("channels", "ALL");
        paymentData.put("description", "Test de paiement");
        paymentData.put("customer_name", nom);
        paymentData.put("customer_surname", "Down"); // Exemple de prénom
        paymentData.put("customer_email", "down@test.com"); // Exemple d'email
        paymentData.put("customer_phone_number", nc);
        paymentData.put("customer_address", "BP 0024"); // Exemple d'adresse
        paymentData.put("customer_city", "Antananarivo");
        paymentData.put("customer_country", "CM");
        paymentData.put("customer_state", "CM");
        paymentData.put("customer_zip_code", "06510");
        String paymentLink = generatePaymentLink(apiKey, siteId, notifyUrl, mode, paymentData);

    try {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(paymentLink));
        }
    } catch (IOException | URISyntaxException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton5ActionPerformed
 public static String generatePaymentLink(String apiKey, String siteId, String notifyUrl, String mode, Map<String, String> paymentData) {
    StringBuilder paymentLinkBuilder = new StringBuilder();
    paymentLinkBuilder.append("https://api-checkout.cinetpay.com/v2/payment?")
            .append("apikey=").append(apiKey)
            .append("&site_id=").append(siteId)
            .append("&notify_url=").append(URLEncoder.encode(notifyUrl, StandardCharsets.UTF_8))
            .append("&mode=").append(mode);

    for (Map.Entry<String, String> entry : paymentData.entrySet()) {
        paymentLinkBuilder.append("&").append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
    }

    String paymentLink = paymentLinkBuilder.toString();
    System.out.println("Lien de paiement : " + paymentLink);
    return paymentLink;
}

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField article;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nom1;
    private javax.swing.JLabel nomc;
    private javax.swing.JLabel nomc1;
    private javax.swing.JLabel nomc10;
    private javax.swing.JLabel nomc11;
    private javax.swing.JLabel nomc12;
    private javax.swing.JLabel nomc13;
    private javax.swing.JLabel nomc14;
    private javax.swing.JLabel nomc15;
    private javax.swing.JLabel nomc16;
    private javax.swing.JLabel nomc17;
    private javax.swing.JLabel nomc18;
    private javax.swing.JLabel nomc19;
    private javax.swing.JLabel nomc2;
    private javax.swing.JLabel nomc3;
    private javax.swing.JLabel nomc4;
    private javax.swing.JLabel nomc5;
    private javax.swing.JLabel nomc6;
    private javax.swing.JLabel nomc7;
    private javax.swing.JLabel nomc8;
    private javax.swing.JLabel nomc9;
    private javax.swing.JLabel numf;
    private javax.swing.JLabel numf1;
    private javax.swing.JTextField prixt;
    private javax.swing.JTextField prixu;
    private javax.swing.JSpinner qte;
    private javax.swing.JTextField tele;
    private javax.swing.JLabel telep;
    private javax.swing.JLabel telep1;
    // End of variables declaration//GEN-END:variables
}
