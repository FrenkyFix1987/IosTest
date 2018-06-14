using TechTalk.SpecFlow;

namespace TestAND
{
    [Binding]
    public class amd : Driver
    {
        [Given("I will see page with popup with privacy policy")]
        public void installAndRunApplication()
        {
            var button_agree = Driver.Theapplicationisrun().FindElementById("btn_yes");
        }

        [When("I press button I Agree")]
        public void pressButtonAgree()
        {
            var button_agree = Driver.Theapplicationisrun().FindElementById("btn_yes");
            button_agree.Click();
        }

        [Then("the result should be page with type language")]
        public void ThenTheResultShouldBe()
        {
            var button_lang = Driver.Theapplicationisrun().FindElementById("btn_lang_name");
        }
    }
}
