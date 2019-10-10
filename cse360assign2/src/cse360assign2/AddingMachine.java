 /*
 * Author: Angelica Injejikian
 * Class ID: 85141
 * Assignment #: Assignment #2
 * Description: This class will includes various methods that
 * 				can add and subtract values and can return
 * 				a string demonstrating the calculations/
 */

package cse360assign2;

/*
 * This class will conduct addition and subtraction calculations
 * and can print the total as well as a string demonstrating the
 * calculations.
 * 
 * @param	total		the integer that contains the total of the calculations
 * @param	historyOfTransactions		the string contains a history of all
 * 										of the transactions that have occured	
 */

public class AddingMachine 
{
	private int total;
	public String historyOfTransactions;
	
	
	/*
	 * This is a constructor.
	 */
	public AddingMachine () 
	{
		total = 0;
		historyOfTransactions = "0";
		
	}
	
	/*
	 * This method returns the current total.
	 * 
	 * @return 			the current total
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/*
	 * This method adds the parameter to the total value.
	 */
	public void add (int value) 
	{
		total += value;
		historyOfTransactions += " + " + value;
	}
	
	/*
	 * This method subtracts the parameter from the total value.
	 */
	public void subtract (int value) 
	{
		total -= value;
		historyOfTransactions += " - " + value;
	}
	
	/*
	 * This method returns a history of transactions.
	 * 
	 * @return		a string containing a history of the transactions
	 * @see 		java.lang.Object#toString()
	 */
	public String toString () 
	{
		return historyOfTransactions;
	}

	/*
	 * This method will clear the history.
	 */
	public void clear() 
	{
		total = 0;
		historyOfTransactions = "0";
	}
}
