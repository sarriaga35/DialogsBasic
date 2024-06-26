package com.sebas.dialogsbasic

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
 internal fun PermisionDialogo() {

    val context = LocalContext.current
    Log.i("hola","AlertDialogo")
    AlertDialog(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
            text = stringResource(R.string.permision),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()

        )
        },
        text = {
            Text(
            text = stringResource(R.string.txt_dialog_permission),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .fillMaxWidth()

        )
        },
        onDismissRequest = {
            Log.i("hola", "OnDimissRequest")
            HacerAlgoonDimissRequest(context) },
        confirmButton = {
            TextButton(
                onClick = { hacerAlgoonConfirmation(context) },
                elevation = ButtonDefaults.elevatedButtonElevation(2.dp)){
                Text(text = stringResource(R.string.confirmation),
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.labelSmall
                )
            }
        },
        dismissButton = {
            TextButton(
                onClick = { HacerAlgoonDimissRequest(context)},
                elevation = ButtonDefaults.elevatedButtonElevation(2.dp) ) {
                Text(text = stringResource(R.string.dimiss),
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    )
}

    private fun HacerAlgoonDimissRequest(context: Context) {

        Log.i("hola", "Dimiss")
        Toast.makeText( context,"hola Dimiss", Toast.LENGTH_SHORT).show()
    }



    private fun hacerAlgoonConfirmation(context: Context) {

        Log.i("hola", "Confirmation")
        Toast.makeText(context, "hola confirmation", Toast.LENGTH_SHORT).show()
    }


