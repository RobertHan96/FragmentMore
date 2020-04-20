package com.nexon.fragmentmore.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    var mContext: Context? = null
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mContext = activity
    }

    abstract fun setupEvents()
    abstract fun setValues()

}