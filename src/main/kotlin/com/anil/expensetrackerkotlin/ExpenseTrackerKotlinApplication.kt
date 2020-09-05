package com.anil.expensetrackerkotlin

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class ExpenseTrackerKotlinApplication
//class ExpenseTrackerKotlinApplication @Autowired constructor(val expenseDAO: ExpenseDAO):CommandLineRunner{
//	override fun run(vararg args: String?) {
////		print(expenseDAO.getExpenses());
//		val expense:Expense = Expense(1,"test1","desc1","cat1", BigDecimal(1999), LocalDate.now());
//		expenseDAO.saveExpense(expense);
//		print(expenseDAO.getExpenses())
//
//	}
//
//}

fun main(args: Array<String>) {
	runApplication<ExpenseTrackerKotlinApplication>(*args)
//	same as above
//	SpringApplication.run(ExpenseTrackerKotlinApplication::class.java,*args);
}
