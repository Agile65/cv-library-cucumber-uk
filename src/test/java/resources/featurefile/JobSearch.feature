@smoke @regression
Feature: Job search test
  Scenario Outline: Verify job search result using different data set
    Given I am on the homepage
    When I accept all cookies
    And I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on 'Find Jobs' button
    Then I can see the result "<result>"

   Examples:
      |jobTitle   |location   |distance |salaryMin|salaryMax|salaryType |jobType    |result                                     |
      |Tester     |Harrow     | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Tester     |Crawley    | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Crawley           |
      |Test Lead  |Harrow     | 10 mile |30000    |600000   |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Tester     |Harrow     | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Tester     |Surrey     | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Sutton            |
      |Tester     |Harrow     | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
      |Tester     |Harrow     | 5 miles |30000    |500000   |Per annum  | Permanent |Permanent Tester jobs in Harrow on the Hill|
