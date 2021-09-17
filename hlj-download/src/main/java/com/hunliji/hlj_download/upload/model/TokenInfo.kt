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
    val familyFolder:String?=null
)