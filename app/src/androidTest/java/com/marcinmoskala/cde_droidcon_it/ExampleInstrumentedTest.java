package com.marcinmoskala.cde_droidcon_it;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class ExampleInstrumentedTest {

    @Rule public ActivityTestRule<MainActivity> rule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.someId)).check(ViewAssertions.matches(ViewMatchers.withText("Hello to myself :)")));
    }
}
