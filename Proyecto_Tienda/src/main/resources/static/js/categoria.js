$(document).ready(function(){
	$('body').on('click','.editarCategoria', function(){
		$('#id').val($(this).attr('id'));
		$('#descripcion').val($(this).attr('descripcion'));
		
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
	$('body').on('click','.nuevoCategoria', function(){
		$('#id').val($(this).attr(''));
		$('#descripcion').val($(this).attr(''));
		$('#estado').val($(this).attr(''));
	})
});