package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef0601 {
    DialogContent dc = new DialogContent();

    @Given("User selects an option in the Community poll")
    public void userSelectsAnOptionInTheCommunityPoll() {
        dc.myJSClick(dc.communityPollSelect);
    }

    @When("Clicks on Vote button")
    public void clicksOnVoteButton() {
        dc.myJSClick(dc.voteButton);
    }

    @Then("user should be able to see how many people voted before")
    public void userShouldBeAbleToSeeHowManyPeopleVotedBefore() {
        dc.verifyContainsText(dc.votingCount,"vote(s)");
    }
}
