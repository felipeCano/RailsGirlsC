package com.girls.rails.railsgirlsc

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_days_agended.*

class DaysAgendedActivity : FragmentActivity() {
    private lateinit var mDaysAgendedAdapter: DaysAgendedAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_days_agended)

        mDaysAgendedAdapter = DaysAgendedAdapter(supportFragmentManager)
        pager.adapter = mDaysAgendedAdapter
        tabLayout.setupWithViewPager(pager)
    }
}