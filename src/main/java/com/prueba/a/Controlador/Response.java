package com.prueba.a.Controlador;

import org.springframework.http.HttpStatus;



public class Response {

	String marca;
	double monto;
	double tasa;
	double total;
	String message;
	HttpStatus status;

	public Response( String marca,double monto, double tasa, Double total, String message, HttpStatus status) {
		super();	
		this.marca=marca;
		this.monto = monto;
		this.tasa = tasa;
		this.message = message;
		this.status = status;
		this.total=total;
	}
	public Response(HttpStatus serviceUnavailable, String string) {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
