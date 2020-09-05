package com.anil.expensetrackerkotlin.controller

import com.anil.expensetrackerkotlin.dao.ExpenseDAO
import com.anil.expensetrackerkotlin.model.Expense
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val expenseDAO: ExpenseDAO) {

    @GetMapping("/hello")
    fun hello():String = "hello"
}