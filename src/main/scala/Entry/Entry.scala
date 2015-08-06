package Entry

import org.openqa.selenium.firefox.FirefoxDriver

object Entry {
  def main(args: Array[String]): Unit = {
    val page = GoogleHomepage.apply
    Tests.run_tests(page)
  }
}

