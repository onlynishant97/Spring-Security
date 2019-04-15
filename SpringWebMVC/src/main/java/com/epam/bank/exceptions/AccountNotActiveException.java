package com.epam.bank.exceptions;

/**
 * Account Not Active Exception.
 * 
 * @author Nishant_Bansal
 */
public class AccountNotActiveException extends Exception {

	/**
	 * Generated By Eclipse.
	 */
	private static final long serialVersionUID = 1L;

	public AccountNotActiveException() {
	}

	public AccountNotActiveException(String message) {
		super(message);
	}

}