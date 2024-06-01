package com.aviva.bottom_compose.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreens(
    val route: String,
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
) {
    object Home : BottomNavScreens("home", "Home", Icons.Filled.Home, Icons.Outlined.Home, false, null)
    object Chat : BottomNavScreens("chat", "Chat", Icons.Filled.Email, Icons.Outlined.Email, false, 99)
    object Settings : BottomNavScreens("settings", "Settings", Icons.Filled.Settings, Icons.Outlined.Settings, true, null)
}