package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")

public class ReviewController {
    private ReviewService reviewService ;
    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity <Review> createReview (@RequestBody Map<String,String> payload){
    return new ResponseEntity <Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }
}
