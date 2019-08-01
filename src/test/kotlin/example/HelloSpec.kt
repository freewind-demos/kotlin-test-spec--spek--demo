package example

import org.assertj.core.api.Assertions.assertThat
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object HelloSpec : Spek({
    describe("Hello") {
        describe("hello") {
            it("returns greeting") {
                assertThat(Hello.hello("you")).isEqualTo("Hello, you!")
            }
        }
    }
})