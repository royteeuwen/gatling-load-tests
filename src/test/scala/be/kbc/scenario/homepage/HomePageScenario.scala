package be.kbc.scenario.homepage

import be.kbc.request.homepage.HomePageRedirectRequest
import be.kbc.request.homepage.HomePageRequest
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder

object HomePageScenario {
  val createHomePageScenario: ScenarioBuilder = scenario("Home Page Scenario")
    .exec(HomePageRedirectRequest.homePageRedirect)
    .exec(HomePageRequest.homePage)
}
