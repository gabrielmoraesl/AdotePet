<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<div class="content-wrapper">
	<section class="content-header">

	<div class="box-header">
		<a href='<spring:url value="/tipo-animal-register.html"></spring:url>'>
			<button class="btn btn-primary">Novo Tipo de Animal</button>
		</a>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<div class="box">
				<div>
					<div class="box-header">
						<h3 class="box-title">Tipos de Animais</h3>
					</div>
					<div class="box-body">
						<table id="example1" class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>ID</th>
									<th>Tipo</th>
									<th>Descrição</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${tiposAnimais}" var="tipoAnimal">
									<tr>
										<td>${tipoAnimal.id}</td>
										<td>${tipoAnimal.tipo }</td>
										<td>${tipoAnimal.descricao }</td>
										<td><a
											href='<spring:url value="/tipo-animal-detail/${projeto.id}.html"></spring:url>'
											title="Gerenciar Tipo de Animal, visualizar detalhes.."><span
												class="glyphicon glyphicon-list"></span></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
</div>