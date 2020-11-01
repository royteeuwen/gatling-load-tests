package be.kbc.simulation.homepage

import be.kbc.config.Config.{ramp_duration, ramp_users, users}
import be.kbc.scenario.homepage.HomePageScenario
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class HomePageSimulation extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .disableFollowRedirect

  private val createHomeExec = HomePageScenario.createHomePageScenario
    .inject(
      atOnceUsers(users),
      rampUsers(ramp_users) during (ramp_duration)
    )

  setUp(createHomeExec).protocols(httpProtocol)

}
