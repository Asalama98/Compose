package com.example.learningcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningcompose.ui.theme.LearningComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxWidth(.5f)
                .padding(15.dp)) {

                var title="Kermit playing in the Snow "
                var imageDescription="Kermit playing in the Snow "
                var painter= painterResource(id = R.drawable.kermit)

                ImageCard(painter = painter, imageDesscriptionL = imageDescription, title =title)

            }




    }
}
}

@Composable
fun ImageCard(
    painter:Painter,
    imageDesscriptionL:String,
    title:String,
    modifier:Modifier=Modifier
){

    Card(

        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp)


    ) {
        Box(modifier =  Modifier.height(200.dp)) {

            Image(painter = painter, contentDescription =imageDesscriptionL, contentScale = ContentScale.Crop )


            Box(modifier = Modifier.fillMaxSize()
                .background(brush = Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        Color.Black
                    ),
                    startY = 300f


                ))
            )

            Box(modifier= Modifier
                .fillMaxSize()
                .padding(16.dp), contentAlignment = Alignment.BottomStart)
            {

                Text(text = title, style = TextStyle(Color.White, fontSize = 16.sp))

            }

        }





    }


}