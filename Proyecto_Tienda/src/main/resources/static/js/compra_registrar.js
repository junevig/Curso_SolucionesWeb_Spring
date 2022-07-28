$(document).ready(function(){
    $('#tabla_proveedor').DataTable();
    $('#tabla_tienda').DataTable();
    $('#tabla_producto').DataTable();

	$('body').on('click','.seleccionarProveedor', function(){
		document.getElementById('tienda.id').value = $(this).attr('tienda_id');
		document.getElementById('tienda.ruc').value = $(this).attr('tienda_ruc');
		document.getElementById('tienda.nombre').value = $(this).attr('tienda_nombre');
		document.getElementById('tienda.direccion').value = $(this).attr('tienda_direccion');
	})
	
	$('body').on('click','.seleccionarTienda', function(){
		document.getElementById('producto.id').value = $(this).attr('producto_id');
		document.getElementById('producto.codigo').value = $(this).attr('producto_codigo');
		document.getElementById('producto.nombre').value = $(this).attr('producto_nombre');
		document.getElementById('producto.descripcion').value = $(this).attr('producto_descripcion');
	})
});
