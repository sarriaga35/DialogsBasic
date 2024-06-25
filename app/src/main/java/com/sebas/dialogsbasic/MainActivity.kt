package com.sebas.dialogsbasic

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sebas.dialogsbasic.ui.theme.DialogsBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           //Calling the composable function
            //to display element and its contents
            MainContent()
        }
    }


}
//creating composable function to dispaly Top Bar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MainContent() {
   Scaffold(
       topBar ={TopAppBar(
           title = {Text(
               text = "GFG | Change button Size",
               color = Color.White)},
           colors = topAppBarColors(containerColor = Color(0xff0f9d58))
       )},
       content = { MyContent()}
   )

   }



//creating a composable function to create 3 buttons an add functionality to them.
//Calling this function as content in the above funtion
@Composable
fun MyContent() {
    //Declaring a value to store the counter value
    //Initially this value is set to 0
    val mCounter = remember { mutableStateOf(0) }

    //Creating a column
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Displaying the mCounter value as Text
        Text(
            modifier = Modifier.padding(top = 100.dp),
            text = mCounter.value.toString(),
           fontSize = 50.sp)


        //Adding a space of 50dp
        Spacer(modifier = Modifier.height(50.dp))
        //Calling TraerButton function to create the button, on click will increment the value of mCounter by 5
        TraerButton(text = "Add 5") {
            mCounter.value += 5
        }
        //Adding a space of 50dp
        Spacer(modifier = Modifier.height(50.dp))
        //Calling TraerButton function to create the button, on click will increment the value of mCounter by 5
        TraerButton(text = "Add 10") {
            mCounter.value += 10
        }
        //Adding a space of 50dp
        Spacer(modifier = Modifier.height(50.dp))
        //Calling TraerButton function to create the button, on click will increment the value of mCounter by 5
        TraerButton(text = "Substract 5") {
            mCounter.value -= 5
        }
    }
}

@Composable
fun TraerButton(text: String, onClick: () -> Unit) {
   Button(
       onClick = onClick,
      colors = ButtonDefaults.buttonColors(containerColor = Color(0xff0f9d58))
   ) { Text(text = text, color = Color.White) }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()

}