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
    public void randomiserTest() {

        Model model = new Model();
        model.setPrimeBar(GlobalConstants.MIN, GlobalConstants.MAX);
        int[] anArray = new int[1000];
        int counter = 0;

        for (int i = 0; i < 1000; i++) {
            model.setSecretValue();
            anArray[i] = model.getSecretValue();
        }
        for (int element : anArray) {

            assert (element != 0);
            assert (element != 100);

            if (element == 1) {
                counter++;
            }
            if (element == 99) {
                counter++;
            }
        }
        assert (counter > 1);
        System.out.println(counter);
    }
}
