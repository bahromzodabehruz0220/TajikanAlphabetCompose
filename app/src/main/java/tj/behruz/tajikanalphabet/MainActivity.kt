package tj.behruz.tajikanalphabet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import tj.behruz.tajikanalphabet.ui.theme.lightColors
import tj.behruz.tajikanalphabet.ui.navigation.AppNavigation
import tj.behruz.tajikanalphabet.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme(colors = lightColors()) {

                // A surface container using the 'background' color from the theme
                AppNavigation()
            }
        }
    }
}
