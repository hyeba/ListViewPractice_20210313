package com.neppplus.listviewpractice_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20210313.datas.Student

class MainActivity : AppCompatActivity() {

//    학생 목록을 담아둘 ArrayList 변수 추가
    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 목록을 실제로 추가
        mStudentList.add(Student("조경진", birthYear = 1988))
        mStudentList.add(Student("홍준호", birthYear = 1995))
        mStudentList.add(Student("김민철", birthYear = 1990))
        mStudentList.add(Student("김종진", birthYear = 1991))
        mStudentList.add(Student("장혜진", birthYear = 1993))


    }
}