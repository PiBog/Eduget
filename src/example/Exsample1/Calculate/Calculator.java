package example.Exsample1.Calculate;

/**
 * Клас реалізує розрахунки
 */
public class Calculator {
    /**
     * Save calculation result;
     */
    private int result;

    /**
     * Augment relizing     *
     * @param params - input data
     */
    public void add(int... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * Getting result
     * @return return calculation result
     */
    public int getResult(){
        return this.result;
    }

    /**
     * Clearing result field
     */
    public void clearResult(){
        this.result=0;
    }


}
