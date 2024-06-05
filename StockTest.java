/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vente;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author HACKER
 */
public class StockTest {
    private Stock stock;
    
    @BeforeEach
     public void setUp() {
        stock = new Stock();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test de la methode connect ( connexion a la bd).
     */
    @Test
    public void testConnect() {
        try {
            stock.connect();
            assertNotNull(stock.con);
            assertFalse(stock.con.isClosed());
        } catch (Exception e) {
            fail("Echec de Connection: " + e.getMessage());
        }
    }
@Test
    public void testIcone() {
        stock.icone();
        assertNotNull(stock.getIconImage());
    }
    /**
     * Test de la methode stock
     */
    @Test
    public void testStock() {
        try {
            stock.connect();
            stock.stock();
            DefaultTableModel model = (DefaultTableModel) stock.jTable1.getModel();
            assertTrue(model.getRowCount() > 0);
            for (int i = 0; i < model.getRowCount(); i++) {
                int stockQuantity = Integer.parseInt(model.getValueAt(i, 2).toString());
                String status = model.getValueAt(i, 3).toString();
                if (stockQuantity <= 20) {
                    assertEquals("Stock critique atteint", status);
                } else {
                    assertEquals("Article en stock", status);
                }
            }
        } catch (Exception e) {
            fail("Erreur: " + e.getMessage());
        }
    }
    //test de la methode matricule pour tester la longueur
    public void testMat_Length() {
        Stock stock = new Stock();
        String result = stock.mat();
        assertEquals(11, result.length(), "matricule ayant 11 caractere");
    }
//methode pour generer le matricule pour tester les caractere
    @Test
    public void testMat_ValidCharacters() {
        Stock stock = new Stock();
        String result = stock.mat();
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        // Check that each character in the result is in the allowed set
        for (char c : result.toCharArray()) {
            assertTrue(code.indexOf(c) >= 0, "le caractere " + c + " est invalide");
        }
    }
    }
    
