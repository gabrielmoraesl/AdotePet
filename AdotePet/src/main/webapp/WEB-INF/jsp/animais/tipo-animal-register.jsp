<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<script>
	$(function() {
		//Initialize Select2 Elements
		$('.select2').select2()
	})
</script>

<div class="content-wrapper">
	<section class="content-header">


	<div class="row">
		<div class="col-xs-12">
			<div class="box">

				<div class="box-header with-border">
					<h3 class="box-title">Cadastro de Animal</h3>
				</div>

				<div class="box-body">

					<form:form action="/tipo-animal-register.html" method="POST"
						modelAttribute="tipoAnimal">
						<div class="col-xs-12">
							<div class="form-group col-xs-7 col-sm-6 col-lg-8">
								<label>Tipo:</label> <br>
								<form:input class="form-group col-xs-12" path="tipo" type="text"
									id="tipo" name="tipo" required="required" />
							</div>

							<div class="form-group col-xs-7 col-sm-6 col-lg-8">
								<label>Descrição:</label>
								<form:textarea path="descricao" class="form-group col-xs-12"
									rows="5" id="descricao" name="descricao" required="required" />
							</div>
						</div>
						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Cadastrar</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	</section>
</div>