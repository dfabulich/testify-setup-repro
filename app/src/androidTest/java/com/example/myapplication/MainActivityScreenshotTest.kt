package com.example.myapplication

import androidx.test.core.app.launchActivity
import dev.testify.annotation.ScreenshotInstrumentation
import dev.testify.scenario.ScreenshotScenarioRule
import org.junit.Rule
import org.junit.Test

/**
 * Screenshot test for MainActivity following Testify get-started docs.
 */
class MainActivityScreenshotTest {

    @get:Rule
    val rule = ScreenshotScenarioRule()

    @ScreenshotInstrumentation
    @Test
    fun default() {
        launchActivity<MainActivity>().use { scenario ->
            rule.withScenario(scenario).assertSame()
        }
    }
}
