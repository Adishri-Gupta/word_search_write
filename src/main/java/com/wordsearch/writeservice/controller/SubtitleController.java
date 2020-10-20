package com.wordsearch.writeservice.controller;

import com.wordsearch.writeservice.dto.requests.AddSubtitleEntryRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class SubtitleController {

    @PostMapping("/createEntry")
    public void createSubtitleEntry(@RequestBody AddSubtitleEntryRequest request) {
        // Add validations on duplicate create request
        // Populate the json doc in elastic search
        // send the status along with the id of created entry
    }

    @PostMapping("/addSubtitleToEntry/{id}") //TODO add regex validation on id
    public void addSubtitleToEntry(@PathVariable String id, @RequestBody MultipartFile subtitles) {
        // Add validations on file and id -> ValidationUtils
        // Process subtitles file
        // return status
    }


    //Required in future for error handling
    @DeleteMapping("/deleteEntry/{id}") //TODO add regex validation on id
    public void deleteSubtitleEntry() {
       // Validate request
       // Delete subtitle in question
       // return status
    }
}
