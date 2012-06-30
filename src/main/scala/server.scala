import java.net.URL

object Main {
  def runNetty(base: URL) = {
    import unfiltered.netty._
    Http(8080).resources(base).run
  }
  def runJetty(base: URL) = {
    import unfiltered.jetty._
    Http(8080).resources(base).run
  }
  def main(a: Array[String]) {
    val base = new URL(getClass().getResource("/web/"), ".")
    a match {
      case Array("jetty") =>
        runJetty(base)
      case Array("netty") =>
        runNetty(base)
      case _ => System.err.println("usage: run [netty|jetty]")
    }
  }
}
