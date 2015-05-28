package de.bischinger.validation.model.assertions;

import de.bischinger.validation.model.MyPojo;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

/**
 * {@link de.bischinger.validation.model.MyPojo} specific assertions - Generated by CustomAssertionGenerator.
 */
public class MyPojoAssert extends AbstractAssert<MyPojoAssert, MyPojo> {

  /**
   * Creates a new <code>{@link MyPojoAssert}</code> to make assertions on actual MyPojo.
   * @param actual the MyPojo we want to make assertions on.
   */
  public MyPojoAssert(MyPojo actual) {
    super(actual, MyPojoAssert.class);
  }

  /**
   * An entry point for MyPojoAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMyPojo)</code> and get specific assertion with code completion.
   * @param actual the MyPojo we want to make assertions on.
   * @return a new <code>{@link MyPojoAssert}</code>
   */
  public static MyPojoAssert assertThat(MyPojo actual) {
    return new MyPojoAssert(actual);
  }

  /**
     * Verifies that the actual MyPojo's sum1 is equal to the given one.
     * @param sum1 the given sum1 to compare the actual MyPojo's sum1 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual MyPojo's sum1 is not equal to the given one.
     */
    public MyPojoAssert hasSum1(long sum1) {
      // check that actual MyPojo we want to make assertions on is not null.
      isNotNull();

      // overrides the default error message with a more explicit one
      String assertjErrorMessage = "\nExpecting sum1 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

      // check
      long actualSum1 = actual.getSum1();
      if (actualSum1 != sum1) {
        failWithMessage(assertjErrorMessage, actual, sum1, actualSum1);
      }

      // return the current assertion for method chaining
      return this;
    }

  /**
   * Verifies that the actual MyPojo's sum1 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum1 the value to compare the actual MyPojo's sum1 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum1 is not close enough to the given value.
   */
  public MyPojoAssert hasCloseToSum1(long sum1, long offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    long actualSum1 = actual.getSum1();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum1:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum1, sum1, offset, Math.abs(sum1 - actualSum1));
    
    // check
    Assertions.assertThat(actualSum1).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum1, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

  /**
     * Verifies that the actual MyPojo's sum2 is equal to the given one.
     * @param sum2 the given sum2 to compare the actual MyPojo's sum2 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual MyPojo's sum2 is not equal to the given one.
     */
    public MyPojoAssert hasSum2(long sum2) {
      // check that actual MyPojo we want to make assertions on is not null.
      isNotNull();

      // overrides the default error message with a more explicit one
      String assertjErrorMessage = "\nExpecting sum2 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

      // check
      long actualSum2 = actual.getSum2();
      if (actualSum2 != sum2) {
        failWithMessage(assertjErrorMessage, actual, sum2, actualSum2);
      }

      // return the current assertion for method chaining
      return this;
    }

  /**
   * Verifies that the actual MyPojo's sum2 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum2 the value to compare the actual MyPojo's sum2 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum2 is not close enough to the given value.
   */
  public MyPojoAssert hasCloseToSum2(long sum2, long offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    long actualSum2 = actual.getSum2();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum2:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum2, sum2, offset, Math.abs(sum2 - actualSum2));
    
    // check
    Assertions.assertThat(actualSum2).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum2, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

  /**
     * Verifies that the actual MyPojo's sum3 is equal to the given one.
     * @param sum3 the given sum3 to compare the actual MyPojo's sum3 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual MyPojo's sum3 is not equal to the given one.
     */
    public MyPojoAssert hasSum3(long sum3) {
      // check that actual MyPojo we want to make assertions on is not null.
      isNotNull();

      // overrides the default error message with a more explicit one
      String assertjErrorMessage = "\nExpecting sum3 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

      // check
      long actualSum3 = actual.getSum3();
      if (actualSum3 != sum3) {
        failWithMessage(assertjErrorMessage, actual, sum3, actualSum3);
      }

      // return the current assertion for method chaining
      return this;
    }

  /**
   * Verifies that the actual MyPojo's sum3 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum3 the value to compare the actual MyPojo's sum3 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum3 is not close enough to the given value.
   */
  public MyPojoAssert hasCloseToSum3(long sum3, long offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    long actualSum3 = actual.getSum3();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum3:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum3, sum3, offset, Math.abs(sum3 - actualSum3));
    
    // check
    Assertions.assertThat(actualSum3).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum3, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

  /**
     * Verifies that the actual MyPojo's sum4 is equal to the given one.
     * @param sum4 the given sum4 to compare the actual MyPojo's sum4 to.
     * @return this assertion object.
     * @throws AssertionError - if the actual MyPojo's sum4 is not equal to the given one.
     */
    public MyPojoAssert hasSum4(long sum4) {
      // check that actual MyPojo we want to make assertions on is not null.
      isNotNull();

      // overrides the default error message with a more explicit one
      String assertjErrorMessage = "\nExpecting sum4 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

      // check
      long actualSum4 = actual.getSum4();
      if (actualSum4 != sum4) {
        failWithMessage(assertjErrorMessage, actual, sum4, actualSum4);
      }

      // return the current assertion for method chaining
      return this;
    }

  /**
   * Verifies that the actual MyPojo's sum4 is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param sum4 the value to compare the actual MyPojo's sum4 to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual MyPojo's sum4 is not close enough to the given value.
   */
  public MyPojoAssert hasCloseToSum4(long sum4, long offset) {
    // check that actual MyPojo we want to make assertions on is not null.
    isNotNull();

    long actualSum4 = actual.getSum4();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting sum4:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSum4, sum4, offset, Math.abs(sum4 - actualSum4));
    
    // check
    Assertions.assertThat(actualSum4).overridingErrorMessage(assertjErrorMessage).isCloseTo(sum4, Assertions.within(offset));

    // return the current assertion for method chaining
    return this;
  }

}
