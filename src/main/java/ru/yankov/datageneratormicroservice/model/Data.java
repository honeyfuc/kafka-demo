package ru.yankov.datageneratormicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class Data {

    private Long sensorId;

    private LocalDateTime timestamp;

    private double measurement;

    private MeasurementType measurmentType;

    public enum MeasurementType {
        TEMPERATURE,
        VOLTAGE,
        POWER
    }
}
