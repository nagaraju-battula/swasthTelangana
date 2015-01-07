function processRequest(url, data, targetId) {
	var promodomain = getDomainName('promoadmin');
	jQuery.ajax({
		type : "POST",
		url : promodomain + url,
		data : data,
		/*
		 * headers: { Accept: "application/json" },
		 */
		contentType : "application/json; charset=UTF-8",
		success : function(result) {
			if (result != null) {
				$("#searchResultdiv").empty();
				$("#" + targetId).empty().append(result);
			} else if (result.status == "FAILURE") {
				$('#errorMessage').text("error in emailID updating");
			}
		}
	});
}

function processFileRequest(url, data, targetId) {
	var promodomain = getDomainName('promoadmin');
	try{
	jQuery.ajax({
		type : "GET",
		url : promodomain + url,
		data : data,
		/*
		 * headers: { Accept: "application/json" },
		 */
		contentType : "application/json; charset=UTF-8",
		success : function(result) {
			if (result != null) {
				// $("#" + targetId).empty().append(result);
				window.location.href = result.url;
			} else if (result.status == "FAILURE") {
				$('#errorMessage').text("error in emailID updating");
			}
		}
	});
	}catch(err){
		console.log("Error:"+err);
	}
}

function OpenInNewTab() {

	var win = window.open('D://mysql.stx', '_blank');
	win.focus();
}

function submitForm(url, formId, targetId) {	
	if ('NO-DATA' != formId) {
		formData = JSON.stringify($("#" + formId).serializeObject());
		processRequest(url, formData, targetId);
	} else if ('NO-DATA' == formId) {
		var formData = {};
		processRequest(url, formData, targetId);
	} else if ('searchFormByDate' == formId) {
		formData = JSON.stringify($("#" + formId).serializeObject());
		processFileRequest(url, formData, targetId);
	}
}

$.fn.serializeObject = function() {
	"use strict";
	var result = {};
	var subResult = [];
	var arrayIndex = 0;

	var extend = function(i, element) {
		try {
			var name = element.name;
			var value = element.value;
			/*
			 * All the node names contains . should be in this format
			 * form.clinic.name
			 */
			if (name.indexOf('.') > -1) {
				var property = name.substring(0, name.lastIndexOf("."));
				subResult[arrayIndex++] = property;
			} else {
				result[name] = value;
			}
		} catch (err) {
			console.log("Error" + err);
		}
	};
	/* Extend Function to get the json of any kind of form */
	$.each(this.serializeArray(), extend);

	if (subResult.length > 0) {
		var uniqueElements = $.unique(subResult);
		$.each(uniqueElements, function(index, value) {
			var childNodes = {};
			$.each($("[name^='" + value + "']"), function(k, v) {
				var nodeName = v.name;
				var node = nodeName.substring(nodeName.lastIndexOf(".") + 1,
						nodeName.length);
				childNodes[node] = v.value;
			});
			var beanNode = value
					.substring(value.indexOf(".") + 1, value.length);
			result[beanNode] = childNodes;
		});
	}
	return result;
};

function getDomainName(requiredDomain) {
	// return 'http://swasthtelangana.com:8080';
	return 'http://localhost:8080';

}

/*
 * Code to hide error divs 
 * 
 */
$(document).ready(function(){
	console.log('Hello');
	$("#resultDev").hide();
});


/*
 * Code for Drop Down
 */
$(document.body).on(
		'click',
		'.dropdown-menu li',
		function(event) {
			var $target = $(event.currentTarget);
			$target.closest('.btn-group').find('[data-bind="label"]').text(
					$target.text()).end().children('.dropdown-toggle')
					.dropdown('toggle');

			return false;

		});
