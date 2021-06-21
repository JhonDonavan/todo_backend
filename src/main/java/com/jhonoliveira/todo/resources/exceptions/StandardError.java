package com.jhonoliveira.todo.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long timstamp;
	private Integer status;
	private String message;
	
	public StandardError() {
		super();
	}

	public StandardError(Long timstamp, Integer status, String message) {
		super();
		this.timstamp = timstamp;
		this.status = status;
		this.message = message;
	}

	public Long getTimstamp() {
		return timstamp;
	}

	public void setTimstamp(Long timstamp) {
		this.timstamp = timstamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
