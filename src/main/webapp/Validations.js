function onlyAlphabets(e, t) {
	try {
		if (window.event) {
			var charCode = window.event.keyCode;
		} else if (e) {
			var charCode = e.which;
		} else {
			return true;
		}
		if ((charCode > 64 && charCode < 91)
				|| (charCode > 96 && charCode < 123) || charCode==32)
			return true;
		else
			return false;
	} catch (err) {
		alert(err.Description);
	}
}

function onlyAlphaNumberic(e, t) {
	try {
		if (window.event) {
			var charCode = window.event.keyCode;
		} else if (e) {
			var charCode = e.which;
		} else {
			return true;
		}
		if ((charCode > 47 && charCode < 91)
				|| (charCode > 96 && charCode < 123))
			return true;
		else
			return false;
	} catch (err) {
		alert(err.Description);
	}
}

function onlyAddress(e, t) {
	try {
		if (window.event) {
			var charCode = window.event.keyCode;
		} else if (e) {
			var charCode = e.which;
		} else {
			return true;
		}
		
		if ((charCode > 47 && charCode < 91)
				|| (charCode > 96 && charCode < 123) || (charCode == 13 || charCode == 32))
			return true;
		else
			return false;
	} catch (err) {
		alert(err.Description);
	}
}

function onlyCurrency(e, t) {
	try {
		
		if (window.event) {
			var charCode = window.event.keyCode;
		} else if (e) {
			var charCode = e.which;
		} else {
			return true;
		}
		if ((charCode > 47 && charCode < 58) || (charCode == 46)){
			
			if(charCode==46){
				var currentValue = t.value;  // gets the current value of object
				if(currentValue.indexOf(".")>-1)
					return false;
			}
		    return true;
		}
		else
			return false;
	} catch (err) {
		alert(err.Description);
	}
}
