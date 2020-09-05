package com.anil.expensetrackerkotlin.service

import com.anil.expensetrackerkotlin.dao.ExpenseDAO
import com.anil.expensetrackerkotlin.model.Expense
import org.springframework.web.bind.annotation.*

@RestController
class ExpenseController(val expenseDAO: ExpenseDAO) {

    @GetMapping("/getAllExpenses")
    @CrossOrigin
    fun getAllExpenses():MutableList<Expense> {
//        Thread.sleep(5000)
        return expenseDAO.getExpenses()
    }

    @PostMapping("/saveExpense")
    @CrossOrigin
    fun saveExpense(@RequestBody expense:Expense):Unit{
        print(expense)
        expenseDAO.saveExpense(expense)
    }
}