package com.hunliji.hlj_download.upload.model

/** Created by yc on 2021/9/16
 **/


data class TokenInfo(

    val resultMsg:String?= null,
    val resultCode: Int = 0,
    val data:UploadInfo? = null


)

data class UploadInfo(
    val imageHostUrl:String?=null,
    val fileUploadToken:String?=null,
    val headImgFolder:String?=null,
    val anchorFolder:String?=null,
    val familyFolder:String?=null,
    val VideoFolder:String?=null
){
    fun getImageType(type: Int): String{
        return when(type){
            FileType.HEADER_IMAGE.type ->{
                headImgFolder?:""
            }
            FileType.ANCHOR_IMAGE.type ->{
                anchorFolder?:""
            }
            FileType.VIDEO_IMAGE.type ->{
                VideoFolder?:""
            }
            else-> {
                familyFolder?:""
            }
        }
    }
}

enum class FileType(val type: Int){
    HEADER_IMAGE(1),
    ANCHOR_IMAGE(2),
    FAMILY_IMAGE(3),
    VIDEO_IMAGE(4),
}