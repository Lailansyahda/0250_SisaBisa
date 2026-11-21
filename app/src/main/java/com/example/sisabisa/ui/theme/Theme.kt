
package com.example.sisabisa.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.sisabisa.R

@Composable
fun SisaBisaTheme(
    content: @Composable () -> Unit
) {
    val SisaBisaColorScheme = lightColorScheme(
        primary = colorResource(R.color.green_primary),
        onPrimary = colorResource(R.color.text_white),

        secondary = colorResource(R.color.green_dark),
        onSecondary = colorResource(R.color.text_white),

        tertiary = colorResource(R.color.orange_secondary),
        onTertiary = colorResource(R.color.text_primary),

        background = colorResource(R.color.background_color),
        onBackground = colorResource(R.color.text_primary),

        surface = colorResource(R.color.surface_color),
        onSurface = colorResource(R.color.text_primary),

        error = colorResource(R.color.stock_expired),
        onError = colorResource(R.color.text_white)
    )

    MaterialTheme(
        colorScheme = SisaBisaColorScheme,
        typography = SisaBisaTypography,
        content = content
    )
}
