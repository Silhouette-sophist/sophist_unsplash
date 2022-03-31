package com.example.sophist_unsplash.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnsplashUrls  implements Serializable {

    private String thumb;
    private String small;
    private String medium;
    private String regular;
    private String large;
    private String full;
    private String raw;
    private String unsplashUrlsKey;
}
