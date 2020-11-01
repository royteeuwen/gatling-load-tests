package be.kbc.request.search

import be.kbc.config.Config.kbc_app_url
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetSearchPageRequest {
  val searchPage: ChainBuilder = exec(http("Open search page")
    .get(kbc_app_url + "/particulieren/nl/zoek.html")
    .queryParam("q", "rekening")
    .check(status.is(200)))
}
