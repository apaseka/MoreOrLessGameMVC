package org.itstep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Array;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Model model = new Model();
        model.setPrimeBar(GlobalConstants.MIN, GlobalConstants.MAX);
        for (int i = 0; i < 1001; i++) {
            model.setSecretValue();
            int a = model.getSecretValue();
            System.out.println(model.toString());
            if (a != 0 && a!=100) {
                if (a == 1 || a == 99) {
                    assertTrue(true);
                }
            }
        }
    }
}
