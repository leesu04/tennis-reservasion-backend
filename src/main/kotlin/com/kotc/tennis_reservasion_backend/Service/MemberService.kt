import org.springframework.stereotype.Service

@Service
class MemberService(private val memberRepository: MemberRepository) {

    // memberId로 회원 정보 확인
    fun findMemberInfoById(memberId: Long): MemberResponseDto {
        return memberRepository.findById(memberId)
            .map { MemberResponseDto.of(it) }
            .orElseThrow { RuntimeException("로그인 유저 정보가 없습니다.") }
    }

    // studentId로 회원 정보 확인 (로그인 ID로 사용)
    fun findMemberInfoByStudentId(studentId: String): MemberResponseDto {
        val member = memberRepository.findByStudentId(studentId)
            ?: throw RuntimeException("학번에 해당하는 유저 정보가 없습니다.")
        return MemberResponseDto.of(member)
    }
}
