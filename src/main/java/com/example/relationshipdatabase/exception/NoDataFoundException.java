package com.example.relationshipdatabase.exception;

public class NoDataFoundException extends RuntimeException{
	
	public NoDataFoundException(String name) {
		super(name+" is not available in records in database");
	}

}
