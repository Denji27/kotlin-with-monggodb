package com.example.mongodbdemo.repository

import com.example.mongodbdemo.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String>{
}