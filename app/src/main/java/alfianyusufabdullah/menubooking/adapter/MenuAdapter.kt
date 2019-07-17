package alfianyusufabdullah.menubooking.adapter

import alfianyusufabdullah.menubooking.R
import alfianyusufabdullah.menubooking.entity.MenuItem
import alfianyusufabdullah.menubooking.inflate
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private lateinit var addedListener: ((MenuItem, Int) -> Unit)
        private lateinit var removedListener: ((MenuItem, Int) -> Unit)

        private const val ITEM_HEADER = 0
        private const val ITEM_MENU = 1
    }

    fun setAddedItemListener(added: (MenuItem, Int) -> Unit) {
        addedListener = added
    }

    fun setRemoveItemListener(remove: (MenuItem, Int) -> Unit) {
        removedListener = remove
    }

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == ITEM_HEADER) {
            MenuHeaderHolder(parent.inflate(R.layout.item_header))
        } else {
            MenuItemHolder(parent.inflate(R.layout.item_menu))
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (data[position] is String) {
            ITEM_HEADER
        } else {
            ITEM_MENU
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == ITEM_HEADER) {
            val headerHolder = holder as MenuHeaderHolder
            headerHolder.itemHeader.text = data[position] as String
        } else {
            val menuItem = data[position] as MenuItem

            val itemHolder = holder as MenuItemHolder
            itemHolder.itemCount.text = menuItem.count.toString()
            itemHolder.itemName.text = menuItem.name
            itemHolder.itemPrice.text = "Rp. ${menuItem.price}"
            itemHolder.btnAdd.setOnClickListener {
                addedListener(menuItem, position)
            }
            itemHolder.btnRemove.setOnClickListener {
                removedListener(menuItem, position)
            }

            if (menuItem.count == 0) {
                itemHolder.btnRemove.visibility = View.GONE
                itemHolder.itemCount.visibility = View.GONE
            } else {
                itemHolder.btnRemove.visibility = View.VISIBLE
                itemHolder.itemCount.visibility = View.VISIBLE
            }
        }
    }
}