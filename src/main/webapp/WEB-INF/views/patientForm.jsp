<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">Patient Entry Form</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal"
				method="POST" id="patientDetails" role="form">
				<c:if test="${saveResult != null}">
	         	  <div class="alert alert-info" role="alert">${saveResult}</div>
	            </c:if> 
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName">Patient
						Name</label>
					<div class="col-md-6">
						<input class="form-control" for="patientName"
							type="text" name="patientName" id="patientName" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Contact No</label>
					<div class="col-md-6">
						<input class="form-control" for="contactNo" type="text"
							name="contactNo" id="contactNo" title="contactNo" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Address</label>
					<div class="col-md-6">
						<textarea class="form-control" for="patientAddress"
							id="patientAddress" name="patientAddress"
							title="patientAddress">
							</textarea>
					</div>
				</div>				
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Type Of Test</label>
					<div class="col-md-6">
						<select class="form-control"
							data-toggle="select" for="typeOfTest" name="typeOfTest"
							id="typeOfTest">
							<option value="0">XRAY</option>
							<option value="1">SCAN</option>
							<option value="2">SIMPLE</option>
						</select>
					</div>
				</div>				
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Price</label>
					<div class="col-md-6">						
							<input class="form-control" for="price" type="text"
								name="price" id="price" title="price" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Discount</label>
					<div class="col-md-6">						
							<input class="form-control"  for="discount" type="text" name="discount"
								id="discount" title="discount" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Net Amount</label>
					<div class="col-md-6">
							<input class="form-control"  for="netAmount" type="text" name="netAmount"
								id="netAmount" title="netAmount" value="" />
					</div>
				</div>				
				<div class="form-group">
					<a class="btn btn-primary btn-lg btn-block" href="#"
			         onclick="submitForm('/account/savePatientDetails.action', 'patientDetails', 'containerdiv');">Save Patient Details</a>					
				</div>
			</form>
		</fieldset>
	</div>
</div>
