package com.sebas.dialogsbasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
        DialogWithImage(
            onDimissRequest = { hacerAlgoonDimissRequest() },
            onConfirmation = { hacerAlgoonConfirmation()},
        )

    }

    private fun hacerAlgoonDimissRequest(): () -> Unit {
        return {
            println("hola Dimiss")
        }

    }
    private fun hacerAlgoonConfirmation(): () -> Unit {
        return {
            println("hola Confirmation")
        }

    }

    @Composable
    private fun DialogWithImage(
        onDimissRequest: () -> Unit,
        onConfirmation: () -> Unit,
        ) {

        Dialog(onDismissRequest = { onDimissRequest() }) {
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),
                    shape = RoundedCornerShape(16.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                        Text(text = "Hola",modifier = Modifier.padding(8.dp))
                    Divider()
                        Row (modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,){
                            TextButton(onClick = { onDimissRequest() },
                                        modifier = Modifier.padding(16.dp),){
                                Text(text = "Dimiss")
                            }
                            TextButton(onClick = { onConfirmation() },
                                modifier = Modifier.padding(16.dp),) {
                                Text(text = "Confirm")
                            }

                        }
                        }
                }




            }

        }

    }


