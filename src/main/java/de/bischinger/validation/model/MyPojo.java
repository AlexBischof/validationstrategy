package de.bischinger.validation.model;

/**
 * Created by Alexander Bischof on 12.05.15.
 */
public class MyPojo {

    private long sum1;
    private long sum2;
    private long sum3;
    private long sum4;

    public MyPojo(long sum1, long sum2, long sum3, long sum4) {
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.sum3 = sum3;
        this.sum4 = sum4;
    }

    public long getSum1() {
        return sum1;
    }

    public void setSum1(long sum1) {
        this.sum1 = sum1;
    }

    public long getSum2() {
        return sum2;
    }

    public void setSum2(long sum2) {
        this.sum2 = sum2;
    }

    public long getSum3() {
        return sum3;
    }

    public void setSum3(long sum3) {
        this.sum3 = sum3;
    }

    public long getSum4() {
        return sum4;
    }

    public void setSum4(long sum4) {
        this.sum4 = sum4;
    }
}
