package alfianyusufabdullah.menubooking.adapter

import alfianyusufabdullah.menubooking.R
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuHeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemHeader = itemView.findViewById(R.id.tvHeaderItem) as TextView
}