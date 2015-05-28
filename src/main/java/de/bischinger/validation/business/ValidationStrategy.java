package de.bischinger.validation.business;

import de.bischinger.validation.model.MyPojo;
import de.bischinger.validation.model.assertions.SoftAssertions;

/**
 * Created by Alexander Bischof on 28.05.15.
 */
@FunctionalInterface
public interface ValidationStrategy {

    void validate(MyPojo actual, MyPojo expected, long... offset);

    //Offset ignored here
    ValidationStrategy ALWAYS_EQUAL = (a, e, o) -> {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(a).hasSum1(e.getSum1());
        softAssertions.assertThat(a).hasSum2(e.getSum2());
        softAssertions.assertThat(a).hasSum3(e.getSum3());
        softAssertions.assertThat(a).hasSum4(e.getSum4());

        softAssertions.assertAll();
    };

    ValidationStrategy BY_OFFSETMAPPING = (a, e, o) -> {
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(a).hasCloseToSum1(e.getSum1(), o[0]);
        softAssertions.assertThat(a).hasCloseToSum2(e.getSum2(), o[1]);
        softAssertions.assertThat(a).hasCloseToSum3(e.getSum3(), o[2]);
        softAssertions.assertThat(a).hasCloseToSum4(e.getSum4(), o[3]);

        softAssertions.assertAll();
    };
}
