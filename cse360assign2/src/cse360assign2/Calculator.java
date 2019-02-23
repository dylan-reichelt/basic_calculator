/*
 * Created by: Dylan Reichelt
 * Student Code: 533
 * Creates a calculator that can add, divide, subtract and multiply.
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history = "0";
	
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total of the calculator.
	 * @return
	 */
	public int getTotal ()
	{
		return total;
	}
	
	/**
	 * Adds a value to the total.
	 * @param value
	 */
	public void add (int value)
	{
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts a value from the total.
	 * @param value
	 */
	public void subtract (int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * multiplies a value to total.
	 * @param value
	 */
	public void multiply (int value)
	{
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides a value from the total.
	 * @param value
	 */
	public void divide (int value)
	{
		if(value == 0)
		{
			total = 0;
			history = history + " / " + value; 
		}
		else
		{
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	/**
	 * Returns the history of the operations performed on the calculator.
	 * 
	 * @return
	 */
	public String getHistory ()
	{
		return history;
	}
}