package be.kbc.config

object Config {
  val kbc_app_url = "https://www.kbc.be"

  val users: Int = Integer.getInteger("users", 10).toInt
  val ramp_users: Int = Integer.getInteger("rampUsers", 20).toInt
  val ramp_duration: Int = Integer.getInteger("rampDuration", 10).toInt
}