package novoda.com.sandbox;

import android.os.SystemClock;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.view.KeyEvent;

import com.squareup.spoon.Spoon;

import junit.framework.AssertionFailedError;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by surya on 22/10/2016.
 */
public class SigninTestClass {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
    MainActivity activity = activityRule.getActivity();




    @Test
    public void Appsdisplay() {

        try {
            onView(withText("com.android.smoketest")).check(matches(isDisplayed())).perform(click());

        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        //onView(withText("com.android.smoketest")).perform(click());
        SystemClock.sleep(3000);




        try {
            onView(withId(R.id.details_activity_launch_application)).perform(click(), ViewActions.pressKey(KeyEvent.KEYCODE_BACK));

        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }

        // onView(withId(R.id.details_activity_launch_application)).perform(click(), ViewActions.pressKey(KeyEvent.KEYCODE_BACK));







    }


}
