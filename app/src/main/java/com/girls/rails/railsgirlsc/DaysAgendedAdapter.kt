package com.girls.rails.railsgirlsc

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
private const val ARG_OBJECT = "object"

class DaysAgendedAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getCount(): Int  = 2

    override fun getItem(position: Int): Fragment {
       return when(position){
            0 ->  DaysAgendedTabDayOne()
            1 ->  DaysAgendedTabDayTwo()
           else ->
               return DaysAgendedTabDayOne()
        }

    }

    override fun getPageTitle(position: Int): CharSequence {
        return ARG_OBJECT + (position + 1)
    }




}
