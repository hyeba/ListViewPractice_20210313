package com.neppplus.listviewpractice_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20210313.adapters.StudentAdapter
import com.neppplus.listviewpractice_20210313.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    학생 목록을 담아둘 ArrayList 변수 추가
    val mStudentList = ArrayList<Student>()

//    xml+데이터를 조합해서 뿌려주는 Adapter 변수 추가
//    변수는 미리 만들고 싶은데, 대입은 나중에 해야하는 상황.
    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 목록을 실제로 추가
        mStudentList.add(Student("조경진", birthYear = 1988))
        mStudentList.add(Student("홍준호", birthYear = 1995))
        mStudentList.add(Student("김민철", birthYear = 1990))
        mStudentList.add(Student("김종진", birthYear = 1991))
        mStudentList.add(Student("장혜진", birthYear = 1993))

//        미뤄뒀던 mAdapter의 대입 진행
        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        완성된 어댑터 변수를 리스트뷰와 연결
        studentListView.adapter = mAdapter


    }
}