package `in`.mywearapp

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

    var accounts = arrayOf<Account>(
        Account("Current", 2000.12,"INR", true),
        Account("Saving", 200.12, "INR", false),
        Account("Homeloan", 20010.12,"INR", true),
        Account("Global", 2000.00, "USD", true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        accList.adapter = AccountsAdapter(this, accounts)

        setAmbientEnabled()
    }
}
