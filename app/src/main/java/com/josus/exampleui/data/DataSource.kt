package com.josus.exampleui.data

import com.josus.exampleui.R
import com.josus.exampleui.model.FirstList
import com.josus.exampleui.model.SecondList

class DataSource {

    fun loadFirstList(): List<FirstList> {
        return listOf(
            FirstList(R.drawable.star_icon, R.drawable.btn_bg_1, R.string.title_1, R.string.sub_title),
            FirstList(R.drawable.qrcode_icon, R.drawable.btn_bg_2, R.string.title_2, R.string.sub_title),
            FirstList(R.drawable.new_compliance,R.drawable.btn_bg_3,R.string.title_3,R.string.sub_title),
            FirstList(R.drawable.invoice_icon,R.drawable.btn_bg_4,R.string.title_4,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_1,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh, R.drawable.btn_bg_2,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_3,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_4,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_2,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_4,R.string.title_1,R.string.sub_title),
            FirstList(R.drawable.ic_seacrh,R.drawable.btn_bg_1,R.string.title_1,R.string.sub_title)
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