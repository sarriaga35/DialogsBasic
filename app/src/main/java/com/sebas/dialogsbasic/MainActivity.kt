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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.sebas.dialogsbasic.ui.theme.DialogsBasicTheme
import com.sebas.dialogsbasic.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DialogsBasicTheme {
               inicialComponible()
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun inicialComponible() {
        AlertDialog(
            modifier = Modifier.padding(16.dp),
            title = {Text(
                        text = stringResource(R.string.permision),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                        )},
            text = {Text(text = "Papachongo")},
            onDismissRequest = { hacerAlgoonDimissRequest() },
            confirmButton = {
                TextButton(onClick = { hacerAlgoonConfirmation() },
                    elevation = ButtonDefaults.elevatedButtonElevation(2.dp)){
                    Text(text = "Confirmation")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { hacerAlgoonDimissRequest() },
                    elevation = ButtonDefaults.elevatedButtonElevation(2.dp) ) {
                    Text(text = "Dimiss")

                }
            }
        )
    }
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




