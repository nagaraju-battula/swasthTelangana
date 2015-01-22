<div class="panel panel-primary">
	<div class="panel-heading">Form Details between the selected
		Dates</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry">
				<c:forEach var="formListValue" items="${form.formbeans}">
					<label class="control-label col-md-3 col-lg-3">Patient
						Name: ${formListValue.patientName}</label>
				</c:forEach>
			</form>
		</fieldset>
	</div>
</div>