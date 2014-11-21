package su.christopher.app

import org.scalatra._
import scalate.ScalateSupport

class MainServlet extends GameStack {

  get("/") {
    contentType="text/html"
    jade("client/index", "layout" -> "WEB-INF/layouts/empty.jade", "title" -> "Game")
  }

  get("/assets/:path") {
    Ok(new java.io.File("src/main/webapp/WEB-INF/templates/views/client/assets/" + params("path")))
  }
  
}