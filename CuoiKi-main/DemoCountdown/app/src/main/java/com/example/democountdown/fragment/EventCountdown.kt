package com.example.democountdown.fragment

import java.sql.Time
import java.util.*

class EventCountdown {
    var nameEvent: String? = null
    var desEvent: String? = null
    var dateEvent: String? = null
    var timeEvent: String? = null
    var imageEvent: Int? = null
    constructor(nameEvent:String, desEvent:String, dateEvent: String, timeEvent: String, imageEvent: Int){
        this.nameEvent  = nameEvent
        this.desEvent   = desEvent
        this.dateEvent  = dateEvent
        this.timeEvent  = timeEvent
        this.imageEvent = imageEvent
    }
}