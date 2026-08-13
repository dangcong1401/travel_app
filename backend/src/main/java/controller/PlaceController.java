package com.example.travel_api.controller;

import com.example.travel_api.model.Place;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class PlaceController {

    @GetMapping("/api/getAllPlace")
    public List<Place> getAllPlace() {

        return Arrays.asList(

                new Place(
                        1,
                        "Ha Noi",
                        "https://images.unsplash.com/photo-1528127269322-539801943592"
                ),

                new Place(
                        2,
                        "Ho Chi Minh",
                        "https://images.unsplash.com/photo-1583417319070-4a69db38a482"
                ),

                new Place(
                        3,
                        "Da Nang",
                        "https://images.unsplash.com/photo-1559592413-7cec4d0cae2b"
                ),

                new Place(
                        4,
                        "Ha Long",
                        "https://images.unsplash.com/photo-1528127269322-539801943592"
                ),

                new Place(
                        5,
                        "Da Lat",
                        "https://images.unsplash.com/photo-1528127269322-539801943592"
                ),

                new Place(
                        6,
                        "Nha Trang",
                        "https://images.unsplash.com/photo-1528127269322-539801943592"
                )
        );
    }
}