/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author PNIAM
 */
public class ProjecteNGTest {
    
    public ProjecteNGTest() {
    }

 

    @Test
    public void testSuma() {
        Projecte p = new Projecte();
        assertEquals(2+3, p.suma(2, 3));
    }
    
}
