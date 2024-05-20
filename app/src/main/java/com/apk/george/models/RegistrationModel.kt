package com.apk.george.models

class RegistrationModel {
    var fullName:String=""
    var phoneNumber:String=""
    var email:String=""
    var age:String=""
    constructor(fullName:String,phoneNumber:String,email:String,age:String){
        this.email=email
        this.age=age
        this.phoneNumber=phoneNumber
        this.fullName=fullName
    }
    constructor()
}