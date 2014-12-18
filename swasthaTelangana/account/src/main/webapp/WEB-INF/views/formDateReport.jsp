<script type="text/javascript">	
$(document).ready(function() {
	setDefaultDates();
});
</script>

<div class="panel panel-default">
	<div class="panel-heading">Patient Entry Form</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" id="searchFormByDate"
				name="searchFormByDate">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Start Date</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" value="2014-11-20" type="text"
							name="fromDate" id="fromDate" />
					</div>
					<label class="control-label col-md-3 col-lg-3">End Date</label>
					<div class="col-md-3 col-lg-3">
						<input class="form-control" value="2014-11-22" type="text"
							name="toDate" id="toDate" />
					</div>
					<div class="col-md-4 col-lg-4"></div>
					
					<div class="col-md-7 col-lg-7">
					<br>
						<a class="btn btn-primary form-control" href="#"
							onclick="submitForm('/account/searchReportByDateRange.action', 'searchFormByDate', 'searchResultdiv');">
							Search </a>
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>
<div id="searchResultdiv"></div>
