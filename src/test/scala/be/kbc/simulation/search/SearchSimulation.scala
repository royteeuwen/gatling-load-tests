package be.kbc.simulation.search

import be.kbc.config.Config._
import be.kbc.scenario.search.SearchScenario
import io.gatling.core.Predef._

class SearchSimulation extends Simulation {
  private val createSearchExec = SearchScenario.createSearchScenario
    .inject(
      atOnceUsers(users),
      rampUsers(ramp_users) during (ramp_duration)
    )

  setUp(createSearchExec)
}
