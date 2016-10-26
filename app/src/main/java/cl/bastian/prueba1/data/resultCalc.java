package cl.bastian.prueba1.data;

/**
 * Created by Bastian on 26-10-2016.
 */

public class resultCalc extends answerCalc {

    public resultCalc(int income, int expenses) {
        super(income, expenses);
    }

    public int result (){
        return getIncome() - getExpenses();
    }


}

