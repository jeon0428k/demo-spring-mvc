package me.junghwan.demospringmvc;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@Builder @NoArgsConstructor @AllArgsConstructor
public class Event {

    private String name;

    private int limitOfEntrollment;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

}
