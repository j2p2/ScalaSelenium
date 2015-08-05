import org.openqa.selenium.firefox.FirefoxDriver

object Entry {
  def main(args: Array[String]): Unit = {
    println("test")
    val x = add_2_and_print(15, 3)
    println(x + 2)
    println(check_site_title("http://www.google.com"))
  }

  def add_2_and_print(x: Int, y: Int): Int = {
    val a = x + y
    println(a)
    a
  }

  def check_site_title(x: String) = {
    val a = new FirefoxDriver()
    a.get(x)
    val title = a.getTitle
    a.close()
    title
  }
}
