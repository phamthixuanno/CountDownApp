package com.example.countdown
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.countdown.fragment.ViewPager
import com.example.countdown.transform.ZoomOutPageTransformer
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity() {
    lateinit var mViewPager2: ViewPager2
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewPager2 = findViewById(R.id.pager_view)
        bottomNavigationView = findViewById(R.id.bottom)
        val myViewAdapter = ViewPager(this)
        mViewPager2.setPageTransformer(ZoomOutPageTransformer())
        mViewPager2.setAdapter(myViewAdapter)
        bottomNavigationView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            val id = item.itemId
            if (id == R.id.new_menu) {
                mViewPager2.setCurrentItem(0)
            } else if (id == R.id.list_item) {
                mViewPager2.setCurrentItem(1)
            }
            true
        })
        mViewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> bottomNavigationView.getMenu().findItem(R.id.new_menu).isChecked =
                        true
                    1 -> bottomNavigationView.getMenu().findItem(R.id.list_item).isChecked = true
                }
            }
        })
    }
}