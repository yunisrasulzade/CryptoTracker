package com.guavapay.cryptotracker.presentation.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

fun Fragment.safeNavigate(
    directions: NavDirections) = try {
    val navController = findNavController()
        navController.navigate(directions)
} catch (e: Exception) {
    e.printStackTrace()
}

fun Context.openAppSystemSettings() {
    startActivity(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    })
}