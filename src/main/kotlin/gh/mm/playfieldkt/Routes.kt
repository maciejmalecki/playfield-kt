package gh.mm.playfieldkt

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.EntityResponse
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes {
    @Bean
    fun route() = router {
        GET("/users") { _ -> ServerResponse.ok().bodyValue("ok") }
    }
}
