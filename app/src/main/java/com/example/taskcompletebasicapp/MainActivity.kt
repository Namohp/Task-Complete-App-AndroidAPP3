package com.example.taskcompletebasicapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcompletebasicapp.ui.theme.TaskCompletebasicAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletebasicAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    taskImage(words = "Task Completed Successfully!", morewords = "Nice Work!",
                        modifier = Modifier )




                }
            }
        }
    }
}

@Composable
fun task( words: String, morewords: String,modifier: Modifier ) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center, modifier = Modifier
    ) {

        Text(
            text = words, fontWeight = FontWeight.Bold, modifier = Modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(text = morewords, fontSize = 16.sp, modifier = Modifier)


    }
}

@Composable
fun taskImage(words: String, morewords: String,modifier: Modifier)
{
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
    ) {
        Image(painter = image, contentDescription = null, modifier = Modifier )
        task(words = "Task Completed Successfully!", morewords ="Nice Work!" , modifier = Modifier )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TaskCompletebasicAppTheme {
        taskImage(words = "Task Completed Successfully!", morewords = "Nice Work!", modifier =Modifier )


    }
}