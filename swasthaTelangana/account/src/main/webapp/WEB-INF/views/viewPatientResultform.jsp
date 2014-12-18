<div class="panel panel-default">
	<div class="panel-heading">Patient Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry">
				<table class="table table-hover">
					<tbody>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Name</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.patientName}</label>
							</td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Address</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.patientAddress}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Price</label>
							</td>
							<td><label class="control-label col-md-9 col-lg-9">${form.price}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Discount</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.discount}</label></td>
						</tr>
						<tr>
							<td><label class="control-label col-md-5 col-lg-5">Amount</label></td>
							<td><label class="control-label col-md-9 col-lg-9">${form.netAmount}</label></td>
						</tr>
						<tr>
							<td colspan="2"><a class="btn btn-primary"
								href="<%=request.getContextPath()%>/downLoadForm.action">Download
								Details as Excel</a></td>
						</tr>
						
					</tbody>
				</table>
			</form>
		</fieldset>
	</div>
</div>