package com.example.appintro.dark

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment

class IntroActivity : AppIntro() {

    companion object {

        init {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        isWizardMode = true // Disallow skipping
        setIndicatorColor(
                selectedIndicatorColor = ContextCompat.getColor(this, R.color.intro_indicator_selected),
                unselectedIndicatorColor = ContextCompat.getColor(this, R.color.intro_indicator_unselected)
        )

        setBackArrowColor(ContextCompat.getColor(this, R.color.intro_arrows))
        setNextArrowColor(ContextCompat.getColor(this, R.color.intro_arrows))
        setColorDoneText(ContextCompat.getColor(this, R.color.intro_arrows))

        addSlide(AppIntroFragment.newInstance(
                title = getString(R.string.intro_slide_1_title),
                description = getString(R.string.intro_slide_1_description),
                imageDrawable = R.drawable.ic_android_120dp,
                titleColor = ContextCompat.getColor(this, R.color.intro_text),
                descriptionColor = ContextCompat.getColor(this, R.color.intro_text),
                backgroundColor = ContextCompat.getColor(this, R.color.intro_background),
        ))

        addSlide(AppIntroFragment.newInstance(
                title = getString(R.string.intro_slide_2_title),
                description = getString(R.string.intro_slide_2_description),
                imageDrawable = R.drawable.ic_android_120dp,
                titleColor = ContextCompat.getColor(this, R.color.intro_text),
                descriptionColor = ContextCompat.getColor(this, R.color.intro_text),
                backgroundColor = ContextCompat.getColor(this, R.color.intro_background),
        ))

        addSlide(AppIntroFragment.newInstance(
                title = getString(R.string.intro_slide_3_title),
                description = getString(R.string.intro_slide_3_description),
                imageDrawable = R.drawable.ic_android_120dp,
                titleColor = ContextCompat.getColor(this, R.color.intro_text),
                descriptionColor = ContextCompat.getColor(this, R.color.intro_text),
                backgroundColor = ContextCompat.getColor(this, R.color.intro_background),
        ))
    }
}