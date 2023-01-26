package com.example.android.marsphotos.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsphotos.databinding.GridViewItemBinding
import com.example.android.marsphotos.network.MarsPhoto

class PhotoGridAdapter : ListAdapter<MarsPhoto, PhotoGridAdapter.MarsPhotoViewHolder>(DiffCallback) {
    class MarsPhotoViewHolder(private var binding: GridViewItemBinding) : RecyclerView.ViewHolder(binding.root) {

        // MarsPhoto 객체를 인수로 사용, binding.property 를 이 객체로 설정하는 메소드
        fun bind(MarsPhoto: MarsPhoto){
            binding.photo = MarsPhoto
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsPhotoViewHolder {
        // GridViewItemBinding를 확장하고 상위 ViewGroup 컨텍스트의 LayoutInflater를 사용해 새로운 MarsPhotoViewHolder를 반환해야 한다.
        return MarsPhotoViewHolder(GridViewItemBinding.inflate(
            LayoutInflater.from(parent.context)
        ))
    }

    override fun onBindViewHolder(holder: MarsPhotoViewHolder, position: Int) {
        // RecyclerView 위치와 연결된 MarsPhoto 객체를 가져온 다음 속성을 bind()에 전달
        val marsPhoto = getItem(position)
        holder.bind(marsPhoto)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<MarsPhoto>(){
        override fun areItemsTheSame(oldItem: MarsPhoto, newItem: MarsPhoto): Boolean {
            // DiffUtil에서 MarsPhoto 객체가 이전과 동일한지 확인
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MarsPhoto, newItem: MarsPhoto): Boolean {
            // DiffUtil에서 호출받아 두개가 동일한지 확인한다.
            return oldItem.imgSrcUrl == newItem.imgSrcUrl
        }

    }
}
