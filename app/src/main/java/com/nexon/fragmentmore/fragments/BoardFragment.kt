package com.nexon.fragmentmore.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.Fragment
import com.nexon.fragmentmore.R
import com.nexon.fragmentmore.adapters.PostAdapter
import com.nexon.fragmentmore.datas.Post
import kotlinx.android.synthetic.main.fragment_board.*

class BoardFragment : BaseFragment() {
    var mPostAdapter : PostAdapter? = null
    var mPostList = ArrayList<Post>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mPostList.add(Post("삼성전자", 100, "한영신"))
        mPostList.add(Post("네이버", 500, "이정재"))
        mPostList.add(Post("NCSOFT", 2500, "엘론 머스크"))
        mPostList.add(Post("LG전자", 10, "김홀동"))
        mPostList.add(Post("데브캣", 90, "홍길동"))
        mPostList.add(Post("선데이토즈", 145, "이미란"))
        mPostList.add(Post("애플", 3789, "김보성"))
        mPostList.add(Post("마이크로소프트", 789, "손전쟁"))
        mPostList.add(Post("SPC", 77, "신기루"))
        mPostAdapter = PostAdapter(mContext!!, R.layout.post_list_item, mPostList)
        boardListView.adapter = mPostAdapter
    }

}