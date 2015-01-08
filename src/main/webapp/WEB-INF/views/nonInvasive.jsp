<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">FORM F: Section B: To be filled in for
		performing non-invasive diagnostic Procedures/Tests only</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="nonInvasive"
				id="nonInvasive" modelAttribute="nonInvasive">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Doctor Name
					</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="doctorName"
							id="doctorName" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3"></label>
					<div class="col-md-9 col-lg-9">Indications for diagnosis
						procedure</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3"></label>
					<div class="col-md-9 col-lg-9">
						<table class="table table-striped">
							<c:forEach var="diagnose" items="${diagnoseDetails}">
								<tr>
									<td><input type="checkbox">${diagnose.value}</input></td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<label class="control-label col-md-3 col-lg-3">Any other
						Specify </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text"
							name="otherDiagnoseDetails" id="otherDiagnoseDetails" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5"> Procedures
					</label>
					<div class="col-md-9 col-lg-9">
						<table class="table table-striped">
							<c:forEach var="procedure" items="${procedures}">
								<tr>
									<td><input type="checkbox">${procedure.value}</input></td>
								</tr>
							</c:forEach>
						</table>
					</div>
					<label class="control-label col-md-3 col-lg-3">Any other
						Specify </label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" type="text" name="otherProcedure"
							id="otherProcedure" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Declaration
						Date </label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="declarationDate" type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Procedure
						Carried Date </label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="procedureCarriedDate"
							type='text'></input>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Procedure
						Result </label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="procedureResult" type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">convey
						Details: </label>
					<div class="col-md-9 col-lg-9">
						<label class="control-label col-md-3 col-lg-3">Name:</label> <input
							class='form-control col-md-3 col-lg-3'
							name="conveyDetails.conveyedName" type='text'></input> <label
							class="control-label col-md-3 col-lg-3">Date:</label> <input
							class='form-control' name="conveyDetails.conveyedDate"
							type='text'></input>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">MTP
						Indication </label>
					<div class="col-md-9 col-lg-9">
						<input class='form-control' name="mtpIndication" type='text'></input>
					</div>
				</div>
				<input type="hidden" id="patientID" name="patientID"
					value="${patientID}"> <input type="hidden" id="patientName"
					name="patientName" value="${patientName}">
				<div class="form-actions">
					<label class="control-label col-md-3 col-lg-3" />
					<div class="col-md-9 col-lg-9">
						<a class="btn btn-primary col-md-9 col-lg-9" href="#"
							onclick="submitForm('/account/saveNonInvasiveDetails.action', 'nonInvasive', 'containerdiv');">Continue
							With Section C</a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>