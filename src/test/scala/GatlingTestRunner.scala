import be.kbc.simulation.homepage.HomePageSimulation
import be.kbc.simulation.search.SearchSimulation
import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object GatlingTestRunner {

  def main(args: Array[String]): Unit = {
    // this is where you specify the class you want to run
    val simClass = classOf[HomePageSimulation].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)
    props.resultsDirectory("./target/reports")

    Gatling.fromMap(props.build)
  }
}