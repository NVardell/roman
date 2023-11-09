package com.roman.feature.convert;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Convert Rest Controller
 *
 * @author NV
 * @since 11/9/2023
 */
@Log4j2
@RestController public class ConvertController {

    @Autowired ConvertSvc convertSvc;

    @GetMapping("convert/integer/{value}") public String convertInteger(@PathVariable String value) {
        log.info("GET || Convert Integer - {}", value);
        return convertSvc.getRoman(value);
    }

    @GetMapping("convert/roman/{value}") public String convertRoman(@PathVariable String value) {
        log.info("GET || Convert Roman - {}", value);
        return convertSvc.getInteger(value);
    }

}
