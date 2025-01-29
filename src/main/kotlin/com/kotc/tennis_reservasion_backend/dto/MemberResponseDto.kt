import com.kotc.tennis_reservation_backend.entity.Gender
import com.kotc.tennis_reservation_backend.entity.Member
import com.kotc.tennis_reservation_backend.entity.Role

data class MemberResponseDto(
    val id: Long,
    val name: String,
    val studentId: String,
    val department: String,
    val phoneNumber: String,
    val gender: Gender,
    val role: Role
) {
    companion object {
        // Member -> MemberResponseDto 변환 메서드
        fun of(member: Member): MemberResponseDto {
            return MemberResponseDto(
                id = member.id,
                name = member.name,
                studentId = member.studentId,
                department = member.department,
                phoneNumber = member.phoneNumber,
                gender = member.gender,
                role = member.role
            )
        }
    }
}
