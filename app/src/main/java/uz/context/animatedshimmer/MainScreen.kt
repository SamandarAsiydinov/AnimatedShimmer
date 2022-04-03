package uz.context.animatedshimmer

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Image(
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape),
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Circular Image"
    )
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}