<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CreditCard-Home Page</title>
<style>
h2,div{
  text-align: center;
}
</style>
</head>
<body bgcolor="cyan">
	<h2>Check for Credit Card Eligibility</h2>
	<div>
	<form action="checkEligibility">
		<h3><label>Enter PAN Number</label></h3>
		<input type="text" id="panNo" name="panNo" required
			title="10 character alpha numeric" maxlength="10" pattern="[a-zA-Z0-9]{10}" />
		<input type="submit" id="submit" value="Check">
	</form>
	</div>
</body>
</html>