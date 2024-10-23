package com.mlsa_uet_nc.repeatalarm.presentation.ui.alarm_quick

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.commandiron.wheel_picker_compose.WheelTimePicker
import java.time.LocalTime

@Composable
fun QuickScreen() {
    // State to keep track of hours and minutes
    var hours by remember { mutableStateOf(0) }
    var minutes by remember { mutableStateOf(0) }

    // Create time from hours and minutes, starting at 0:0
    val time by remember(hours, minutes) {
        mutableStateOf(LocalTime.of(hours, minutes))
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Set Quick Alarm",
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 32.dp)
            )

            WheelTimePicker(
                modifier = Modifier.padding(bottom = 32.dp),
                startTime = time,
                onSnappedTime = { newTime ->
                    hours = newTime.hour
                    minutes = newTime.minute
                }
            )

            ElevatedButton(
                onClick = {
                    // TODO: Handle timer start
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Start Timer",
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuickScreenPreview() {
    MaterialTheme {
        QuickScreen()
    }
}