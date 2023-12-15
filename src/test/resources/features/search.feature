Feature: Search functionality

@smoke
Scenario: Search for a term and verify result
  Given user lands on search engine
  When user search for given "fiserv"
  Then user verifies first item from search result is "Fiserv: Financial Services Technology, Mobile Banking ..."
