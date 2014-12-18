<div class="panel panel-default">
	<div class="panel-heading">Search</div>
	<div class="panel-body">
	<fieldset>
			<form class="form-horizontal" id="searchPatientId" name="searchPatientId">
				<div class="form-group">
					<label class="control-label col-md-5 col-lg-5">Enter Patient Id</label>
					<div class="col-md-4 col-lg-4">
					 <input class="form-control " type="text" name="patientId" id="patientId" />
				   </div>
				   <div class="col-md-3 col-lg-3">
				   <a class="btn btn-primary form-control"
						href="#"
						onclick="submitForm('/account/searchReportByPatientId.action', 'searchPatientId', 'searchResultdiv');">
						Search </a>						
				   </div>		
				</div>
			</form>
		</fieldset>
	</div>
</div>
<div id="searchResultdiv"></div>