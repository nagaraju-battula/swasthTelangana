<div class="panel panel-default">
	<div class="panel-heading">Form F Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry">
				<table class="table table-hover">
					<tbody>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Patient Name</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.patientName}</label>
							</td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Age</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.age}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">No Of Children</label>
							</td>
							<td><label class="control-label col-md-9 col-lg-9">${form.noOfChildren}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Guardian Name</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.guardianName}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Patient Address</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.patientAddress}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Referral Address</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.referralAddress}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Menstrual Period</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.menstrualPeriod}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Medical Disease</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.medicalDisease}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Parental Diagnosis</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.parentalDiagnosis}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Gynecologist Details</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.gynecologistDetails}</label></td>
						</tr>
						<tr>
							<td colspan="2"><a class="btn btn-primary" href="<%=request.getContextPath()%>/downLoadForm.action">Download Details as Excel</a></td>
						</tr>
						
					</tbody>
				</table>
			</form>
		</fieldset>
	</div>
</div>