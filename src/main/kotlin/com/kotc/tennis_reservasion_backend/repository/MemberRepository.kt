import com.kotc.tennis_reservation_backend.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long> {

    // 학번으로 회원 검색
    fun findByStudentId(studentId: String): Member?
}
