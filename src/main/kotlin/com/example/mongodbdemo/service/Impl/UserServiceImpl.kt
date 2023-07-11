package com.example.mongodbdemo.service.Impl

import com.example.mongodbdemo.model.User
import com.example.mongodbdemo.repository.UserRepository
import com.example.mongodbdemo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{
    @Autowired
    private lateinit var userRepository: UserRepository

    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override fun getUserById(id: String): User {
        return userRepository.findById(id).get()
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun deleteUserById(id: String): String {
        if (userRepository.findById(id).get() != null) {
            userRepository.deleteById(id)
            return "delete"
        }
        return "404 not found exception"

    }
}