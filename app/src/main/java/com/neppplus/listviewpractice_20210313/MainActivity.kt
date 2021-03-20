package com.neppplus.listviewpractice_20210313

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        mStudentList.add(Student("조경진", birthYear = 1988, address = "서울시 은평구"))
        mStudentList.add(Student("홍준호", birthYear = 1995, address = "서울시 중구"))
        mStudentList.add(Student("김민철", birthYear = 1990, address = "서울시 서대문구"))
        mStudentList.add(Student("김종진", birthYear = 1991, address = "서울시 용산구"))
        mStudentList.add(Student("장혜진", birthYear = 1993, address = "서울시 강동구"))

//        미뤄뒀던 mAdapter의 대입 진행
        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

//        완성된 어댑터 변수를 리스트뷰와 연결
        studentListView.adapter = mAdapter

//        학생리스트뷰 클릭 이벤트 구현

        studentListView.setOnItemClickListener { parent, view, position, id ->

//           position: 몇번 줄이 눌렸는지 알려주는 역할
//            클릭된 학생 이름 토스트로 출력
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, clickedStudent.name, Toast.LENGTH_SHORT).show()

        }

//       리스트뷰 아이템 길게 눌렀을 때 별도 처리.

        studentListView.setOnItemLongClickListener { parent, view, position, id ->

//            롱클릭된 학생 목록에서 삭제.

            mStudentList.removeAt(position)

//            어댑터가 이를 확인(새로고침) 하도록

            mAdapter.notifyDataSetChanged()

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 길게 눌림", Toast.LENGTH_SHORT).show()



            return@setOnItemLongClickListener true



        }


    }
}