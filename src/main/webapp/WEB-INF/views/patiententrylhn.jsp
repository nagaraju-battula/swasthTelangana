<script type="text/javascript">
    $(document).ready(function() {
        submitForm('/account/backtohome.action', 'NO-DATA', 'containerdiv');
    });
</script>

<div class="bs-sidebar affix">
    <div class="list-group-item active">
        <li class="active">Select your option</li>
    </div>
    <ul class="nav bs-sidenav"><a href="#" class="list-group-item"
                                  onclick="submitForm('/account/enterPatientDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>New
        Patient entry</strong> </a>
        <li>
            <div class="todo-icon fui-eye"></div>
            <div class="todo-content">
                <h4 class="todo-name">
                    <a href="#"
                       onclick="submitForm('/account/patientNameReportDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Search
                        by name</strong></a>
                </h4>
            </div>
        </li>
        <li>
            <div class="todo-icon fui-eye"></div>
            <div class="todo-content">
                <h4 class="todo-name">
                    <a href="#"
                       onclick="submitForm('/account/patientIdReportDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Search
                        by ID</strong></a>
                </h4>
            </div>
        </li>
        <li>
            <div class="todo-icon fui-eye"></div>
            <div class="todo-content">
                <h4 class="todo-name">
                    <a href="#"
                       onclick="submitForm('/account/formDateReportDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Search
                        with dates</strong></a>
                </h4>
            </div>
        </li>
        <li>
            <div class="todo-icon fui-eye"></div>
            <div class="todo-content">
                <h4 class="todo-name">
                    <a href="#"
                       onclick="submitForm('/account/patientProfiles.action', 'NO-DATA', 'containerdiv');"><strong><br>Patient
                        Profiles</strong></a>
                </h4>
            </div>
        </li>
    </ul>
</div>