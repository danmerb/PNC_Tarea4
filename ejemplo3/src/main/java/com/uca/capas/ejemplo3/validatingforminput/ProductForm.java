package com.uca.capas.ejemplo3.validatingforminput;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProductForm {
	
	 @Size(min = 12, max=12, message ="No puede ser distinto de 12 caracteres")
	 @NotEmpty(message = "No puede estar vacio")	
	 private String codigoProducto;	

	@Size(min = 1, max=100, message = "No puede ser mayor a 100 caracteres")
	@NotEmpty(message = "No puede estar vacio")
	private String nombreProducto;	

	@Size(min = 1, max=100, message = "No puede ser mayor a 100 caracteres")
	@NotEmpty(message = "No puede estar vacio")
	private String marcaProducto;
	
	@Size(min = 1, max=500, message = "No puede ser mayor a 500 caracteres")
	@NotEmpty(message = "No puede estar vacio")
	private String descripcionProducto;
	
	@Pattern(regexp = "^[\\d]*$", message = "Tiene que ser un numero entero")
	@NotEmpty(message = "No puede estar vacio")
	private String existenciasProducto;
		
	@Pattern(regexp = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$", message = "Tiene que ser en el formato dd/mm/yyyy")
	@NotEmpty(message = "No puede estar vacio")
	private String fechaProducto;

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public String getExistenciasProducto() {
		return existenciasProducto;
	}

	public void setExistenciasProducto(String existenciasProducto) {
		this.existenciasProducto = existenciasProducto;
	}
	
	
	public String getFechaProducto() {
		return fechaProducto;
	}

	public void setFechaProducto(String fechaProducto) {
		this.fechaProducto = fechaProducto;
	}

	public String toString() {
		return "Producto " + this.nombreProducto + " guardado con éxito";
	}

	

}
