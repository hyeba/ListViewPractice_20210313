package com.neppplus.listviewpractice_20210313.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20210313.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {


    // xml > 코틀린 변수로 꺼내오도록 도와주는 클래스. (LayoutInflater)
    val inflater = LayoutInflater.from(mContext)






}