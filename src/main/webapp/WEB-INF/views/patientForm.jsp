<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">Enter Patient Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" id="patientDetails"
				role="form">
				<div class="form-group" id="resultDev">
					<div class="alert alert-success">
						<a href="#" class="close" data-dismiss="alert">&times;</a> 
						<c:choose>
						<c:when test="${result}">Patient Details has been saved successfully.!</c:when>
						<c:otherwise>Failed, please try again.!</c:otherwise>
						</c:choose>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName">Patient
						Name</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="patientName" type="text"
							name="patientName" id="patientName" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Contact No</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" id="patient.patientAddress.contactno"
							name="patient.patientAddress.contactno"> </input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Age</label>
					<div class="col-md-2 col-lg-2">
						<select class="form-control" name="age" id="age">
							<c:forEach var="i" begin="20" end="90">
								<option>
									<c:out value="${i}" />
								</option>
							</c:forEach>
						</select>

					</div>
					<label class="control-label col-md-1 col-lg-1">Gender</label>
					<div class="col-md-3 col-lg-3">
						<select class="form-control" name="gender" id="gender">
							<c:forTokens items="Male,Female" delims="," var="i">
								<option>
									<c:out value="${i}" />
								</option>
							</c:forTokens>
						</select>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Address</label>
					<div class="col-md-9 col-lg-9">
						<textarea class="form-control" id="patient.patientAddress.address"
							name="patient.patientAddress.address">
							</textarea>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">District</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" id="patient.patientAddress.district"
							name="patient.patientAddress.district"> </input>
					</div>
					<label class="control-label col-md-1 col-lg-1">State</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" id="patient.patientAddress.state"
							name="patient.patientAddress.state"> </input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Pincode</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" id="patient.patientAddress.pincode"
							name="patient.patientAddress.pincode"> </input>
					</div>
				</div>
				<input type="hidden" id="formID" name="createdBy" value="${loginID}">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientSubmit"></label>
					<div class="col-md-3 col-lg-3">
						<a class="btn btn-primary btn-lg btn-block" href="#"
							onclick="submitForm('/account/savePatientDetails.action', 'patientDetails', 'containerdiv');">Save</a>
					</div>
					<div class="col-md-6 col-lg-6">
						<a class="btn btn-primary btn-lg btn-block" href="#"
							onclick="submitForm('/account/savePatientDetailsAndContinue.action', 'patientDetails', 'containerdiv');">Save
							And Continue>></a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>
