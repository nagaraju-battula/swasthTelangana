<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<div class="panel panel-default">
    <div class="panel-heading"><u>FORM F: Section A:To be filled in for
        all Diagnostic Procedures/Tests</u>
    </div>
    <div class="panel-body">
        <fieldset>
            <form class="form-horizontal" method="POST" name="sectionA"
                  id="sectionA" modelAttribute="sectionA">
                <div class="form-group">
                    <label class="control-label col-md-3 col-lg-3">No of
                        Children:</label>

                    <div class="col-md-3 col-lg-3">
                        <input class="form-control" type="text" name="noOfChildren"
                               id="noOfChildren"/>
                    </div>
                    <label class="control-label col-md-3 col-lg-3"> Menstrual
                        period: </label>

                    <div class="col-md-3 col-lg-3">
                        <input class='form-control' name="menstrualPeriod" type='text'/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-lg-3">Sons:</label>

                    <div class="col-md-3 col-lg-3">
                        <input class="form-control" type="text" name="noOfMaleKids"
                               id="noOfMaleKids"/>
                    </div>
                    <label class="control-label col-md-3 col-lg-3">Daughters:</label>

                    <div class="col-md-3 col-lg-3">
                        <input class="form-control" name="noOfFemaleKids" type='text'/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-md-3 col-lg-3">Guardian
                        Name: </label>

                    <div class="col-md-9 col-lg-9">
                        <input class="form-control" name="guardianName" type="text"/>
                    </div>
                </div>
                <input type="hidden" id="patientID" name="patientID"
                       value="${sectionA.patientID}"> <input type="hidden"
                                                    name="patientName" value="${sectionA.patientName}">

                <div class="form-actions">
                    <label class="control-label col-md-3 col-lg-3"/>

                    <div class="col-md-3 col-lg-3">
                        <a class="btn btn-primary col-md-9 col-lg-9" href="#"
                           onclick="submitForm('/account/previousSectionA.action', 'sectionA', 'containerdiv');">Previous</a>
                    </div>
                    <div class="col-md-3 col-lg-3">
                        <a class="btn btn-primary col-md-9 col-lg-9" href="#"
                           onclick="submitForm('/account/saveSectionA.action', 'sectionA', 'containerdiv');">Save</a>
                    </div>
                    <div class="col-md-3 col-lg-3">
                        <a class="btn btn-primary col-md-9 col-lg-9" href="#"
                           onclick="submitForm('/account/nextSectionA.action', 'sectionA', 'containerdiv');">Next>></a>
                    </div>
                </div>
            </form>
        </fieldset>
    </div>
</div>