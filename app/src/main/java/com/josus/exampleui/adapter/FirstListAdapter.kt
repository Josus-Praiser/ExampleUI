package com.josus.exampleui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.josus.exampleui.R
import com.josus.exampleui.model.FirstList

class FirstListAdapter(private val context:Context,
private val data:List<FirstList>):RecyclerView.Adapter<FirstListAdapter.ItemViewHolder>() {

    class ItemViewHolder(view:View):RecyclerView.ViewHolder(view){
        val titleImage:ImageView=view.findViewById(R.id.card1_image_view)
        val titleText:TextView=view.findViewById(R.id.title_text)
        val subTitleText:TextView=view.findViewById(R.id.subtitle_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout=LayoutInflater.from(parent.context).inflate(R.layout.first_list,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=data[position]

        holder.titleImage.setImageResource(item.imageRs)
        holder.titleText.text=context.resources.getString(item.titleRes)
        holder.subTitleText.text=context.resources.getString(item.subtitleRes)
        holder.titleImage.setBackgroundResource(item.imageBg)
    }

    override fun getItemCount(): Int {
       return data.size
    }
}