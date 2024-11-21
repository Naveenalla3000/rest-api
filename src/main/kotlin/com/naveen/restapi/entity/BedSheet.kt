package com.naveen.restapi.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.*
import java.io.Serializable
import jakarta.persistence.Entity

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
data class BedSheet(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @NonNull
    val name: String,
    @NonNull
    val price: Double,
) : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }
}