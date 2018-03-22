package example.Exsample1.Calculate;

/**
 * Class implements simple mathematical calculations
 */
public class Calculator {

    //Save calculation result
    private double result; //previous result
    private double workF; //work field

    private void saveRezult() { //Saving calculation rezult
        this.result = this.workF;
    }

    /**
     * Augment relizing
     *
     * @param params - input data
     */
    void add(final int... params) {
        for (int param : params) {
            this.workF += param;
        }
        this.saveRezult();
    }

    /**
     * Subtraction relizing
     *
     * @param param1,param2 - input data
     */
    void subtr(final int param1, final int param2) {
        this.workF = param1 - param2;
        this.saveRezult();
    }

    /**
     * Multiplying relizing
     *
     * @param param1,param2 - input data
     */
    void mult(final int param1, final int param2) {
        this.workF = param1 * param2;
        this.saveRezult();
    }

    /**
     * Dividing relizing
     *
     * @param param1,param2 - input data
     */
    void div(final int param1, final int param2) {
        this.workF = param1 / param2;
        this.saveRezult();
    }

    /**
     * Rise to degree relizing
     *
     * @param param1,param2 - input data
     */
    void pow(final int param1, final int param2) {
        this.workF = Math.pow(param1, param2);
        this.saveRezult();
    }

    /**
     * Getting result
     * @return return calculation result
     */
    public double getResult() {
        return this.workF;
    }

    /**
     * Getting previous result
     * @return return previous calculation result
     */
    public double getPrevResult() {
        return this.result;
    }

    /**
     * Clearing result field
     */
    public void clearResult() {
        this.workF = 0;
    }


}
