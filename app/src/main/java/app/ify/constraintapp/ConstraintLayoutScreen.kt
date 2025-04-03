package app.ify.constraintapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ConstraintLayoutScreen() {
    ConstraintLayout() {
        // 1- Define the references for the Constrains
        // createRefs(): generates unique references
        // for the composables, which are then used
        // with 'constrainAs' modifier to specify the constraints

        val (box1, box2, text) = createRefs()

        // 2- Constrain the First Box
        Box(modifier = Modifier.size(100.dp)
        )
    }
}

