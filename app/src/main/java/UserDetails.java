import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserDetails {

    private static FirebaseAuth mAuthInstance = FirebaseAuth.getInstance();
    private static FirebaseUser mUser = mAuthInstance.getCurrentUser();
    private static String mCurrentUser = mUser.getDisplayName();
    private static String mCurrentEmail = mUser.getEmail();


    public static String getUserName() {
        return mCurrentUser;
    }

    public static String getUserEmail() {
        return mCurrentEmail;
    }
}
