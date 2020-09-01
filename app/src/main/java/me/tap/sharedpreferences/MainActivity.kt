package me.tap.sharedpreferences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferences = Preferences(this)
        var loginCount = preferences.getLoginCount()
        loginCount++
        preferences.setLoginCount(loginCount)
        textCount.text = loginCount.toString()
    }
}