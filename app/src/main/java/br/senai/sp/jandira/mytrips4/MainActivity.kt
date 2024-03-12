package br.senai.sp.jandira.mytrips4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips4.ui.theme.MyTrips4Theme
import br.senai.sp.jandira.mytrips4.ui.theme.Pink40
import br.senai.sp.jandira.mytrips4.ui.theme.Purple80
import br.senai.sp.jandira.mytrips4.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTrips4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        fundo()
                }
            }
        }
    }
}









@Composable
fun fundo(){
            Column(modifier = Modifier.padding(25.dp)) {


                Spacer(modifier = Modifier.height(210.dp) )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)



                )
                {
                    Text(text = "Login",
                        color = Color(0xFFCF06F0),
                        fontSize =  58.sp,
                        fontWeight = FontWeight.Bold

                        )
                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                {

                OutlinedTextField(value = "Digite seu email", onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    shape = RoundedCornerShape(16.dp)
                
                )

                }






            }

    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview(){
    MyTrips4Theme{
        fundo()
    }
}
