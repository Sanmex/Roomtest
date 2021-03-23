package com.example.roomtest.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Index
import com.example.roomtest.Empresa

@Entity(tableName = "tabla_oferta",foreignKeys = [
        ForeignKey(entity = Empresa::class,parentColumns = ["idem"],
        childColumns = ["idemofer"])],
        indices = [Index("idemofer")]
)
data class Oferta(
        @PrimaryKey(autoGenerate = true)
        var oferide:Long,
        val idemofer:Int=0,
        val nomofer:String?,
        val horaofer:String?,
        val salaofer:String?,


        )

