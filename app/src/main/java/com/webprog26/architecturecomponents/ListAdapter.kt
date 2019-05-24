package com.webprog26.architecturecomponents

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.webprog26.architecturecomponents.data.User
import com.webprog26.architecturecomponents.databinding.ListItemBinding

class ListAdapter(private val users: List<User>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): ListViewHolder {
        val userListBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ListViewHolder(userListBinding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(users[position])
    }

    class ListViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.user = user
            binding.executePendingBindings()
        }
    }
}