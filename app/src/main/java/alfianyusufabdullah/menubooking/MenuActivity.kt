package alfianyusufabdullah.menubooking

import alfianyusufabdullah.menubooking.adapter.MenuAdapter
import alfianyusufabdullah.menubooking.data.Menu
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    private var menuData = mutableListOf<Any>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menuData = Menu.retrieveMenu()

        val menuAdapter = MenuAdapter(menuData)

        menuItem.hasFixedSize()
        menuItem.layoutManager = LinearLayoutManager(this)
        menuItem.adapter = menuAdapter
    }
}
