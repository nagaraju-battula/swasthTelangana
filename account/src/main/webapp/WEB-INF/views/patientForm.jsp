<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
	<div class="panel-heading">Patient Entry Form</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" id="patientDetails"
				role="form">
				<c:if test="${saveResult != null}">
					<div class="alert alert-info" role="alert">${saveResult}</div>
				</c:if>
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
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="age" id="age"
							title="age" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Gender</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="gender" id="gender" />
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
					<div class="col-md-9 col-lg-9">
						<input class="form-control" id="patient.patientAddress.district"
							name="patient.patientAddress.district"> </input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">State</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" id="patient.patientAddress.state"
							name="patient.patientAddress.state"> </input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Pincode</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" id="patient.patientAddress.pincode"
							name="patient.patientAddress.pincode"> </input>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientSubmit"></label>
					<div class="col-md-9 col-lg-9">
						<a class="btn btn-primary btn-lg btn-block" href="#"
							onclick="submitForm('/account/savePatientDetails.action', 'patientDetails', 'containerdiv');">Save
							Patient Details</a>
					</div>
				</div>

			</form>
		</fieldset>
	</div>
</div>
