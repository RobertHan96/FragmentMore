package com.nexon.fragmentmore.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.nexon.fragmentmore.fragments.BoardFragment
import com.nexon.fragmentmore.fragments.GameListFragment
import com.nexon.fragmentmore.fragments.MainFragment

class FragPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> MainFragment()
            1 -> GameListFragment()
            else -> BoardFragment()
        }
    }

    override fun getCount(): Int {
        return  3
    }


}