Scenario: Wikipedia test

Given user navigates to the wikipedia home page
When user search for a given string in [language]
And user type in a string [parameter] in the search input field
And user click the search button
Then user validate that the first heading of the search results page matches the search string [parameter]
Then verify that the search results page is available in a language given as parameter [language]
When navigate to the search results page in any other language [otherLanguage]
Then validate that the search results page in the new language includes a link to the version in English

Examples:
|language|parameter|otherLanguage|
|English |wikipedia|Deutsch		 |