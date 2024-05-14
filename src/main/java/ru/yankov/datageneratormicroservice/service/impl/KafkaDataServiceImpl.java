package ru.yankov.datageneratormicroservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;
import ru.yankov.datageneratormicroservice.model.Data;
import ru.yankov.datageneratormicroservice.service.KafkaDataService;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final KafkaSender<String, Object> sender;

    @Override
    public void send(Data data) {

    }
}
