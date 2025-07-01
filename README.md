# DummyData

> 테스트/개발용 데이터 자동 생성 라이브러리

Java/Spring 환경에서 테스트에 사용할 더미 데이터를 쉽게 생성할 수 있도록 도와주는 자유주제 오픈소스 라이브러리 프로젝트 테스트용 데이터 만드는것 때문에 테스트가 하기 싫다는 생각때문에 해당 프로젝트 주제를 생각하게 되었고 반복적인 생성 작업 없이 테스트가 필요한 객체를 빠르게 만들 수 있으며 이름, 주소, 이메일, 날짜증 다양한 타입들의 값도 자동화 되어 생성 됩니다.



## 프로젝트 구조
```bash
com.example.dummygen
├── core/                  # 더미 생성의 핵심 로직
│   ├── DummyGenerator.java
│   ├── TypeResolver.java
│   ├── Constraint.java
│   ├── ConstraintValidator.java
│   └── RandomValueGenerator.java
│
├── costom/                # 사용자 정의 설정
│   ├── FieldConstraint.java
│   └── DummyCostom.java
│
├── format/                # 다양한 출력 포맷 지원
│   ├── CsvExporter.java
│   ├── JsonExporter.java
│   ├── SqlExporter.java
│   ├── ExcelExporter.java
│   └── ExportFormat.java
│
├── model/                 # 내부 객체 모델
│   ├── DummyObject.java
│   ├── DummyField.java
│   └── DataType.java
│
├── ai/                    # 자연어 해석 → 생성조건으로 변환
│   ├── NaturalLanguageParser.java
│   └── PromptToSchemaConverter.java
│
└── utils/                 # 유틸리티
├── RegexGenerator.java
├── ReflectionUtils.java
└── UniqueValueRegistry.java
```

##  설치 방법 / 사용 방법


## 기능
- `String`, `int`, `boolean`, `date`, `UUID' 다양한 데이터 타입 지원하여 생성
- 정규식 기반데이터 생성, UNIQUE, Nullable등의 등의 사용자 커스텀 기능
(ex, 주소는 서울로 지정.., 이름은 홍으로 시작,UNIQUE값은 중복방지 및 실패시 예외처리)
- 객체, 기본타입의 리스트 데이터 생성
- 대량 데이터 생성
- csv,json,sql,excel 등의 다양한 파일 포맷으로 데이터 파일 저장 
- ai + 데이터 생성
    - 사용자가 자연어로 시나리오 입력, 해당 구조와 사용자의 요구조건을 분석하여 더미 데이터를 생성 
