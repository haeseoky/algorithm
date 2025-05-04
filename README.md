# Algorithm 프로젝트

Java로 구현된 다양한 알고리즘과 자료구조 예제 모음입니다. 이 저장소는 알고리즘 학습 및 문제 해결 능력 향상을 위한 참고 자료로 활용할 수 있습니다.

## 프로젝트 구조

프로젝트는 Spring Boot 기반으로 구성되어 있으며, 다양한 알고리즘 카테고리별로 패키지가 구분되어 있습니다:

```
src/main/java/com/ocean/scdemo/
├── parallel      - 병렬 처리 알고리즘
├── ranking       - 랭킹 시스템 알고리즘
├── hierarchy     - 계층 구조 처리 알고리즘
├── util          - 유틸리티 클래스
├── mybatis       - MyBatis 예제
├── inject        - 의존성 주입 예제
├── config        - 설정 클래스
├── redis         - Redis 활용 예제
├── stream        - Java 스트림 API 활용
├── annotation    - 커스텀 어노테이션
├── finaltest     - final 키워드 테스트
├── junittest     - 단위 테스트
├── type          - 타입 관련 테스트
├── http          - HTTP 클라이언트
├── virtual       - 가상 스레드 활용
├── sample        - 기타 예제 코드
├── exception     - 예외 처리
├── interceptor   - 인터셉터
└── banner        - 애플리케이션 배너
```

## 구현된 알고리즘

### 병렬 처리 알고리즘 (parallel 패키지)
- **병렬 데이터 처리**: CompletableFuture를 활용한 병렬 처리
- **동시성 제어**: 효율적인 동시성 관리 기법
- **성능 최적화**: 병렬 스트림과 일반 스트림의 성능 비교

### 랭킹 시스템 (ranking 패키지)
- **효율적인 랭킹 알고리즘**: Redis를 활용한 실시간 랭킹 데이터 관리
- **Top-N 쿼리 최적화**: 대용량 데이터에서 효율적인 상위 N개 항목 추출
- **스코어 집계 알고리즘**: 다양한 척도의 점수를 통합하는 방법

### 계층 구조 처리 (hierarchy 패키지)
- **트리 순회 알고리즘**: 전위, 중위, 후위 탐색
- **재귀적 구조 처리**: 복잡한 계층 구조의 효율적인 탐색 및 변환
- **경로 탐색**: 노드 간 최단 경로 찾기

### 스트림 API 활용 (stream 패키지)
- **함수형 데이터 처리**: 선언적 프로그래밍 방식으로 데이터 변환
- **컬렉션 처리 최적화**: 스트림 API를 활용한 효율적인 컬렉션 처리
- **맵-리듀스 패턴**: 대용량 데이터의 집계 및 변환

### 가상 스레드 활용 (virtual 패키지)
- **경량 스레드 처리**: Java 21의 가상 스레드 기능 활용
- **동시성 성능 비교**: 기존 스레드 모델과 가상 스레드의 성능 차이
- **리소스 효율성**: 제한된 리소스에서 최대 처리량 달성 방법

## 시작하기

### 필수 조건

- JDK 21 이상
- Gradle
- IDE (IntelliJ IDEA 권장)

### 설치 방법

1. 레포지토리 클론:
   ```bash
   git clone https://github.com/haeseoky/algorithm.git
   cd algorithm
   ```

2. Gradle로 빌드:
   ```bash
   ./gradlew build
   ```

3. 애플리케이션 실행:
   ```bash
   ./gradlew bootRun
   ```

## 주요 기능 테스트

각 알고리즘은 JUnit 테스트를 통해 검증할 수 있습니다:

```bash
./gradlew test
```

특정 알고리즘만 테스트하려면:

```bash
./gradlew test --tests "com.ocean.scdemo.parallel.*"
```

## 기여 방법

1. 이 저장소를 포크합니다.
2. 새로운 브랜치를 생성합니다: `git checkout -b feature/새로운-알고리즘`
3. 변경 사항을 커밋합니다: `git commit -am '새로운 알고리즘 추가: 설명'`
4. 브랜치에 푸시합니다: `git push origin feature/새로운-알고리즘`
5. Pull Request를 제출합니다.

## 라이센스

이 프로젝트는 MIT 라이센스를 따릅니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.
