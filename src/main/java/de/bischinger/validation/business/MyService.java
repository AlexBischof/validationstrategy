package de.bischinger.validation.business;

import de.bischinger.validation.model.MyPojo;
import org.assertj.core.api.SoftAssertionError;

/**
 * Created by Alexander Bischof on 28.05.15.
 */
public class MyService {
    public static void main(String[] args) {

        //call service which creates pruefwerte
        MyPojo actual = new MyPojo(1, 2, 3, 4);

        MyPojo expected = new MyPojo(1, 2, 2, 3);

        //first strategy
        try {
            ValidationStrategy.ALWAYS_EQUAL.validate(actual, expected, null);
        } catch (SoftAssertionError e) {
            System.out.println("First strategy: " + e.getMessage());
        }

        //offset strategy
        try {
            ValidationStrategy.BY_OFFSETMAPPING.validate(actual, expected, 0, 0, 1, 1);
        } catch (SoftAssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
