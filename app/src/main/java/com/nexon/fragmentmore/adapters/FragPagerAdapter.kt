package com.nexon.fragmentmore.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.nexon.fragmentmore.fragments.GameListFragment
import com.nexon.fragmentmore.fragments.MainFragment

class FragPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return  MainFragment()
        } else {
            return GameListFragment()
        }
    }

    override fun getCount(): Int {
        return  2
    }


}