package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
//lskjfls?

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);
//    hai


}

