<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">Enter Form F Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry" modelAttribute="form">
				<c:if test="${saveResult != null}">
		         	  <div class="alert alert-info" role="alert">${saveResult}</div>
		        </c:if>

				 <div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName">
						 </label>
					<div class="btn-group btn-input clearfix col-md-9 col-lg-9">
						<button type="button"
							class="btn btn-default dropdown-toggle form-control"
							data-toggle="dropdown">
							<span data-bind="label" class="col-md-9 col-lg-9">Select Patient ID</span>&nbsp;<span
								class="caret"></span>
						</button>
						<ul class="dropdown-menu col-md-9 col-lg-9" role="menu">
							<c:if test="${patientIDs.size() >0}">
								<c:forEach var="ID" items="${patientIDs}">
		                          <li class="col-md-9 col-lg-9"><a href="#"><c:out value="${ID}" /></a></li>
								 </c:forEach>
							</c:if>
						</ul>
					</div>
				</div> 
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName"> Patient Name
					 </label>						
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text"
							name="patientName" id="patientName"/>							
					</div>
				</div>	
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="clinicName"> Clinic Name
					 </label>						
					<div class="col-md-9 col-lg-9">						
							 <input class='form-control' name="form.clinicAddress.clinicName" type='text'></input>
					</div>
				</div>
				<div class="form-group">
				    <label class="control-label col-md-3 col-lg-3" for="address"> Address
					 </label>						
					<div class="col-md-9 col-lg-9">						
							 <input class='form-control' name="form.clinicAddress.address" type='text'></input>
					</div>
				</div>
				<div class="form-group">
				    <label class="control-label col-md-3 col-lg-3" for="District"> District
					 </label>						
					<div class="col-md-9 col-lg-9">						
							 <input class='form-control' name="form.clinicAddress.district" type='text'></input>
					</div>
				</div>
				<div class="form-group">
				    <label class="control-label col-md-3 col-lg-3" for="State"> State
					 </label>						
					<div class="col-md-9 col-lg-9">						
							 <input class='form-control' name="form.clinicAddress.state" type='text'></input>
					</div>
				</div>
				<div class="form-group">
				    <label class="control-label col-md-3 col-lg-3" for="Pincode"> Pincode
					 </label>						
					<div class="col-md-9 col-lg-9">						
							 <input class='form-control' name="form.clinicAddress.pincode" type='text'></input>
					</div>
				</div>					 							
				<div class="form-actions">
				<label class="control-label col-md-3 col-lg-3" for="patientName"></label>
					<div class="col-md-9 col-lg-9">	
						<a class="btn btn-primary col-md-9 col-lg-9" href="#"
							onclick="submitForm('/account/saveDetails.action', 'formEntry', 'containerdiv');">Next>></a>				
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>