package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {

    }
    @When("^I accept all cookies$")
    public void iAcceptAllCookies() throws Exception {
        new HomePage().setAcceptCookie();
    }

   @And("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
        //    enter job title 'jobTitle'
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        //    enter Location 'location'
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) throws Exception {
        //    select distance 'distance'
        new HomePage().selectDistance(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
        //	  click on moreSearchOptionsLink
        new HomePage().clickOnMoreSearchLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salaryMin)  {
        //    enter salaryMin 'salaryMin'
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salaryMax)  {
        //    enter salaryMax 'salaryMax'
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType)  {
        //	  select salaryType 'salaryType'
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        //	  select jobType 'jobType'
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on 'Find Jobs' button$")
    public void iClickOnFindJobsButton() {
        //	  click on 'Find Jobs' button
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I can see the result \"([^\"]*)\"$")
    public void iCanSeeTheResult(String result) {
        //	  verify the result 'result'
        new ResultPage().verifyTheResults(result);
    }



}
