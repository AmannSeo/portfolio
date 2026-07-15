package edu.portfolio.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

class HomeControllerTests {

    private final HomeController controller = new HomeController();

    @Test
    void addsServerTimeAndReturnsHomeView() {
        var model = new ConcurrentModel();

        var viewName = controller.home(Locale.KOREA, model);

        assertThat(viewName).isEqualTo("home");
        assertThat(model.getAttribute("serverTime")).isInstanceOf(String.class);
    }
}
