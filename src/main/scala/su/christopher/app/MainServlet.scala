package su.christopher.app

import org.scalatra._
import scalate.ScalateSupport
import com.boardgame.game._

class MainServlet extends GameStack {

  var game: Game = _

  get("/") {
    contentType="text/html"
    jade("client/index", "layout" -> "WEB-INF/layouts/empty.jade", "title" -> "Game")
  }

  post("/game") {
    game = new Game(params("players").toInt)
    Ok("Good")
  }

  get("/game") {
    Ok(game.getNumPlayers())
  }
  
}