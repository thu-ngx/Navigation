import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.MessagesList
import com.example.navigation.UserDetails

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "messageslist"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("messageslist") {
            MessagesListScreen(
                onNavigateToUserDetails = { navController.navigate("userdetails") },
                /*...*/
            )
        }
        composable("userdetails") { UserDetailsScreen(
            onNavigateToMessagesList = { navController.navigate("messageslist") },
            /*...*/) }
    }
}

@Composable
fun MessagesListScreen(
    onNavigateToUserDetails: () -> Unit
) {
    MessagesList(onNavigateToUserDetails)
}

@Composable
fun UserDetailsScreen(
    onNavigateToMessagesList: () -> Unit
) {
    UserDetails(onNavigateToMessagesList)
}