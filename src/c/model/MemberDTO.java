package c.model;

import c.service.MemberManager;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {

    }

    public MemberDTO(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 주소가 같으므로 당연히 true
        if (obj == null) return false; // obj가 null이므로 당연히 false
        if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false

        MemberDTO other = (MemberDTO) obj; // 같은 클래스이므로 형변환 실행

        // 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행

        if (name == null) { // name이 null일때
            if (other.name != null) return false; // 비교 대상의 name이 null 아니면 false
        } else if (!name.equals(other.name)) return false; // 두 개의 name 값이 다르면 false

        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        // 위 사항 모두 체크하여 false를 리턴하지 않은 객체는 같은 값을 가지는 객체로 생각해서 true
        return true;
    }

    // equals() 메서드를 오버라이딩할 때에는 hashCode 메서드도 같이 오버라이딩해야함
    // equals 객체의 값이 같음을 판단하나 객체의 주소까지 같지는 않음


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
}
