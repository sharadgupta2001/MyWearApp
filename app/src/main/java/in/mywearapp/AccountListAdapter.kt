package `in`.mywearapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AccountListAdapter (val context: Activity, val maintitle: Array<String>, val subtitle:Array<String>, val imgid:Array<Int>)
            :ArrayAdapter<String>(context, R.layout.account_list, maintitle) {


    override fun getView(position : Int, view : View?, parent:ViewGroup): View {
        val inflater = context.getLayoutInflater()
        val rowView = inflater.inflate(R.layout.account_list, null, true)
        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.subtitle) as TextView

        titleText.setText(maintitle[position])
        imageView.setImageResource(R.drawable.ic_cc_checkmark)
        subtitleText.setText(subtitle[position])
        return rowView
    }
}