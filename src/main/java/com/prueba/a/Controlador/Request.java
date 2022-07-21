package com.prueba.a.Controlador;

public class Request {
	  String marca;
	  Double monto;
	  
	  
	public Request(String marca, Double monto) {
		super();
		this.marca = marca;
		this.monto = monto;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	  
	  

}
