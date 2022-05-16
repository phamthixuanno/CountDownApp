package com.example.mcountdowntimer.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mcountdowntimer.Fragment.EventFragment
import com.example.mcountdowntimer.Fragment.NewFragment


class ViewPager(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NewFragment()
            1 -> EventFragment()
            else -> NewFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}
