package yunjae.com.usim

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import android.telephony.TelephonyManager
import android.util.Log




class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 클릭 리스너 설정
        btnSearch.setOnClickListener {

            val telemamanger = getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
            val number = telemamanger.getSimSerialNumber()
            val imei = telemamanger.getImei()
            val lineNumber = telemamanger.getLine1Number()

            //val meid = tm.getMeid()

            Log.i("number {}", number)
            Log.i("imei {}", imei)
            Log.i("lineNumber {}", lineNumber)

            txt_usim_number.text = "USIM : ${number}"
            txt_imei.text = "IMEI : ${imei}"
            txt_line_number.text = "MEID ${lineNumber}"
        }

    }
}
