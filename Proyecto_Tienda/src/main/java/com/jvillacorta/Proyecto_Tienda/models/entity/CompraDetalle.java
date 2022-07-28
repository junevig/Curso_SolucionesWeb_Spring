package com.jvillacorta.Proyecto_Tienda.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "detalle_compra")
public class CompraDetalle implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetallecompra")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idcompra")
	private Compra compra;
	
	@OneToOne
	@JoinColumn(name = "idproducto")
	private Producto producto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "preciounitariocompra")
	private float precioUnitarioCompra;
	
	@Column(name = "preciounitarioventa")
	private float precioUnitarioVenta;
	
	@Column(name = "totalcosto")
	private float totalCosto;
	
	@Column(name="activo")
	private String estado;
	
	@Column(name="fecharegistro")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaCreacion;
	
	@PrePersist
	@PreUpdate
	public void prePersist() {
		fechaCreacion = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUnitarioCompra() {
		return precioUnitarioCompra;
	}

	public void setPrecioUnitarioCompra(float precioUnitarioCompra) {
		this.precioUnitarioCompra = precioUnitarioCompra;
	}

	public float getPrecioUnitarioVenta() {
		return precioUnitarioVenta;
	}

	public void setPrecioUnitarioVenta(float precioUnitarioVenta) {
		this.precioUnitarioVenta = precioUnitarioVenta;
	}

	public float getTotalCosto() {
		return totalCosto;
	}

	public void setTotalCosto(float totalCosto) {
		this.totalCosto = totalCosto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
