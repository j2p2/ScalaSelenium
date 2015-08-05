package PageTests

import org.openqa.selenium.firefox.FirefoxDriver

import scala.testing.SUnit.Test

@Test
object PageTests {
  def title_test(url: String) = {
    val driver = new FirefoxDriver()
    driver.get(url)
    assert(driver.getTitle == "Google")
    driver.close()
  }
}