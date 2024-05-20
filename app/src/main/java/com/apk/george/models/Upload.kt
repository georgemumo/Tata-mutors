package com.apk.george.models

class Upload {

    var imageUrl:String=""
    var id :String=""
    var Name:String=""
    var Brand:String=""
    var Date:String=""
    var Occupation:String=""
    constructor(Name:String,Brand:String,Date:String,Occupation:String,imageUrl:String,id:String){
        this.Name=Name
        this.Brand=Brand
        this.Date=Date
        this.Occupation=Occupation
        this.imageUrl=imageUrl
        this.id=id
    }
    constructor()
}
