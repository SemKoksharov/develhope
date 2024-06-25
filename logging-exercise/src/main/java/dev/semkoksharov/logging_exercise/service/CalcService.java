package dev.semkoksharov.logging_exercise.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    private static final Logger logger = LoggerFactory.getLogger(CalcService.class);

    public double exponentCalc(int base, int exponent) {
        logger.debug("Base value: {}", base);
        logger.debug("Exponent value: {}", exponent);

        double result = Math.pow(base,exponent);

        return result;
    }

}
