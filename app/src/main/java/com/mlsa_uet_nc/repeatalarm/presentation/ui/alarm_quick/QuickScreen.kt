package com.mlsa_uet_nc.repeatalarm.presentation.ui.alarm_quick

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mlsa_uet_nc.repeatalarm.R

@Composable
fun QuickScreen() {
    Box(modifier = Modifier.fillMaxSize()
        .background(colorResource(id = R.color.purple_700)),
        contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center, // Align items vertically in the center
            horizontalAlignment = Alignment.CenterHorizontally // Center items horizontally
        ) {
            ElevatedButton(onClick = {}) {
                Text("Start Timer")
            }
        }
    }
}

@Preview
@Composable
fun prev() {
    QuickScreen()
}
