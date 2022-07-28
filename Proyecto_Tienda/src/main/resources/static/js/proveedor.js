$(document).ready(function(){
	$('body').on('click','.editarProveedor', function(){
		$('#id').val($(this).attr('id'));
		$('#ruc').val($(this).attr('ruc'));
		$('#razonSocial').val($(this).attr('razon_social'));
		$('#telefono').val($(this).attr('telefono'));
		$('#correo').val($(this).attr('correo'));
		$('#direccion').val($(this).attr('direccion'));
		
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
	$('body').on('click','.nuevoProveedor', function(){
		$('#id').val($(this).attr(''));
		$('#ruc').val($(this).attr(''));
		$('#razonSocial').val($(this).attr(''));
		$('#telefono').val($(this).attr(''));
		$('#correo').val($(this).attr(''));
		$('#direccion').val($(this).attr(''));
		$('#estado').val($(this).attr(''));
	})
});