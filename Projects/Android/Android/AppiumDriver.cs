using System.Security.Policy;
using OpenQA.Selenium.Remote;

namespace Android
{
    internal class AppiumDriver
    {
        private Url testServer;
        private DesiredCapabilities desiredCapabilities;

        public AppiumDriver(Url testServer, DesiredCapabilities desiredCapabilities)
        {
            this.testServer = testServer;
            this.desiredCapabilities = desiredCapabilities;
        }
    }
}