package example.jf.testoffragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationMenu: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bottom_navigation_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.left_fragment -> {
                    fragment = LeftFragment()
                }
                R.id.main_fragment -> {
                    fragment = MainFragment()
                }
                R.id.right_fragment -> {
                    fragment = RightFragment()
                }
            }
            replaceFragment(fragment!!)

            true
        }
        bottomNavigationMenu.selectedItemId = R.id.main_fragment
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .addToBackStack(fragment.tag)
            .commit()
    }

}