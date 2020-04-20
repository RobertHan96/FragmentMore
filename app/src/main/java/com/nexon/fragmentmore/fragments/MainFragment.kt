package com.nexon.fragmentmore.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nexon.fragmentmore.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
//    XML파일과 프래그먼트 클래스를 연결하는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_main, container, false )
    }

//    일반 액티비티의 onCreate에 대응되는 함수(프래그먼트 로딩이 끝난 이후에 구현할 내용을 입력)
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        okBtn.setOnClickListener {
            contentText.text = messageEdt.text.toString()
        }
    }
}