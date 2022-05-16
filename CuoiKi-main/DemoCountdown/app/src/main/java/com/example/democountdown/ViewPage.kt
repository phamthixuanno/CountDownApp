package com.example.democountdown

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.democountdown.fragment.Event_Event
import com.example.democountdown.fragment.New_Countdown


class ViewPage(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> New_Countdown<Any>()
            1 -> Event_Event()
            else -> New_Countdown<Any>()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}