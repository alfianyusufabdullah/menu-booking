package alfianyusufabdullah.menubooking.adapter

import alfianyusufabdullah.menubooking.R
import alfianyusufabdullah.menubooking.entity.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class MenuItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemName = itemView.findViewById(R.id.itemName) as TextView
    val itemPrice = itemView.findViewById(R.id.itemPrice) as TextView
    val itemCount = itemView.findViewById(R.id.itemCount) as TextView
    val btnAdd = itemView.findViewById(R.id.itemAdd) as MaterialButton
    val btnRemove = itemView.findViewById(R.id.itemRemove) as MaterialButton

    fun bindContent(menuItem: MenuItem) {
        itemCount.text = menuItem.count.toString()
        itemName.text = menuItem.name
        itemPrice.text = "Rp. ${menuItem.price}"
    }
}