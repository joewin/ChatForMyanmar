package com.joe.chat.androidclient.exceptions;

public class ChatMMException extends Exception{
	private static final long serialVersionUID = 1L;

	public ChatMMException(String message) {
		super(message);
	}

	public ChatMMException(String message, Throwable cause) {
		super(message, cause);
	}
}
