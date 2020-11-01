package be.kbc.request.search

import be.kbc.config.Config.kbc_app_url
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object GetPagesSearchRequest {
  val pagesSearch: ChainBuilder = exec(http("Search pages api")
    .get(kbc_app_url + "/X9Y/search/api/v1/pages-assets")
    .queryParam("q", "rekening")
    .queryParam("language", "nl")
    .queryParam("siteName", "particulieren")
    .queryParam("fromIndex", "0")
    .queryParam("toIndex", "10")
    .check(status.is(200)))
}
