package com.rentcloud.rent_process_task.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {

    @Override
    public boolean validateDL(String dNumber){
        return dNumber.length()>5;
    }
}
