<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">FORM F:Section A:To be filled in for
		all Diagnostic Procedures/Tests</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry" modelAttribute="form">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3"> Patient ID
					</label>
					<div class="col-md-9 col-lg-9">
						<span class="form-control uneditable-input">${patient.patientId}</span>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3"> Patient
						Name </label>
					<div class="col-md-9 col-lg-9">
						<span class="form-control uneditable-input">${patient.patientName}</span>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="clinicName">
						Clinic Name </label>
					<div class="col-md-4 col-lg-4">
						<input class='form-control' name="form.clinicAddress.clinicName"
							type='text'></input>
					</div>
					<label class="control-label col-md-1 col-lg-1">Mobile</label>
					<div class="col-md-4 col-lg-4">
						<input class='form-control' name="form.clinicAddress.contactNum"
							type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="address">
						Address </label>
					<div class="col-md-9 col-lg-9">
						<textarea class='form-control' name="form.clinicAddress.address"></textarea>
					</div>

				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="District">
						District </label>
					<div class="col-md-3 col-lg-3">
						<input class='form-control' name="form.clinicAddress.district"
							type='text'></input>
					</div>
					<label class="control-label col-md-1 col-lg-1" for="State">
						State </label>
					<div class="col-md-3 col-lg-3">
						<input class='form-control' name="form.clinicAddress.state"
							type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="Pincode">
						Pincode </label>
					<div class="col-md-3 col-lg-3">
						<input class='form-control' name="form.clinicAddress.pincode"
							type='text'></input>
					</div>
				</div>
				<div class="form-actions">
					<label class="control-label col-md-3 col-lg-3" for="patientName"></label>
					<div class="col-md-9 col-lg-9">
						<a class="btn btn-primary col-md-9 col-lg-9" href="#"
							onclick="submitForm('/account/saveClinicDetails.action', 'formEntry', 'containerdiv');">Next>></a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>