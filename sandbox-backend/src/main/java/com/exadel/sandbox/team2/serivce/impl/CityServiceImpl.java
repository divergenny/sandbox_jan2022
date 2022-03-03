package com.exadel.sandbox.team2.serivce.impl;

import com.exadel.sandbox.team2.dao.CityRepository;
import com.exadel.sandbox.team2.dao.CountryRepository;
import com.exadel.sandbox.team2.domain.City;
import com.exadel.sandbox.team2.domain.Country;
import com.exadel.sandbox.team2.dto.CityDto;
import com.exadel.sandbox.team2.mapper.CityMapper;
import com.exadel.sandbox.team2.serivce.base.CRUDServiceImpl;
import com.exadel.sandbox.team2.serivce.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityServiceImpl extends CRUDServiceImpl<City, CityDto> implements CityService {

    private final CityRepository repository;
    private final CountryRepository countryRepository;
    private final CityMapper mapper;

    @Override
    public CityDto saveDto(CityDto dto) {
        Country country = countryRepository.getById(dto.getCountryId());
        City city = mapper.toEntity(dto);
        city.setCountryId(country);
        return mapper.toDto(repository.save(city));
    }

    @Override
    public CityDto updateDto(CityDto dto, long id) {
        Optional<City> isExist = repository.findById(id);
        if(isExist.isPresent()){
            City city = isExist.get();
            checkAndSet(city,dto);
            return mapper.toDto(repository.save(city));
        }
        return null;
    }

    @Override
    public void checkAndSet(City city, CityDto cityDto) {
        if(cityDto.getName() != null && !city.getName().equals(cityDto.getName()) && !cityDto.getName().equals("string"))
            city.setName(cityDto.getName());
    }
}
