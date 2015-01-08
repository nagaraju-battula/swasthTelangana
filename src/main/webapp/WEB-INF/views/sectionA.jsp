<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="panel panel-default">
	<div class="panel-heading">FORM F: Section A:To be filled in for
		all Diagnostic Procedures/Tests</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="sectionA"
				id="sectionA" modelAttribute="sectionA">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">No of
						Children:</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" type="text" name="noOfChildren"
							id="noOfChildren" />
					</div>
					<label class="control-label col-md-3 col-lg-3"> Menstrual
						period </label>
						<div class="col-md-3 col-lg-3">
						<input class='form-control' name="menstrualPeriod" type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Sons:</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" type="text" name="noOfMaleKids"
							id="noOfMaleKids" />
					</div>
					<label class="control-label col-md-3 col-lg-3">Daughters:</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" name="noOfFemaleKids" type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Guardian
						Name </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" name="guardianName" type="text"></input>
					</div>
				</div>				
				<input type="hidden" id="patientID" name="patientID" value="${patientID}">
				<input type="hidden" id="patientID" name="patientName" value="${patientName}">
				<div class="form-actions">
					<label class="control-label col-md-3 col-lg-3" />
					<div class="col-md-9 col-lg-9">
						<a class="btn btn-primary col-md-9 col-lg-9" href="#"
							onclick="submitForm('/account/saveSectionA.action', 'sectionA', 'containerdiv');">Next>></a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>