package ch10;

// 사용자 정의 예외 클래스 구현
public class PasswordException extends Throwable {
    public PasswordException(String message) {
        super(message);
    }
}
