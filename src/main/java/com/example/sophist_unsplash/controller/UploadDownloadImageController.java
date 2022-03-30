package com.example.sophist_unsplash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UploadDownloadImageController {

    @PostMapping("api/upload/download")
    @ResponseBody
    public String uploadDownloadImage(
            @RequestParam(name = "image_type") String imageType,
            @RequestBody(required = false) String searchResults
    ) {
        return imageType + searchResults;
    }
}
