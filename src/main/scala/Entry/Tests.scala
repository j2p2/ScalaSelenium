package Entry

import org.openqa.selenium.firefox.FirefoxDriver

package object Tests  {
  // Can list the tests to be run here, as well as break them into different categories through defs
  def run_tests(page: BasicPage) = {
    title_test(page)
  }

  def title_test(page: BasicPage) = {
    val driver = new FirefoxDriver()
    driver.get(page.url)
    assert(driver.getTitle == page.title)
    driver.close()
    println("Title test: passed")
  }
}
