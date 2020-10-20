package com.wordsearch.writeservice.dto.requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class AddSubtitleEntryRequest {
    private String tvSeries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String episodeName; //Some TV shows don't have episode names

    private Integer seasonNumber;

    private Integer episodeNumber;
}
