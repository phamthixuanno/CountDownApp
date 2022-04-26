package com.example.countdown.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.countdown.Fragment.EventFragment
import com.example.countdown.Fragment.NewFragment


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
