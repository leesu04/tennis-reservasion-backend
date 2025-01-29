import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/members")
class MemberController(private val memberService: MemberService) {

    // memberId로 회원 정보 확인 API
    @GetMapping("/{memberId}")
    fun getMemberInfoById(@PathVariable memberId: Long): MemberResponseDto {
        return memberService.findMemberInfoById(memberId)
    }

    // studentId로 회원 정보 확인 API (로그인 ID 기반)
    @GetMapping("/student/{studentId}")
    fun getMemberInfoByStudentId(@PathVariable studentId: String): MemberResponseDto {
        return memberService.findMemberInfoByStudentId(studentId)
    }
}
