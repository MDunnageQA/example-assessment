package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which is used to determine which order "ei" or "ie" should be in a word.  <br>
	 *  <br>
	 * Write a function which returns the boolean True if a string follows the mnemonic, and returns the boolean False if not.  <br>
	 *  <br>
	 * For Example:  <br>
	 * iBeforeE("ceiling") → True  <br>
	 * iBeforeE("believe") → True  <br>
	 * iBeforeE("glacier") → False  <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) 
	{
		
		char c = 'c';
		char i = 'i';
		char e = 'e';
		int cNum = 0;
		int iNum = 0;
		int eNum = 0;
		int j = 0;
		
	while (j < input.length())
	{
		if (c == input.charAt(j))
		{
			cNum = j;
		}
		
		if (i == input.charAt(j))
		{
			iNum = j;
		}
		
		if (e == input.charAt(j))
		{
			eNum = j;
		}
		
		if (iNum != 0 && eNum != 0)
		{
			break;
		}
	}
		if (iNum < eNum)
		{
			if (cNum < iNum)
			{
				return false;
			}
			return true;
		}
		
		if (eNum < iNum)
		{
			if (cNum < eNum)
			{
				return true;
			}
			return false;
		}
	
	return false;
	}
}

