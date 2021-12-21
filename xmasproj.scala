
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class xmasproj extends Simulation {

  private val httpProtocol = http
    .baseUrl("http://52.213.211.128:3000")
    .inferHtmlResources(AllowList(), DenyList())
    .doNotTrackHeader("1")
    .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36")
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Accept-Encoding" -> "gzip, deflate",
  		"Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8,ru;q=0.7",
  		"Sec-GPC" -> "1",
  		"Upgrade-Insecure-Requests" -> "1"
  )
  
  private val headers_1 = Map("Origin" -> "http://52.213.211.128:3000")
  
  private val uri2 = "https://fonts.gstatic.com/s/slabo27px/v7/mFT0WbgBwKPR_Z4hGN2qgx8D1Q.woff2"

  private val scn = scenario("xmasproj")
    .exec(
      http("request_0")
        .get("/fibonacci/10")
        .headers(headers_0)
        .resources(
          http("request_1")
            .get(uri2)
            .headers(headers_1)
        )
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
