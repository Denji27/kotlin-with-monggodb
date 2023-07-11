package com.example.mongodbdemo.controller

import com.example.mongodbdemo.model.User
import com.example.mongodbdemo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kotlin/mongodb/user")
class UserController {
    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun getAllUsers(): ResponseEntity<List<User>>{
        return ResponseEntity.ok(userService.getAllUsers())
    }

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User>{
        return ResponseEntity.ok(userService.createUser(user))
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): ResponseEntity<User>{
        return ResponseEntity.ok(userService.getUserById(id))
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): String{
        return userService.deleteUserById(id)
    }
}