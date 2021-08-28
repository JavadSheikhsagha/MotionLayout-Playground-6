package com.javad.motionlayout_playground_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import com.javad.motionlayout_playground_5.databinding.ActivityMain2Binding
import com.javad.motionlayout_playground_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var circleOn = 100

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {

        
        binding.motionLayout2.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                when (p1) {
                    R.id.constSet_1Top -> circleOn = 1
                    R.id.constSet_2Top -> circleOn = 2
                    R.id.constSet_3Top -> circleOn = 3
                    R.id.constSet_4Top -> circleOn = 4
                    R.id.constSet_5Top -> circleOn = 5
                }
                when(circleOn){
                    1 -> Toast.makeText(applicationContext, "$circleOn", Toast.LENGTH_SHORT).show()
                    2 -> Toast.makeText(applicationContext, "$circleOn", Toast.LENGTH_SHORT).show()
                    3 -> Toast.makeText(applicationContext, "$circleOn", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(applicationContext, "$circleOn", Toast.LENGTH_SHORT).show()
                    5 -> Toast.makeText(applicationContext, "$circleOn", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }
        })


    }

//    private fun userScrolledRight() {
//
//        circleOn++
//
//
////
////        val lp1 = binding.const1.layoutParams as ConstraintLayout.LayoutParams
////        val lp2 = binding.const2.layoutParams as ConstraintLayout.LayoutParams
////        val lp3 = binding.const3.layoutParams as ConstraintLayout.LayoutParams
////        val lp4 = binding.const4.layoutParams as ConstraintLayout.LayoutParams
////        val lp5 = binding.const5.layoutParams as ConstraintLayout.LayoutParams
////
////        binding.const1.layoutParams = lp3
////        binding.const2.layoutParams = lp1
////        binding.const3.layoutParams = lp5
////        binding.const4.layoutParams = lp2
////        binding.const5.layoutParams = lp4
//
//        when(circleOn%5){
//            0->{//1 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            1->{//2 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            2->{//5 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            3->{//5 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            4->{//1 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//        }
//
//    }
//
//    private fun userScrolledLeft() {
//
//        circleOn--
//
//
////
////        val lp1 = binding.const1.layoutParams as ConstraintLayout.LayoutParams
////        val lp2 = binding.const2.layoutParams as ConstraintLayout.LayoutParams
////        val lp3 = binding.const3.layoutParams as ConstraintLayout.LayoutParams
////        val lp4 = binding.const4.layoutParams as ConstraintLayout.LayoutParams
////        val lp5 = binding.const5.layoutParams as ConstraintLayout.LayoutParams
////
////        binding.const1.layoutParams = lp3
////        binding.const2.layoutParams = lp1
////        binding.const3.layoutParams = lp5
////        binding.const4.layoutParams = lp2
////        binding.const5.layoutParams = lp4
//
//        when(circleOn%5){
//            0->{//1 Top
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//
//            }
//            1->{//2 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            2->{//5 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            3->{//5 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//            4->{//1 Top
//                binding.const1.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_3)
//                binding.const2.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_1)
//                binding.const3.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_5)
//                binding.const4.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_2)
//                binding.const5.background = ContextCompat.getDrawable(applicationContext,R.drawable.circular_shape_4)
//                binding.motionLayout.setTransition(R.id.tran_scrollRight_back)
//                binding.motionLayout.transitionToEnd()
//            }
//        }
//    }
}