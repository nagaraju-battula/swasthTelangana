<script type="text/javascript">	
$(document).ready(function() {
	submitForm('/account/backtohome.action', 'NO-DATA', 'containerdiv');
});
</script>
<div class="todo">
	<div class="todo-search">
		<span class="todo-search-field"> Your account details</span>
	</div>
	<ul>
		<li>
			<div class="todo-icon fui-user"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/enterPatientDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Account details</strong> </a>
				</h4>
			</div>
		</li>
		<li>
			<div class="todo-icon fui-eye"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/patientNameReportDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Account history</strong></a>
				</h4>
			</div>
		</li>
	</ul>
</div>