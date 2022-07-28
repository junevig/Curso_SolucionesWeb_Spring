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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "producto_tienda")
public class ProductoTienda implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproductotienda")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idproducto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "idtienda")
	private Tienda tienda;
	
	@Column(name="preciounidadcompra")
	private Float precioUnidadCompra;
	
	@Column(name="preciounidadventa")
	private Float precioUnidadVenta;
	
	@Column(name="stock")
	private Integer stock;
	
	@Column(name="activo")
	private String estado;
	
	@Column(name="iniciado")
	private String iniciado;
	
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public Float getPrecioUnidadCompra() {
		return precioUnidadCompra;
	}

	public void setPrecioUnidadCompra(Float precioUnidadCompra) {
		this.precioUnidadCompra = precioUnidadCompra;
	}

	public Float getPrecioUnidadVenta() {
		return precioUnidadVenta;
	}

	public void setPrecioUnidadVenta(Float precioUnidadVenta) {
		this.precioUnidadVenta = precioUnidadVenta;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIniciado() {
		return iniciado;
	}

	public void setIniciado(String iniciado) {
		this.iniciado = iniciado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
