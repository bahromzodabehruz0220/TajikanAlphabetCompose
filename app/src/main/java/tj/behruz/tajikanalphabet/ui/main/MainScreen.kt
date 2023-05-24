package tj.behruz.tajikanalphabet.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import tj.behruz.tajikanalphabet.R
import tj.behruz.tajikanalphabet.ui.alphabet.AlphabetItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    Box(

        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.welcome_background),
                contentScale = ContentScale.FillBounds
            ),
        contentAlignment = Alignment.Center,

        ) {

        LazyVerticalGrid(
            contentPadding = PaddingValues(8.dp),
            columns = GridCells.Adaptive(minSize = 140.dp)
        ) {
            items(35) { photo ->
                AlphabetItem()
            }
        }

    }
}