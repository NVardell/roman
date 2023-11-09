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

    // Single Digit Roman Numeral Representations
    private static final String[] ones = { "",
            "I",     // 1
            "II",    // 2
            "III",   // 3
            "IV",    // 4
            "V",     // 5
            "VI",    // 6
            "VII",   // 7
            "VIII",  // 8
            "IX"     // 9
    };

    // Double Digit Roman Numeral Representations
    private static final String[] tens = { "",
            "X",     // 10
            "XX",    // 20
            "XXX",   // 30
            "XL",    // 40
            "L",     // 50
            "LX",    // 60
            "LXX",   // 70
            "LXXX",  // 80
            "XC"     // 90
    };

    // Triple Digit Roman Numeral Representations
    private static final String[] hundreds = { "",
            "C",     // 100
            "CC",    // 200
            "CCC",   // 300
            "CD",    // 400
            "D",     // 500
            "DC",    // 600
            "DCC",   // 700
            "DCCC",  // 800
            "CM"     // 900
    };

    // Quadruple Digit Roman Numeral Representations
    private static final String[] thousands = { "",
            "M",     // 1000
            "MM",    // 2000
            "MMM"    // 3000
    };

    public String getRoman(String x) {
        log.info("ConvertSvc || Generating roman numeral for integer={}", x);
        
        int num = parseInt(x);

        if(num > 3000 || num < 0)
            return "That numeral is currently unobtainable :/";

        // Retrieve Roman Numeral representation for the individual numeric value
        return thousands[ num / 1000 ]
                + hundreds[ (num%1000) / 100 ]
                + tens[ (num%100) / 10]
                + ones[ num%10 ];
    }

    public String getInteger(String x) {
        log.info("ConvertSvc || Generating integer for roman numeral={}", x);
        return null;
    }
}
