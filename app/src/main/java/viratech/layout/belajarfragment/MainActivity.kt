package viratech.layout.belajarfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        val mFragment = supportFragmentManager
        val mHomeFragment = HomeFragment()
        val fragment = mFragment.findFragmentByTag(HomeFragment::class.java.simpleName)


        if (fragment !is HomeFragment){

            Log.d("my flexibleFragment","fragment name:" + HomeFragment::class.java.simpleName)
            mFragment
                .beginTransaction()
                .add(R.id.frame_container,mHomeFragment::class.java.simpleName)
                .commit()


         //   <html>None of the following functions can be called with the arguments supplied:<br/>public open fun add(fragment: Fragment, tag: String?): FragmentTransaction defined in androidx.fragment.app.FragmentTransaction<br/>public open fun add(containerViewId: Int, fragment: Fragment): FragmentTransaction defined in androidx.fragment.app.FragmentTransaction
        }







    }
}


