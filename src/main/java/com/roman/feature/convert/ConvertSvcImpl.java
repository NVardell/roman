package com.roman.feature.convert;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import static java.lang.Integer.parseInt;

/**
 * Convert Service Implementation
 *
 * @author NV
 * @since 11/9/2023
 */
@Log4j2
@Service public class ConvertSvcImpl implements ConvertSvc {

    public String getRoman(String x) {
        log.info("ConvertSvc || Generating roman numeral for integer={}", x);
        return null;
    }

    public String getInteger(String x) {
        log.info("ConvertSvc || Generating integer for roman numeral={}", x);
        return null;
    }
}
