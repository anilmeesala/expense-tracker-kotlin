package com.anil.expensetrackerkotlin.dao

import com.anil.expensetrackerkotlin.model.Expense
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import java.sql.ResultSet

@Repository
class ExpenseDAO(val jdbcTemplate: JdbcTemplate) {
//    @Autowired
//    lateinit var jdbcTemplate:JdbcTemplate;
//      val lambd1: ()->String = {
//
//            print("test");
//            print("test1");
//            "121"
//    };

    fun getExpenses(): MutableList<Expense> {
        val mutableList = jdbcTemplate.query(
                "select * from expense_tracker"
        ) { rs: ResultSet, _: Int ->
            var expense: Expense? = Expense()
            expense?.id = rs.getInt("id")
            expense?.expenseName = rs.getString("expense_nm")
            expense?.expenseDescription = rs.getString("expense_description")
            expense?.expenseAmount = rs.getBigDecimal("expense_am")
            expense?.expenseDate = rs.getDate("expense_dt")
            expense?.expenseCategory = rs.getString("expense_category")
            expense
        }
        return mutableList;
    }

    fun saveExpense(expense: Expense): Int {
        return jdbcTemplate.update(
                """
                        insert into [dbo].[expense_tracker] (expense_nm,expense_description, 
                        expense_category,expense_am,expense_dt) values (?,?,?,?,?)
                    """
                , expense.expenseName, expense.expenseDescription, expense.expenseCategory,
                expense.expenseAmount, expense.expenseDate
        )
    }
}

fun main() {
    val test: (Int, Int) -> Int = { a, b -> 10 }
    val t = Thread { print("test") }
    t.start()
    print(t.name)
}