package com.example.demo.api

import com.example.demo.model.Thing
import com.example.demo.repository.ThingRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ThingController(private val thingRepository: ThingRepository) {

    @GetMapping("/things")
    fun things(): List<Thing> = thingRepository.getThings()
}