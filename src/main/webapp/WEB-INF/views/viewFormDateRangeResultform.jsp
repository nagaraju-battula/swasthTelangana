<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="panel panel-default">
	<div class="panel-heading">Form Details between the selected
		Dates</div>
	<div class="panel-body">
		<fieldset>
			<c:choose>
				<c:when test="${fn:length(form.formbeans) gt 0}">
					<table class="table table-hover">
						<tbody>
							<tr>
								<th><b>Patient Name</b></th>
								<th><b>Age</b></th>
								<th><b>Doctor</b></th>
							</tr>
							<c:forEach var="formListValue" items="${form.formbeans}">
								<tr>
									<td><form id="form${formListValue.formID}">
											<input type="hidden" name="searchFormId" id="searchFormId"
												value="${formListValue.formID}"> <a href="#"
												onclick="submitForm('/account/searchReportByFormId.action','form${formListValue.formID}','resultDetailsDiv');"><strong>${formListValue.patientName}</strong></a>
										</form></td>
									<td>${formListValue.age}</td>
									<td>${formListValue.gynecologistDetails}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:when>
				<c:otherwise>
					Oooops!!! No results found for the selected date range.
				</c:otherwise>
			</c:choose>
		</fieldset>
	</div>
</div>
<div id="resultDetailsDiv"></div>