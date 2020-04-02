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
		int cNum = -1;
		int iNum = -1;
		int eNum = -1;
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
		
		if (iNum == eNum - 1 && iNum != -1)
		{
			if (cNum == iNum - 1 && cNum != -1)
			{
				return false;
			}
			return true;
		}
		
		if (eNum == iNum - 1 && eNum != -1)
		{
			if (cNum == eNum - 1 && cNum != -1)
			{
				return true;
			}
			return false;
		}
	}
	
	return false;
	}
}

