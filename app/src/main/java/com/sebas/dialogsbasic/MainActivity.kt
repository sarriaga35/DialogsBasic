package com.sebas.dialogsbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.sebas.dialogsbasic.ui.theme.DialogsBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DialogsBasicTheme {
               inicialComponible()
            }
        }
    }

    @Composable
    private fun inicialComponible() {
        MinimalDialog(hacerAlgo())

    }

    private fun hacerAlgo(): () -> Unit {
        return {
            println("hola")
        }

    }

    @Composable
    private fun MinimalDialog(onDimissRequest: () -> Unit) {

        Dialog(onDismissRequest = { onDimissRequest() }) {
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),
                    shape = RoundedCornerShape(16.dp)
            ) {
                Text(text = "This is a minimal Dialog",
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center),
                    textAlign = TextAlign.Center,)

            }

        }

    }
}

