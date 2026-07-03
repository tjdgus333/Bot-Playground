package smells;

public class BadCodeExample {

    // 1. 제어자 순서 오류 (SonarQube Rule: java:S1124)
    // 표준 권장 순서(public static final)를 어김
    final static public int MULTIPLIER = 10;

    // 2. 사용하지 않는 private 필드 (SonarQube Rule: java:S1068)
    private String unusedPrivateField = "I am never used";

    // 3. 비어 있는 메서드 (SonarQube Rule: java:S1186)
    // 구현 내용이 없는 빈 메서드
    public void doNothingMethod() {
    }

    public int calculateValue(int a, int b) {
        // 4. 사용하지 않는 지역 변수 (SonarQube Rule: java:S1481)
        // 선언 후 한 번도 참조되지 않음
        int unusedLocalVariable = a + b;

        return a * MULTIPLIER;
    }
}