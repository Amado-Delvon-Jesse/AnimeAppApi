package com.anime.AnimeAppApi.jikan.model.full;

import lombok.Data;

@Data
public class Entry {
    public int mal_id;
    public String type;
    public String name;
    public String url;
}
