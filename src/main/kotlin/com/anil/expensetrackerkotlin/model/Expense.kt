package com.anil.expensetrackerkotlin.model

import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.sql.Date

@Component
data class Expense(var id:Int?=null,var expenseName:String?=null,
                   var expenseDescription:String?=null,var expenseCategory:String?=null,
                   var expenseAmount:BigDecimal?=null,var expenseDate:Date?=null) {
}