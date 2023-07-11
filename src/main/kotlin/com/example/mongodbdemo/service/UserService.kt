package com.example.mongodbdemo.service

import com.example.mongodbdemo.model.User

interface UserService {
    fun createUser(user: User): User
    fun getUserById(id: String): User
    fun getAllUsers(): List<User>
    fun deleteUserById(id: String): String
}