package be.kbc.request.homepage

import be.kbc.config.Config.kbc_app_url
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object HomePageRequest {
  var homePage: ChainBuilder = exec(http("Redirect of homepage")
      .get(kbc_app_url + "/nl.html")
      .check(status.is(301))
      .check(header("Location").is(kbc_app_url + "/particulieren/nl.html")))
}
