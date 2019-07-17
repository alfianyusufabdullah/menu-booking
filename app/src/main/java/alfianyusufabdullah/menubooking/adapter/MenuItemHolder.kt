package alfianyusufabdullah.menubooking.adapter

import alfianyusufabdullah.menubooking.R
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemName = itemView.findViewById<TextView>(R.id.itemName)
    val itemPrice = itemView.findViewById<TextView>(R.id.itemPrice)
    val itemCount = itemView.findViewById<TextView>(R.id.itemCount)

    val btnRemove = itemView.findViewById<Button>(R.id.itemRemove)
    val btnAdd = itemView.findViewById<Button>(R.id.itemAdd)
}