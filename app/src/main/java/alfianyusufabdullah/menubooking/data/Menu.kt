package alfianyusufabdullah.menubooking.data

import alfianyusufabdullah.menubooking.R
import alfianyusufabdullah.menubooking.entity.MenuItem

object Menu {

    fun retrieveMenu(): MutableList<Any> {
        val data = mutableListOf<Any>()
        data.add("Makanan")
        data.add(MenuItem("Nasi Goreng 1", 20000, 0, R.drawable.breakfast))
        data.add(MenuItem("Nasi Goreng 2", 30000, 0, R.drawable.breakfast))
        data.add(MenuItem("Nasi Goreng 3", 40000, 0, R.drawable.breakfast))
        data.add(MenuItem("Nasi Goreng 4", 15000, 0, R.drawable.breakfast))
        data.add(MenuItem("Nasi Goreng 5", 100000, 0, R.drawable.breakfast))
        data.add(MenuItem("Nasi Goreng 6", 12000, 0, R.drawable.breakfast))
        data.add("Minuman")
        data.add(MenuItem("Es Jeruk 1", 6000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 7000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 4000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 5000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 7000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 8000, 0, R.drawable.breakfast))
        data.add(MenuItem("Es Jeruk 1", 9000, 0, R.drawable.breakfast))
        return data
    }
}