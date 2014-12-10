<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="panel panel-default">
	<div class="panel-heading">Enter Form F Details</div>
	<div class="panel-body">
		<fieldset>
			<form class="form-horizontal" method="POST" name="formEntry"
				id="formEntry">
				<c:if test="${saveResult != null}">
		         	  <div class="alert alert-info" role="alert">${saveResult}</div>
		        </c:if>	
		        		
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3" for="patientName">
					 </label>						
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="patientName" type="text"
							name="patientName" id="patientName"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Age</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="age" type="text" name="age"
							id="age" title="age" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">No Of Children</label>
					<div class="col-md-9 col-lg-9">
						<input type="text" class="form-control" for="noOfChildren"
							rows="9" cols="6" id="noOfChildren" 
							title="noOfChildren" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Guardian Name</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="guardianName" type="text"
							name="guardianName" id="guardianName" 
							value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Patient Address</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="patientAddress" type="text"
							name="patientAddress" id="patientAddress" 
							value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Referral
						Address</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="referralAddress" type="text"
							name="referralAddress" id="referralAddress" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">8.Last menstrual period or weeks of pregnancy</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="menstrualPeriod" type="text"
							name="menstrualPeriod" id="menstrualPeriod" />
					</div>
				</div>
				Section B: To be filled in for performing non-invasive diagnostic Procedures/ Tests only
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">9.Name of the doctor performing the procedure's</label>
					<div class="col-md-9 col-lg-9">
						<input class="form-control" for="menstrualPeriod" type="text"
							name="menstrualPeriod" id="menstrualPeriod" />
					</div>
				</div>
				<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
				</c:forTokens>	
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">10.Indication/s for diagnosis procedure</label>
					<div class="col-md-9 col-lg-9">
					
				</div>
				<div class="btn-group"> <a class="btn btn-default dropdown-toggle btn-select2" data-toggle="dropdown" href="#">Select a Region <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">California</a></li>
                <li><a href="#">New York</a></li>
                <li><a href="#">Massachusetts</a></li>
                <li class="divider"></li>
                <li><a href="#">Quebec</a>
                </li><li><a href="#">Ontario</a>
                </li><li><a href="#">British Columbia</a>
                </li>
            </ul>
        </div>
				
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">MedicalDisease</label>
					<div class="col-md-9 col-lg-9">
						<textarea rows="3" col="8" class="form-control"
							for="medicalDisease" name="medicalDisease"
							id="medicalDisease">
							</textarea>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Parental Diagnosis</label>
					<div class="col-md-9 col-lg-9">
						<textarea rows="3" class="form-control" for="parentalDiagnosis"
							type="text" name="parentalDiagnosis" id="parentalDiagnosis">
							</textarea>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3 col-lg-3">Gynecologist Details</label>
					<div class="col-md-9 col-lg-9">
						<textarea rows="3" class="form-control" for="gynecologistDetails"
							name="gynecologistDetails" id="gynecologistDetails">
							</textarea>
					</div>
				</div>
				<div class="form-actions">
					<div class="col-md-3 col-lg-3">	
						<a class="btn btn-primary" href="#"
							onclick="submitForm('/account/saveDetails.action', 'formEntry', 'containerdiv');">Save</a>				
					</div>
				</div>
			</form>
		</fieldset>
	</div>
</div>