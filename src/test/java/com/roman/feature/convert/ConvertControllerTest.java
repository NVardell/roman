package com.roman.feature.convert;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Convert Controller Unit Tests
 *
 * @author NV
 * @since 11/9/2023
 */
@SpringBootTest
@AutoConfigureMockMvc
class ConvertControllerTest {

    @Autowired private MockMvc mockMvc;


    @Test public void givenIntegerIsUnderTen_noIssue() throws Exception {
        this.mockMvc.perform(get("/convert/integer/9"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(is("IX")));
    }

    @Test public void givenIntegerIsUnderOneHundred_noIssue() throws Exception {
        this.mockMvc.perform(get("/convert/integer/86"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(is("LXXXVI")));
    }

    @Test public void givenIntegerIsUnderOneThousand_noIssue() throws Exception {
        this.mockMvc.perform(get("/convert/integer/562"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(is("DLXII")));
    }

    @Test public void givenIntegerIsUnderThreeThousand_noIssue() throws Exception {
        this.mockMvc.perform(get("/convert/integer/2524"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(is("MMDXXIV")));
    }

    @Test public void givenIntegerIsGreaterThanThreeThousand_canNotComputer() throws Exception {
        this.mockMvc.perform(get("/convert/integer/3001"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(":/")));
    }
}
