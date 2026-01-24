package com.myaccount;

public class InSufficentBalanceExcepti extends RuntimeException {
	public String toString()
	{
		return getClass()+": Enter valid WithDraw Amount";
	}
}
