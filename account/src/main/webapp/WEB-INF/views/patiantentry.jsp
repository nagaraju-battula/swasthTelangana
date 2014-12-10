<div class="panel panel-default">
	<div class="panel-heading">Patient Entry Form</div>
	<div class="panel-body">
		<fieldset>
			<form:form modelAttribute="patientEntry" class="form-horizontal"
				method="post" action='checkLogin' role="form">
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName">Patient
						Name</label>
					<div class="col-md-6">
						<form:input length="10" class="form-control" path="patientName"
							type="text" name="patientName" id="patientName" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Contact No</label>
					<div class="col-md-6">
						<form:input class="form-control" path="contactNo" type="text"
							name="contactNo" id="contactNo" title="contactNo" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Address</label>
					<div class="col-md-9">
						<form:textarea class="form-control" path="patientAddress" rows="3"
							cols="6" id="patientAddress" name="patientAddress"
							title="patientAddress" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Type Of Test</label>
					<div class="col-md-6">
						<form:select class="form-control select select-primary"
							data-toggle="select" path="typeOfTest" name="typeOfTest"
							id="typeOfTest">
							<form:option value="XRAY">XRAY</form:option>
							<form:option value="SCAN">SCAN</form:option>
							<form:option value="SIMPLE">SIMPLE</form:option>
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Price</label>
					<div class="col-md-6">
						<div class="input-append">
							<form:input class="form-control" path="price" type="text"
								name="price" id="price" title="price" value="" />
							<span class="add-on">Rs</span>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Discount</label>
					<div class="col-md-6">
						<div class="input-append">
							<form:input path="discount" type="text" name="discount"
								id="discount" title="discount" value="" />
							<span class="add-on">Rs</span>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Net Amount</label>
					<div class="col-md-6">
						<div class="input-append">
							<form:input path="netAmount" type="text" name="netAmount"
								id="netAmount" title="netAmount" value="" />
							<span class="add-on">Rs</span>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-4 col-lg-4"></label>
					<button type="submit" class="btn btn-success col-md-2 col-lg-2">Submit</button>
					<label class="control-label col-md-1 col-lg-1"></label>
					<button type="button" class="btn col-md-2 col-lg-2">Clear
						All</button>
				</div>
			</form:form>
		</fieldset>
	</div>
</div>