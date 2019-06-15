package `in`.mywearapp

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {
    var maintitle = arrayOf("Savings", "Homeloan", "Credit Card", "Global", "Current")

    var subtitle = arrayOf("INR 5000.01", "INR 200013.00", "INR 120.12", "USD 200.00", "GBP 100.00")

    var imgid = arrayOf<Int>(
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        accList.adapter = AccountListAdapter(this, maintitle, subtitle, imgid)

        // Enables Always-on
        setAmbientEnabled()
    }
}
