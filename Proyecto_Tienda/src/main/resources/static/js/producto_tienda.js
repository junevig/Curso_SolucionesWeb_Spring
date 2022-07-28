$(document).ready(function(){
    $('#tabla_tienda').DataTable();
    $('#tabla_producto').DataTable();

	$('body').on('click','.seleccionarTienda', function(){
		/*
		
		$('#tienda.nombre').val($(this).attr('tienda_nombre'));
		$('#tienda.direccion').val($(this).attr('tienda_direccion'));
		*/
		document.getElementById('tienda.id').value = $(this).attr('tienda_id');
		//console.log($(this).attr('tienda_id'));
		/*console.log($(this).attr('tienda_ruc'));
		console.log($(this).attr('tienda_nombre'));
		console.log($(this).attr('tienda_direccion'));*/
		document.getElementById('tienda.ruc').value = $(this).attr('tienda_ruc');
		document.getElementById('tienda.nombre').value = $(this).attr('tienda_nombre');
		document.getElementById('tienda.direccion').value = $(this).attr('tienda_direccion');
	})
	
	$('body').on('click','.seleccionarProducto', function(){
		//console.log($(this).attr('producto_id'));
		document.getElementById('producto.id').value = $(this).attr('producto_id');
		document.getElementById('producto.codigo').value = $(this).attr('producto_codigo');
		document.getElementById('producto.nombre').value = $(this).attr('producto_nombre');
		document.getElementById('producto.descripcion').value = $(this).attr('producto_descripcion');
	})
});
