package ru.yankov.datageneratormicroservice.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ru.yankov.datageneratormicroservice.model.Data;

import java.time.LocalDateTime;

public class DataDto {

    private Long sensorId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;

    private double measurement;

    private Data.MeasurementType measurmentType;

    private Data.MeasurementType measurementType;
}
