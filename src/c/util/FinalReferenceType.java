package c.util;

import c.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();
    public static void main(String[] args) {
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();
    }

    private void checkDTO() {
        System.out.println(dto);
        // dto = new MemberDTO(); // 컴파일X
        dto.name = "Sangmin"; // 컴파일O.. --> dto 객체는 두 번 이상 생성할 수 없음, 객체 안에 있는 객체들은 final로 선언되지 않음
        System.out.println(dto);
    }
}
