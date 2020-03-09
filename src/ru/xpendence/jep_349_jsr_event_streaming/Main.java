package ru.xpendence.jep_349_jsr_event_streaming;

import jdk.jfr.consumer.RecordingStream;

import java.time.Duration;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 *
 * @author Вячеслав Чернышов
 * @since 09.03.2020
 */
public class Main {

    public static void main(String[] args) {
        try (var rs = new RecordingStream()) {
            rs.enable("jdk.CPULoad").withPeriod(Duration.ofSeconds(1));
            rs.enable("jdk.JavaMonitorEnter").withThreshold(Duration.ofMillis(10));
            rs.onEvent("jdk.CPULoad", event -> {
                System.out.println(event.getFloat("machineTotal"));
            });
            rs.onEvent("jdk.JavaMonitorEnter", event -> {
                System.out.println(event.getClass("monitorClass"));
            });
            rs.start();
        }
    }
}
