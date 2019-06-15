package `in`.mywearapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AccountsAdapter (val context: Activity, val accounts: Array<Account>)
            :ArrayAdapter<Account>(context, R.layout.account_list, accounts) {


    override fun getView(position : Int, view : View?, parent:ViewGroup): View {
        val inflater = context.getLayoutInflater()
        val rowView = inflater.inflate(R.layout.account_list, null, true)
        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.subtitle) as TextView

        titleText.setText(accounts[position].name)
        imageView.setImageResource(R.drawable.ic_cc_checkmark)
        subtitleText.setText(accounts[position].currency + " " + accounts[position].balance)
        return rowView
    }
}