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
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.lang.reflect.Method;

/**
 *
 * @author HACKER
 */
public class AjoutTest {
    private Ajout ajout;
    
    public AjoutTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        ajout = new Ajout();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of connect method, of class Ajout.
     */
    @Test
    public void testConnect() {
        // Appeler la méthode
        ajout.connect();
        
        // Vérifier si la connexion est établie
        Connection con = ajout.con;
        assertNotNull(con, "La connexion doit être établie");
    }
 @Test
    public void testIcone() {
        // Appeler la méthode
        ajout.icone();
         
        // Vérifier si l'image de l'icône est définie
        assertNotNull(ajout.getIconImage());
    }
     @Test
    public void testAjoutConstructor() {
        // Vérifier si la fenêtre est initialisée correctement
        assertNotNull(ajout, "La fenêtre Ajout doit être remplit");
        
        // Vérifications supplémentaires si nécessaire
        // Exemple : vérifier si les composants ne sont pas nuls
        assertNotNull(ajout.nom, "Le champ de texte nom doit être remplit");
        assertNotNull(ajout.refference, "Le champ de texte référence doit être remplit");
    }

    // Tests pour les méthodes d'action des composants
    @Test
    public void testRefferenceActionPerformed() {
        // Simuler l'action
        ajout.refference.setText("TestReference");
        
        
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals("TestReference", ajout.refference.getText(), "Le texte de référence doit être 'TestReference'");
    }

    @Test
    public void testNomActionPerformed() {
        // Simuler l'action
       
       
        ajout.nom.setText("TestNom");
        
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals("TestNom", ajout.nom.getText(), "Le texte du nom doit être 'TestNom'");
    }

    @Test
    public void testTelephoneActionPerformed() {
        // Simuler l'action
        ajout.telephone.setText("0123456789");
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals("0123456789", ajout.telephone.getText(), "Le texte du téléphone doit être '0123456789'");
    }

    @Test
    public void testDescriptionActionPerformed() {
        // Simuler l'action
        ajout.description.setText("TestDescription");
        
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals("TestDescription", ajout.description.getText(), "Le texte de la description doit être 'TestDescription'");
    }

    @Test
    public void testPrixUnitaireActionPerformed() {
        // Simuler l'action
        ajout.prix_unitaire.setText("100");
       
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals("100", ajout.prix_unitaire.getText(), "Le texte du prix unitaire doit être '100'");
    }

    @Test
    public void testQuantiteStateChanged() {
        // Simuler le changement d'état
        ajout.quantite.setValue(5);
      
        
        // Ajouter des assertions pour vérifier le comportement attendu
        assertEquals(5, ajout.quantite.getValue(), "La quantité doit être 5");
    }
    /**
     * Test of main method, of class Ajout.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ajout.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
