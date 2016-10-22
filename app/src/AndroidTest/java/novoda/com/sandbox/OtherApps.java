package novoda.com.sandbox;

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
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by surya on 22/10/2016.
 */
public class OtherApps {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
    MainActivity activity = activityRule.getActivity();


    @Test
    public void OtherAppsTest()
    {
        try {

            onView(withId(R.id.text)).perform(click(), ViewActions.pressKey(KeyEvent.KEYCODE_BACK));
        } catch (AssertionFailedError e) {
            Spoon.screenshot(activity, "apps page");
        } catch (NoMatchingViewException nvex) {
            Spoon.screenshot(activity, "apps page");

        }



    }

    // onView(withId(R.id.text)).perform(click(), ViewActions.pressKey(KeyEvent.KEYCODE_BACK));



}
