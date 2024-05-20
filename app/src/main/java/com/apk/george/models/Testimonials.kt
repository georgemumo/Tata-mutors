package com.apk.george.models

import java.util.Date

class Testimonials {
    var Occupation:String=""
    var Name:String=""
    var Date:String=""
    var Brand:String=""
    var id:String=""
    constructor(Name:String,Occupation:String,Date:String,Brand:String){
        this.Name=Name
        this.Date=Date
        this.Occupation=Occupation
        this.Brand=Brand
        this.id=id
    }
    constructor()
}