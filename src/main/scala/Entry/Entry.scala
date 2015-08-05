package Entry

import org.openqa.selenium.firefox.FirefoxDriver

object Entry {
  def main(args: Array[String]): Unit = {
    println(check_site_title("http://www.google.com"))
  }

  def check_site_title(x: String) = {
    val a = new FirefoxDriver()
    a.get(x)
    val title = a.getTitle
    a.close()
    title
  }
}
