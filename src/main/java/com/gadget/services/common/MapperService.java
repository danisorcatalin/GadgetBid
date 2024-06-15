package com.gadget.services.common;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapperService {

    private final ModelMapper modelMapper;

    public MapperService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
        return source
                .stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }

    public <S, T> T map(S source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }

}
