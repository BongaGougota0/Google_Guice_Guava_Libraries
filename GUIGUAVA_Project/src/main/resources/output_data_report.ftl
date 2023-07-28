<html>
<head>
  <title>Sample Project Report</title>
</head>
<body>
  <h1>
    Sample Project Report: Transaction Value per Source System and Product
  </h1>
  <p>Below is the Transaction Total:
	<table border=1>
	    -- create your template elements here for tabulating the results from OutputData and OutputDataRow
		-- below is just an example
		<#list pets as pet>
		<tr><td>${pet.name}<td>${pet.price} Rands
		</#list>
	</table>
</body>
</html>

