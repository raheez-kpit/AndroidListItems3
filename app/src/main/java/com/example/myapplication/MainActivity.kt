package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.list_tiles.ListTiles
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                }
                Greeting("Android mobility")

            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var name by remember {
        mutableStateOf("")
    }
    var names by remember {
//        mutableListOf<String>()
        mutableStateOf(mutableListOf<String>())
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {


        Row(
            modifier =
            Modifier.fillMaxWidth(),
        ) {
            OutlinedTextField(
                value = name, onValueChange = { text ->
                    name = text

                },
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Button(onClick =
            {
                if (name.isNotEmpty()) {
                    names = (names + name).toMutableList()
                    name = ""
                }
            }
            ) {
                Text(text = "add")
            }
        }

        var list = mutableListOf<String>()
        list.add("ryan")
        list.add("ryan")
        list.add("ryan")
        list.add("cooper")
        list.add("ryan")
        list.add("beast")
        ListTiles(names)

    }


//    Column(
//
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//
//    ) {
//        Text(text = count.toString(),
//            fontSize = 25.sp)
//        Button(onClick = {
//            count++
//        }) {
//            Text(text = "add")
//        }
//
//    }


//    LazyRow() {
//        items(10) {
//            Icon(
//                painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription = null,
//                modifier = Modifier.size(200.dp)
//            )
//        }
//    }


//    if (name.length > 5) {
//
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            for (i in 1..5) {
//
//                Icon(
//                    imageVector = Icons.Default.AccountBox,
//                    contentDescription = null,
//                    modifier = Modifier.background(Color.Yellow),
//                )
//            }
//        }
//
//
//    } else {
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            modifier = Modifier.background(Color.Black)
//        )
//
//    }
//    Row(
//        modifier = Modifier
//            .background(Color.Yellow)
//            .size(150.dp),
//        verticalAlignment = Alignment.Top,
//        horizontalArrangement = Arrangement.End
//
//    ) {
//
//        Text(
//            text = "Hello $name!",
//            //            modifier = modifier,
//            modifier = Modifier
//                .background(Color.Blue)
//                .padding(10.dp)
//                .background(Color.Gray)
//                .padding(5.dp)
//                .background(
//                    Color.Magenta
//                ),
//            color = Color.Green,
//            fontSize = 30.sp
//        )
//        Text(
//            text = "Hello $name!",
//            //            modifier = modifier,
//            modifier = Modifier
//                .background(Color.Blue),
//            color = Color.Green,
//            fontSize = 30.sp
//        )
//    }
}
//
//@Composable
//fun nameList(names: List<String>) {
//    LazyColumn() {
//
//        items(names) { a ->
//            Text(text = a, fontSize = 20.sp, modifier = Modifier.padding(16.dp))
//            Divider()
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android raheez")
    }
}