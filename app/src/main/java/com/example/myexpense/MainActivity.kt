package com.example.myexpense

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myexpense.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExpenses.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        displayExpenses()

    }
    fun displayExpenses(){
        val expense1 = Expenses("","Salary","KES 20000","3rd June 2024","","Rent","KES 30567","5th May 2024","","Dividends","KES 58764","6th July 2024")
        val expense2 = Expenses("","Salary","KES 20000","3rd June 2024","","Rent","KES 30567","5th May 2024","","Dividends","KES 58764","6th July 2024")
        val expense3 = Expenses("","Salary","KES 20000","3rd June 2024","","Rent","KES 30567","5th May 2024","","Dividends","KES 58764","6th July 2024")

      var expenses = listOf(expense1,expense2,expense3)
        val expenseAdapter = ExpenseAdapter(expenses)
        binding.rvExpenses.adapter = expenseAdapter
    }
}