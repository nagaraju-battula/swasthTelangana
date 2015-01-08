<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">Patient Profiles </div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" id="patientDetails"
				role="form">
				<div class="form-group" id="resultDev">
					<table class="table table-bordered" data-toggle="table" data-cache="false"
						data-height="299">
						<thead>
							<tr>
								<th data-field="id">Patient ID</th>
								<th data-field="name">Patient Name</th>
								<th data-field="price">Created Time</th>
								<th data-field="price">Download FormF</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${result}">
								<c:forEach var="patient" items="${patientProfiles}">
									<tr>
										<td><c:out value="${patient.patientId}" /></td>
										<td><c:out value="${patient.patientName}" /></td>
										<td><c:out value="${patient.createdTimestamp}" /></td>
										<td><c:out value="${patient.formFDownloadPath}" /></td>
									</tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</form>
		</fieldset>
	</div>
</div>
