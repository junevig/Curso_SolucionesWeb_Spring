$(document).ready(function(){
	$('body').on('click','.editarProducto', function(){
		$('#id').val($(this).attr('id'));
		$('#codigo').val($(this).attr('codigo'));
		$('#valorCodigo').val($(this).attr('valorCodigo'));
		$('#nombre').val($(this).attr('nombre'));
		$('#descripcion').val($(this).attr('descripcion'));
		$('#categoria').val($(this).attr('categoriaDescripcion'));
		
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
	$('body').on('click','.nuevoProducto', function(){
		$('#id').val($(this).attr(''));
		$('#codigo').val($(this).attr('nuevo_codigo'));
		$('#valorCodigo').val($(this).attr('nuevo_vcodigo'));
		$('#nombre').val($(this).attr(''));
		$('#descripcion').val($(this).attr(''));
		$('#categoria').val($(this).attr(''));
		$('#estado').val($(this).attr(''));
		//$('#estado').val(1);
	})
});