package gh.mm.playfieldkt.backend

import gh.mm.playfieldkt.domain.address.Address
import gh.mm.playfieldkt.domain.users.User
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes {
    @Bean
    fun route() = router {
        GET("/users") {
            ServerResponse.ok().bodyValue(
                    User(
                            name = "John Doe",
                            address = Address(
                                    streetNo = "Dorobkiewicza",
                                    zipCode = "55-010",
                                    city = "Sieradz",
                                    country = "Poland"
                            )))
        }
    }
}
