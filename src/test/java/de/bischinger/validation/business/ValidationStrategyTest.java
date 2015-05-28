package de.bischinger.validation.business;

import de.bischinger.validation.model.MyPojo;
import org.assertj.core.api.SoftAssertionError;
import org.junit.BeforeClass;
import org.junit.Test;

import static de.bischinger.validation.business.ValidationStrategy.ALWAYS_EQUAL;
import static de.bischinger.validation.business.ValidationStrategy.BY_OFFSETMAPPING;

public class ValidationStrategyTest {

    private static MyPojo actual;

    @BeforeClass
    public static void before() {
        actual = new MyPojo(1, 2, 3, 4);
    }

    @Test
    public void should_pass_EqualsStrategy_when_everything_is_equal() throws Exception {
        ALWAYS_EQUAL.validate(actual, actual, null);
    }

    @Test(expected = SoftAssertionError.class)
    public void should_fail_EqualsStrategy_with_non_equal() throws Exception {
        ALWAYS_EQUAL.validate(actual, new MyPojo(1, 2, 0, 3), null);
    }

    @Test
    public void should_pass_OffsetStrategy_when_everything_is_equal() throws Exception {
        BY_OFFSETMAPPING.validate(actual, actual, 0, 0, 0, 0);
    }

    @Test
    public void should_pass_OffsetStrategy_when_everything_is_closeTo() throws Exception {
        BY_OFFSETMAPPING.validate(actual, new MyPojo(0, 3, 2, 5), 1, 1, 1, 1);
    }

    @Test(expected = SoftAssertionError.class)
    public void should_fail_OffsetStrategy_when_something_is_not_closeTo() throws Exception {
        BY_OFFSETMAPPING.validate(actual, new MyPojo(0, -5, 2, 10), 1, 1, 1, 1);
    }
}