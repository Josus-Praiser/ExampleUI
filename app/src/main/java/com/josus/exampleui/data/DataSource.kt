package com.josus.exampleui.data

import com.josus.exampleui.R
import com.josus.exampleui.model.FirstList
import com.josus.exampleui.model.SecondList

class DataSource {

    fun loadFirstList(): List<FirstList> {
        return listOf(
            FirstList(R.drawable.ic_seacrh, R.drawable.button_bg , R.string.title_1, R.string.sub_title),
            FirstList(R.drawable.ic_seacrh, R.drawable.button_bg, R.string.title_1, R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.button_bg,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.button_bg,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.color.black,R.string.title_1,R.string.sub_title)
            )
    }

    fun loadSecondList():List<SecondList>{
        return listOf(
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title),
            SecondList(R.string.secondList_title)
        )
    }
}