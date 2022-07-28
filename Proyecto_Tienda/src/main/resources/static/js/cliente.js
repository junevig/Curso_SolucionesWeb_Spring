$(document).ready(function(){
	$('body').on('click','.editarCliente', function(){
		$('#id').val($(this).attr('id'));
		$('#documento').val($(this).attr('tipo_documento'));
		$('#numeroDocumento').val($(this).attr('numero_documento'));
		$('#nombre').val($(this).attr('nombre'));
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
	$('body').on('click','.nuevoCliente', function(){
		$('#id').val($(this).attr(''));
		$('#documento').val($(this).attr(''));
		$('#numeroDocumento').val($(this).attr(''));
		$('#nombre').val($(this).attr(''));
		$('#direccion').val($(this).attr(''));
		$('#telefono').val($(this).attr(''));
		$('#estado').val($(this).attr(''));
	})
});