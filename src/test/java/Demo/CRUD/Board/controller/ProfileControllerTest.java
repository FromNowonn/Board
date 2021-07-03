package Demo.CRUD.Board.controller;

import org.junit.jupiter.api.Test;
import org.springframework.mock.env.MockEnvironment;

import static org.assertj.core.api.Assertions.assertThat;
public class ProfileControllerTest {
    // given
    public void real_profile이_조회된다() {
    String expectedProfile = "real";
    MockEnvironment env = new MockEnvironment();
        env.addActiveProfile(expectedProfile);
        env.addActiveProfile("oauth");
        env.addActiveProfile("real-db");

    com.doop.book.springboot.web.ProfileController controller = new com.doop.book.springboot.web.ProfileController(env);

    // when
    String profile = controller.profile();

    // then
    assertThat(profile).isEqualTo(expectedProfile);
}

    @Test
    public void real_profile이_없으면_첫번째가_조회된다() {
        // given
        String expectedProfile = "oauth";
        MockEnvironment env = new MockEnvironment();

        env.addActiveProfile(expectedProfile);
        env.addActiveProfile("real-db");

        com.doop.book.springboot.web.ProfileController controller = new com.doop.book.springboot.web.ProfileController(env);

        // when
        String profile = controller.profile();

        // then
        assertThat(profile).isEqualTo(expectedProfile);
    }

    @Test
    public void active_profile이_없으면_default가_조회된다() {
        // given
        String expectedProfile = "default";
        MockEnvironment env = new MockEnvironment();
        com.doop.book.springboot.web.ProfileController controller = new com.doop.book.springboot.web.ProfileController(env);

        // when
        String profile = controller.profile();

        // then
        assertThat(profile).isEqualTo(expectedProfile);
    }
}
