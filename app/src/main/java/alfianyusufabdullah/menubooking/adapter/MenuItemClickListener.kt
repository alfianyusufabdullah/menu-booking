package alfianyusufabdullah.menubooking.adapter

import alfianyusufabdullah.menubooking.entity.MenuItem

interface MenuItemClickListener {
    fun onAdd(item: MenuItem)
    fun onDelete(item: MenuItem)
}