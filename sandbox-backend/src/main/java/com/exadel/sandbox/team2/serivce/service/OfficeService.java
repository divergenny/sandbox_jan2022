package com.exadel.sandbox.team2.serivce.service;

import com.exadel.sandbox.team2.domain.Office;
import com.exadel.sandbox.team2.dto.OfficeDto;
import com.exadel.sandbox.team2.dto.report.ReportByAllOfficesDto;
import com.exadel.sandbox.team2.dto.report.ReportBySingleOfficeDto;
import com.exadel.sandbox.team2.serivce.base.BaseDtoService;

import java.util.Date;
import java.util.List;

public interface OfficeService extends BaseDtoService<Office, OfficeDto> {

    void deleteByCity(long id);

    List<Office> findByCityId(long id);

    List<Office> findByCityName(String cityName);

    List<ReportBySingleOfficeDto> getDataForReportBySingleOffice(Long idOfOffice, Date creationDateFrom, Date creationDateTo);

    List<ReportByAllOfficesDto> getDataForReportByAllOffices(Date creationDateFrom, Date creationDateTo);
}
