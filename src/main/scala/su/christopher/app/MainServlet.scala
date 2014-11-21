package su.christopher.app

import org.scalatra._
import scalate.ScalateSupport

class MainServlet extends GameStack {

  get("/") {
    contentType="text/html"
    jade("client/index")
  }
  
}
