package com.project.mapper;

import com.project.DTO.CarDTO;
import com.project.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);
    CarDTO carToCarDTO(Car car);
    Car carDTOToCar(CarDTO carDTO);
    List<CarDTO> carToCarDTOList(List<Car> carList);


}
