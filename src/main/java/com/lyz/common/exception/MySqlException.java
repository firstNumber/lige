package com.lyz.common.exception;

public class MySqlException extends RuntimeException {
	/**
	 * @Fields serialVersionUID:TODO
	 */
	private static final long serialVersionUID = 1L;
	public MySqlException(Throwable cause) {
		super(cause);
	}
	public MySqlException(String message, Throwable cause) {
		super(message, cause);
	}
	public MySqlException(String message){
		super(message);
	}
}
