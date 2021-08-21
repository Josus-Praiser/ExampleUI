package com.josus.exampleui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.josus.exampleui.R
import com.josus.exampleui.model.SecondList

class SecondListAdapter(private val context: Context,private val data:List<SecondList>)
    :RecyclerView.Adapter<SecondListAdapter.ItemViewHolder>()
{
    class ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        val titleText:TextView=view.findViewById(R.id.secondListTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.second_list,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val item=data[position]
        holder.titleText.text=context.resources.getString(item.titleText)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}