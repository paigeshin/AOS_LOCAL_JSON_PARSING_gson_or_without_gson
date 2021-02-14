package com.paigesoftware.localjsonreader

data class Users(
    val users: ArrayList<UserModelClassForGSON>
)

data class UserModelClassForGSON(
    val id: Int,
    val name: String,
    val email: String,
    val gender: String,
    val weight: Double,
    val height: Int,
    val phone: Phone
)

data class Phone(
    val mobile: String,
    val office: String
)