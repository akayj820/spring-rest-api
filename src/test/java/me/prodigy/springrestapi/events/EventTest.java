package me.prodigy.springrestapi.events;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {
    @DisplayName("builder로 Event 객체 생성 테스트")
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Inflearn Spring REST API")
                .description("REST API development with Spring")
                .build();
        assertThat(event).isNotNull();
    }

    @DisplayName("생성자로 Event 객체 생성 테스트")
    @Test
    public void javaBean() {
        Event event = new Event("Event", "Spring");
        assertThat(event).isNotNull();
    }
}