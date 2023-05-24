package tj.behruz.tajikanalphabet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import tj.behruz.tajikanalphabet.ui.theme.TajikanAlphabetTheme
import tj.behruz.tajikanalphabet.ui.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TajikanAlphabetTheme {
                // A surface container using the 'background' color from the theme
               AppNavigation()
            }
        }
    }
}
