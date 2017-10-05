package com.github.felixgail.gplaymusic.model.shema;

import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class GenreResponse implements Serializable {
  @Expose
  private List<Genre> genres;

  public Optional<List<Genre>> getGenres() {
    return Optional.ofNullable(genres);
  }
}
