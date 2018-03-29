# USIM Number Search

## 1. kotlin Languge  

## 2. User Phone Setting 
      설정 -> 애플리케이션 관리자 -> 해당앱 -> 애플리케이션 정보 -> 권한 (전화)
      
## 3. get a information
      USIM Number
      IMEI Number
      Phone Number
      

## 3. source content
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
