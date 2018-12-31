package com.example.demo.repository

import com.example.demo.model.Thing
import org.jdbi.v3.core.Jdbi
import org.springframework.stereotype.Component

@Component
class ThingRepository(val jdbi: Jdbi) {

    fun getThings(): List<Thing> {
        return jdbi.withExtension<List<Thing>, ThingDao, Exception>(ThingDao::class.java) { dao -> dao.getThings() }
    }
}