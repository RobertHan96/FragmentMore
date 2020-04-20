package com.nexon.fragmentmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.nexon.fragmentmore.adapters.FragPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import androidx.fragment.app.FragmentManager as FragmentManager1

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
//      프래그먼트 안으로 접근해서 해당 부분 코드 제어하기
        hideTextBtn.setOnClickListener {

        }

    }

    override fun setValues() {
        myViewPager.adapter = FragPagerAdapter(supportFragmentManager)
        myTabLayout.setupWithViewPager(myViewPager)
    }

}
