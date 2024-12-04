package com.ryanbalseiro.nycschoolsapp.View

sealed class Screen(val route:String) {
    object SchoolScreen:Screen("schoolscreen")
    object DetailScreen:Screen("detailscreen")
}