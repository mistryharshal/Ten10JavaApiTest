Scenario: Location Soap Api Test

Given the user searches for county [county]
Then user retrieve the UK location and validate the result as per parameter [parameter]

Examples:
|county  	    |parameter|
|Greater London|London|  