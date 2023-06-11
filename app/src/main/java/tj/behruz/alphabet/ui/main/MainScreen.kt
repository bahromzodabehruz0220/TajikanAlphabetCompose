package tj.behruz.alphabet.ui.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import tj.behruz.alphabet.R
import tj.behruz.alphabet.data.source.letters
import tj.behruz.alphabet.ui.alphabet.AlphabetItem
import tj.behruz.alphabet.ui.navigation.Screens

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
            columns = GridCells.Adaptive(minSize = 180.dp)
        ) {
            items(letters) { currentLetter ->
                AlphabetItem(currentLetter) {
                    navController.navigate(route = "detailScreen/" + currentLetter.id)
                }
            }

        }
    }
}