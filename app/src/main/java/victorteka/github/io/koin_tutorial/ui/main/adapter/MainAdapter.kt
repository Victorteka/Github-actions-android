package victorteka.github.io.koin_tutorial.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import victorteka.github.io.koin_tutorial.data.model.User
import victorteka.github.io.koin_tutorial.databinding.ItemLayoutBinding

class MainAdapter (
    private val users: ArrayList<User>
        ): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return  MainViewHolder(
            ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.binding.textViewUserName.text = users[position].name
        holder.binding.textViewUserEmail.text = users[position].email
        Glide.with(holder.binding.imageViewAvatar.context)
            .load(users[position].avatar).into(holder.binding.imageViewAvatar)
    }

    override fun getItemCount() = users.size

    fun addData(list: List<User>){
        users.addAll(list)
    }
}