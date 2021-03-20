package com.neppplus.listviewpractice_20210313.datas

import java.util.*

class Student (
    val name: String,
    val birthYear : Int,
    val address : String) {

//    학생 클래스가 수행할 수 있는 기능 - 함수 추가

//    나의 현재 나이를 계산해서 결과로 주는 함수

    fun getKoreanAge() : Int{
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val koreanAge = currentYear - this.birthYear + 1

        return koreanAge

    }

    fun addTwoNumbers(num1 : Int, num2 : Int) : Int{

        val result = num1 + num2

        return result


    }

}