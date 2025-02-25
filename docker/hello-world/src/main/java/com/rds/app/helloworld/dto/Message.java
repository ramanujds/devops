package com.rds.app.helloworld.dto;

import java.time.LocalDate;

public record Message(String title, String content, LocalDate date) {
}
