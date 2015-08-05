package Entry

import org.openqa.selenium.firefox.FirefoxDriver

  package object Tests  {
    def title_test(url: String) = {
      val driver = new FirefoxDriver()
      driver.get(url)
      assert(driver.getTitle == "Google")
      driver.close()
    }
  }
