package com.nexon.fragmentmore.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nexon.fragmentmore.R
import com.nexon.fragmentmore.adapters.AppAdapter
import com.nexon.fragmentmore.datas.App
import kotlinx.android.synthetic.main.fragment_game_list.*

class GameListFragment : Fragment() {
    var mGameAdapter : AppAdapter? = null
    val mGameList = ArrayList<App>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_game_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mGameList.add(App("아스팔트 8 : 에어본", "GameLoft", 5))
        mGameList.add(App("MineCraft", "Mojang", 4))
        mGameList.add(App("아스팔트 7 : 히트", "GameLoft", 4))
        mGameList.add(App("팔라독 (Paladog)", "FazeCat", 2))
        mGameList.add(App("Plants vs. Zombies", "EA Games", 3))
        mGameList.add(App("스왐피 (Swampy)", "Disney", 5))
        mGameList.add(App("리니지2M", "NCSOFT", 3))
        mGameList.add(App("리니지M", "NCSOFT", 4))
        mGameList.add(App("AFK아레나", "Lilith Games", 1))

        mGameAdapter = AppAdapter( context!! , R.layout.app_list_item, mGameList)
        gameListView.adapter = mGameAdapter
    }
}