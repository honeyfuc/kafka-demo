package ru.yankov.datageneratormicroservice.service;

import ru.yankov.datageneratormicroservice.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
