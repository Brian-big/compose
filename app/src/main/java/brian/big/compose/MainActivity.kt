package brian.big.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import brian.big.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MessageCard(msg = Message("brian", "Hello, i just started composing and it's really cool"))
                }
            }
        }
    }
}

@Composable
fun MessageCard(msg: Message){
    Row {
        Image(painter = painterResource(id = R.drawable.admin_ic), contentDescription = "contact profile picture")
        Column {
            Text(text = msg.author)
            Text(text = msg.body)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMessageCard(){
    MessageCard(msg =Message("colleague", "it's just amazing"))
}
data class Message(val author: String, val body: String){}