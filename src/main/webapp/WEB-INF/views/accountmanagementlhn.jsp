<script type="text/javascript">	
$(document).ready(function() {
	submitForm('/account/backtohome.action', 'NO-DATA', 'containerdiv');
});
</script>
<div class="todo">
	<div class="todo-search">
		<span class="todo-search-field"> Account Management</span>
	</div>
	<ul>
		<li>
			<div class="todo-icon fui-user"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/createaccount.action', 'NO-DATA', 'containerdiv');"><strong><br>Create account</strong> </a>
				</h4>
			</div>
		</li>
		<li>
			<div class="todo-icon fui-eye"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/updateaccount.action', 'NO-DATA', 'containerdiv');"><strong><br>Update account</strong></a>
				</h4>
			</div>
		</li>
		<li>
			<div class="todo-icon fui-eye"></div>
			<div class="todo-content">
				<h4 class="todo-name">
					<a href="#"
						onclick="submitForm('/account/formDateReportDetails.action', 'NO-DATA', 'containerdiv');"><strong><br>Search accounts</strong></a>
				</h4>
			</div>
		</li>
	</ul>
</div>