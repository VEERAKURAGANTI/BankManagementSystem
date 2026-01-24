package com.myaccount;

public class InvalidAmountException extends RuntimeException{
	public String toString()
	{
		return getClass()+": Invalid amount";
	}
}
