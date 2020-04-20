package com.nexon.fragmentmore.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nexon.fragmentmore.R
import com.nexon.fragmentmore.datas.App
import com.nexon.fragmentmore.datas.Post

class PostAdapter (context: Context, resID : Int, list: ArrayList<Post>) : ArrayAdapter<Post>(context, resID, list) {
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let{ 
            // null이 아닐때
        }.let {
            // null일때
            tempRow = inf.inflate(R.layout.post_list_item, null)
        }

//    위에서 이미 null 체크가 끝났으므로 내가 가져올 리스트 아이템은 !!를 사용해 강제 언랩핑해서 사용 준비
        val row = tempRow!!
//     findViewById를 할때는 찾을 객체의 속성을 <> 안에 정확히 입력해야 객체를 가져올 수 있음
        val companyNameText = row.findViewById<TextView>(R.id.companyNameText)
        val userNameText = row.findViewById<TextView>(R.id.userNameText)
        val amountText = row.findViewById<TextView>(R.id.amountText)

        val postData = mList.get(position)
        companyNameText.text = postData.companyNmae
        userNameText.text = postData.userName
        amountText.text = String.format("%,d주", postData.amount)

        return  row
    }


}

