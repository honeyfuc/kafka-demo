package ru.yankov.datageneratormicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.yankov.datageneratormicroservice.model.Data;
import ru.yankov.datageneratormicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
