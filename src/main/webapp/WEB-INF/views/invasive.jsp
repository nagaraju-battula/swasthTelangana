<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">FORM F: SECTION C: To be filled for
		performing invasive Procedures/ Tests only</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="invasive"
				id="invasive" modelAttribute="invasive">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Doctor Name
					</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="doctorName"
							id="doctorName" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">History of
						medical disease in the family: </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text"
							name="historyOfGeneticDisease" id="historyOfGeneticDisease" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Basis of
						diagnosis</label>
					<div class="col-md-9 col-lg-9">
						<table class="table table-striped">
							<c:forEach var="diagnose" items="${diagnosisBasis}">
								<tr>
									<td><input type="checkbox">${diagnose.value}</input></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Indication/s
						for the diagnosis procedure:</label>
					<div class="col-md-9 col-lg-9">
						<table class="table table-striped">
							<c:forEach var="diagnose" items="${diagnosisIndication}">
								<tr>
									<td><input type="checkbox">${diagnose.value}</input></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Advanced
						maternal age(35 years): </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="advancedMaternalAge"
							id="advancedMaternalAge" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Mother/father/sibling
						has genetic disease: </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="geneticDisease"
							id="geneticDisease" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">FORM G
						Obtained Date: </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="contestDate"
							id="contestDate" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Invasive
						procedures carried out: </label>
					<div class="col-md-9 col-lg-9">
						<table class="table table-striped">
							<c:forEach var="procedure" items="${invasiveProcedures}">
								<tr>
									<td><input type="checkbox">${procedure.value}</input></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Any Other
						Specify:</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="compilication"
							id="compilication" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Procedures
						Result: </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="procedureResult"
							id="procedureResult" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Procedures
						carried Date:</label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="procedureCarriedDate"
							type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">convey
						Details:</label>Name:
					<div class="col-md-3 col-lg-3">
						<input class='form-control' name="conveyDetails.conveyedName"
							type='text'></input>
					</div>
					Date:
					<div class="col-md-3 col-lg-3">
						<input class='form-control' name="conveyDetails.conveyedDate"
							type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">MTP
						Indication: </label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="mtpIndication" type='text'></input>
					</div>
				</div>
				<input type="hidden" id="formID" name="patientID"
					value="${patientID}"> <input type="hidden" id="formID"
					name="patientName" value="${patientName}">
				<div class="form-actions">
					<label class="control-label col-md-3 col-lg-3"></label>
					<div class="col-md-9 col-lg-9">
						<a class="btn btn-primary col-md-9 col-lg-9" href="#"
							onclick="submitForm('/account/saveInvasiveDetails.action', 'invasive', 'containerdiv');">Continue
							With Declaration>></a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>