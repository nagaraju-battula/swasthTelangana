<script type="text/javascript">	
$(document).ready(function() {
	submitForm('/account/backtohome.action', 'NO-DATA', 'containerdiv');
});
</script>

<div class="todo">
	<div class="todo-search">
		<span class="todo-search-field"> Patient entry and Search</span>
	</div>
	<ul>
		<li>
			<div class="todo-icon fui-user"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/enterPatientDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>New
							Patient entry</strong> </a>
				</h4>
			</div>
		</li>
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
	</ul>
</div>