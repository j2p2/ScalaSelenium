package Entry

object Entry {
  def main(args: Array[String]): Unit = {
    val page = GoogleHomepage.apply
    Tests.run_tests(page)
  }
}

