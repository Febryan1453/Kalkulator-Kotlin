package com.febryan.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener {
//            validasi(edt_awal.text.toString(), edt_akhir.text.toString(), '+')

            val awal = edt_awal.text.toString().toInt()
            val akhir = edt_akhir.text.toString().toInt()
            
            val hasil = awal + akhir
            tv_hasil.text = hasil.toString()

        }

        btn_kurang.setOnClickListener {
            validasi(edt_awal.text.toString(), edt_akhir.text.toString(), '-')
//            val awal = edt_awal.text.toString().toInt()
//            val akhir = edt_akhir.text.toString().toInt()
//
//            val hasil = awal - akhir
//            tv_hasil.text = hasil.toString()
        }

        btn_bagi.setOnClickListener {
            validasi(edt_awal.text.toString(), edt_akhir.text.toString(), '/')
//            val awal = edt_awal.text.toString().toInt()
//            val akhir = edt_akhir.text.toString().toInt()
//
//            val hasil = awal / akhir
//            tv_hasil.text = hasil.toString()
        }

        btn_kali.setOnClickListener {
            validasi(edt_awal.text.toString(), edt_akhir.text.toString(), '*')
//            val awal = edt_awal.text.toString().toInt()
//            val akhir = edt_akhir.text.toString().toInt()
//
//            val hasil = awal * akhir
//            tv_hasil.text = hasil.toString()
        }

    }

    fun validasi(awal: String, akhir: String, operator: Char) {
        if (awal.isEmpty()){
            edt_awal.error = "Silahkan Diisi"
        }
        if (akhir.isEmpty()){
            edt_akhir.error = "Silahkan Diisi"
        }

        if (awal.isNotEmpty() && akhir.isNotEmpty()){
            kalkulasi(awal.toDouble(), akhir.toDouble(), operator)
        }
    }

    fun kalkulasi(awal: Double, akhir: Double, operator: Char){
        var hasil = 0.0
        when(operator){
            '+' -> hasil = awal + akhir
            '-' -> hasil = awal - akhir
            '*' -> hasil = awal * akhir
            '/' -> hasil = awal / akhir
            else -> hasil = 0.0
        }
        tv_hasil.text = hasil.toString();
    }
}