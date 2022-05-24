package com.project.mapper;

import com.project.dto.CarDTO;
import com.project.model.Car;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarDTO carToCarDTO(Car car);
    Car carDTOToCar(CarDTO carDTO);
    List<CarDTO> carToCarDTOList(List<Car> carList);


}
