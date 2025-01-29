package com.kotc.tennis_reservation_backend.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "members")
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false, unique = true)
    val studentId: String,

    @Column(nullable = false)
    val department: String,

    @Column(nullable = false, unique = true)
    val phoneNumber: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val gender: Gender,

    @Column(nullable = false)
    val password: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val role: Role = Role.ROLE_USER,

    @Column(updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
)

enum class Gender {
    M, F
}
enum class Role {
    ROLE_USER, ROLE_ADMIN
}