package com.example.roomwordsample.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Tags_table")
class Tags(

    @ColumnInfo(name = "tag_name")
    var tag_name:String

){
    @PrimaryKey
    @ColumnInfo
    var tag_id:Int=1
}