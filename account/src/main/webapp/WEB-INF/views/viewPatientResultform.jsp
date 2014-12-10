<div class="panel panel-primary">
	<div class="panel-heading">Patient Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry">
				<div class="form-group">
					<div class="col-md-7 col-lg-7"></div>				
					<div class="col-md-3 col-lg-3">
					<div class="form-group">
					  <a class="btn btn-primary" href="<%=request.getContextPath()%>/downLoadForm.action">Download Details as Excel</a>
			        </div>
		        	</div>
		        </div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Patient Name </label>
					<label class="control-label col-md-9 col-lg-9">${form.patientName}</label>
				</div>				
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Patient Address</label>
					<label class="control-label col-md-9 col-lg-9">${form.patientAddress}</label>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Price</label>
					<label class="control-label col-md-9 col-lg-9">${form.price}</label>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Discount</label>
					<label class="control-label col-md-9 col-lg-9">${form.discount}</label>
				</div>
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Net Amount</label>
					<label class="control-label col-md-9 col-lg-9">${form.netAmount}</label>
				</div>								
			</form>
		</fieldset>
	</div>
</div>