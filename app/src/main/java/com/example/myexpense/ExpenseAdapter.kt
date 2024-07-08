package com.example.myexpense

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(var expenseList: List<Expenses>) :
   RecyclerView.Adapter<ExpenseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.expense_list_item,parent,false)
        return ExpenseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        var blog = expenseList[position]
        holder.tvRe.text=blog.rentee
        holder.tvSalary.text=blog.salary
        holder.tvHun.text=blog.kes
        holder.tvDate.text=blog.date
        holder.tvRee.text=blog.rent
        holder.tvRent.text=blog.ren
        holder.tvRe.text=blog.rentee
        holder.tvDatee.text=blog.datee
        holder.tvDividends.text=blog.dividends
        holder.tvDivide.text=blog.divide
        holder.tvDends.text=blog.divid
        holder.tvDat.text=blog.dat


    }

    override fun getItemCount(): Int {
       return expenseList.size
    }
}

class ExpenseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvDatee = itemView.findViewById<TextView>(R.id.tvDatee)
    var tvSal = itemView.findViewById<TextView>(R.id.tvSal)
    var tvRee = itemView.findViewById<TextView>(R.id.tvRee)
    var tvRent = itemView.findViewById<TextView>(R.id.tvRent)
    var tvRe = itemView.findViewById<TextView>(R.id.tvRe)
    var tvDividends = itemView.findViewById<TextView>(R.id.tvDividends)
    var tvDivide = itemView.findViewById<TextView>(R.id.tvDivide)
    var tvDends = itemView.findViewById<TextView>(R.id.tvDends)
    var tvDat = itemView.findViewById<TextView>(R.id.tvDat)
    var tvHun = itemView.findViewById<TextView>(R.id.tvHun)

}