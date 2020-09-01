package me.tap.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class Preferences(context: Context) {


    companion object {
        private const val PREFERENCE_NAME = "SharedPreferenceExample"
        private const val PREFERENCE_LOGIN_COUNT = "LoginCount"
    }

    private val preferences: SharedPreferences =
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun getLoginCount(): Int {
        return preferences.getInt(PREFERENCE_LOGIN_COUNT, 0)
    }

    fun setLoginCount(count: Int) {
        val editor = preferences.edit()
        editor.putInt(PREFERENCE_LOGIN_COUNT, count)
        editor.apply()
    }
}