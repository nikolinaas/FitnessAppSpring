package org.unibl.etf.ip.fitnessappspring.models;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.List;

@Data
public class NewsFeedRss {
    private String title;
    private String link;
    private String image;
    private String description;
    private String copyright;
    private String item;
}
