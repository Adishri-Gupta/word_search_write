package com.wordsearch.writeservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "subtitles", replicas = 2)
public class SubtitleDocument {
    @Id
    private String id;
    private String tvSeries;
    private String episodeName;
    private Integer seasonNumber;
    private Integer episodeNumber;
}
