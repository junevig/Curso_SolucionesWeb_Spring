$(document).ready(function(){
	$('body').on('click','.editarTienda', function(){
		$('#id').val($(this).attr('id'));
		$('#nombre').val($(this).attr('nombre'));
		$('#ruc').val($(this).attr('ruc'));
		$('#direccion').val($(this).attr('direccion'));
		$('#telefono').val($(this).attr('telefono'));
		
		const variableEstado = $(this).attr('estado');
		let estado;
		if(variableEstado == "Activo"){
			estado = 1;
		} else {
			estado = 0;
		}
		$('#estado').val(estado);
	})
});

$(document).ready(function(){
	$('body').on('click','.nuevoTienda', function(){
		$('#id').val($(this).attr(''));
		$('#nombre').val($(this).attr(''));
		$('#ruc').val($(this).attr('ruc'));
		$('#direccion').val($(this).attr(''));
		$('#telefono').val($(this).attr(''));
		$('#estado').val($(this).attr(''));
	})
});