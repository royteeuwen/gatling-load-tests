package be.kbc.scenario.search

import be.kbc.request.search.{GetPagesSearchRequest, GetSearchPageRequest}
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder

object SearchScenario {
  val createSearchScenario: ScenarioBuilder = scenario("Search Scenario")
    .exec(GetSearchPageRequest.searchPage)
    .exec(GetPagesSearchRequest.pagesSearch)
}
