package com.bedirhan.chatapp.onboarding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bedirhan.chatapp.onboarding.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity() {

    lateinit var binding:ActivityOnboardingBinding

    private var step = 1

    private val onboardingImages = listOf(
        R.drawable.first,
        R.drawable.second,
        R.drawable.third,
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this@OnboardingActivity,R.layout.activity_onboarding)
        setUpNextOnboarding()


        binding.step1.apply {
            setBackgroundColor(getColor(com.bedirhan.chatapp.central.R.color.colorPrimary))
        }

        binding.buttonNext.setOnClickListener{
            step+=1
            setUpNextOnboarding()
        }


    }


    private fun setUpNextOnboarding() {
        when(step){
            1->{
                binding.onboardingText.text = getString(com.bedirhan.chatapp.central.R.string.onboarding_first_message)
                binding.onboardingImage.setImageResource(onboardingImages[step-1])
                binding.step1.apply {
                    setBackgroundColor(getColor(com.bedirhan.chatapp.central.R.color.colorPrimary))
                }
            }
            2->{
                binding.onboardingText.text = getString(com.bedirhan.chatapp.central.R.string.onboarding_second_message)
                binding.onboardingImage.setImageResource(onboardingImages[step-1])
                binding.step2.apply {
                    setBackgroundColor(getColor(com.bedirhan.chatapp.central.R.color.colorPrimary))
                }
            }
            3->{
                binding.onboardingText.text = getString(com.bedirhan.chatapp.central.R.string.onboarding_third_message)
                binding.onboardingImage.setImageResource(onboardingImages[step-1])
                binding.step3.apply {
                    setBackgroundColor(getColor(com.bedirhan.chatapp.central.R.color.colorPrimary))
                }
                binding.buttonNext.apply {
                    text = getString(com.bedirhan.chatapp.central.R.string.get_started)
                    setBackgroundColor(getColor(com.bedirhan.chatapp.central.R.color.colorOnPrimary))
                    setTextColor(getColor(com.bedirhan.chatapp.central.R.color.colorWhite))
                }
                binding.buttonSkip.visibility = View.GONE
            }
        }
    }
}