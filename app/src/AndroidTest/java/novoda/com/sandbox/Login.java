package novoda.com.sandbox;

import android.os.SystemClock;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.rule.ActivityTestRule;

import com.squareup.spoon.Spoon;

import junit.framework.AssertionFailedError;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by surya on 22/10/2016.
 */
public class Login {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
    MainActivity activity = activityRule.getActivity();

    @Test
    public void LoginTest(){


        try {
            onView(withId(R.id.main_activity_sign_in_button)).perform(click());

        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        // onView(withId(R.id.main_activity_sign_in_button)).perform(click());
        SystemClock.sleep(5000);


        try {
            onView(withId(R.id.sign_in_activity_username_field)).perform(typeText("surya"));

        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        // onView(withId(R.id.sign_in_activity_username_field)).perform(typeText("surya"));
        SystemClock.sleep(2000);


        try {

            onView(withId(R.id.sign_in_activity_password_field)).perform(typeText("Password"));

        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        // onView(withId(R.id.sign_in_activity_password_field)).perform(typeText("Password"));
        SystemClock.sleep(2000);




        try {

            onView(withId(R.id.sign_in_activity_submit_button)).perform(click());
        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        //onView(withId(R.id.sign_in_activity_submit_button)).perform(click());
        SystemClock.sleep(2000);
    }



}
