function processRequest(url, data, targetId) {
    var promodomain = getDomainName('promoadmin');
    jQuery.ajax({
        type: "POST",
        url: promodomain + url,
        data: data,
        /*headers: {
            Accept: "application/json"
        },*/
        contentType: "application/json; charset=UTF-8",
        success: function (result) {
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
    jQuery.ajax({
        type: "POST",
        url: promodomain + url,
        data: data,
        /*headers: {
            Accept: "application/json"
        },*/
        contentType: "application/json; charset=UTF-8",
        success: function (result) {
            if (result != null) {
            	//$("#" + targetId).empty().append(result);
            	 window.location.href = result.url;
            } else if (result.status == "FAILURE") {
                $('#errorMessage').text("error in emailID updating");
            }
        }
    });
}

function OpenInNewTab() {
	
	  var win = window.open('D://mysql.stx', '_blank');
	  win.focus();
	}


function submitForm(url, formId, targetId) {
	var formData = {};
	if('NO-DATA' != formId){
		formData = JSON.stringify($("#" + formId).serializeObject());
	}
	if('FORMFILE' == formId){
		processFileRequest(url, formData, targetId);	
	}else{
		processRequest(url, formData, targetId);
	}
	
}

$.fn.serializeObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

function getDomainName(requiredDomain) {
    //return 'http://swasthtelangana.com:8080';
    return 'http://localhost:8080';
    /*$.getJSON("/properties/properties.json", function(data) {
		properties = data;
	});
	if(requiredDomain == 'promoadmin'){
		return properties.handlebarsdomain['loaclhost'];
	}else if(requiredDomain == 'handlebars'){
	} */
}
