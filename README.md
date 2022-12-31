# 디자인 패턴

<hr/>

- # 생성 패턴
    1. #### [팩토리 메서드](#팩토리-메서드)
    2. #### [프로토 타입](#프로토타입)
    3. #### [추상 팩토리](#추상-팩토리)
    4. #### [빌더](#빌더-패턴)
    5. #### 싱글톤
- ### 구조 패턴
    1. #### 어댑터
    2. #### 데코레이터
    3. #### 프록시
    4. #### 브릿지
    5. #### 파사드
    6. #### 복합체
    7. #### 플라이웨이트
- ### 행동 패턴
    1. #### 연쇄 책임
    2. #### 중재자
    3. #### 상태
    4. #### 비지터
    5. #### 커맨드
    6. #### 메멘토
    7. #### 전략
    8. #### 반복자
    9. #### 옵저버
    10. #### 템플릿 메서드

# 팩토리 메서드

- ``` Super Class에서 객체를 생성할 수 있는 인터페이스를 제공하지만, 자식 클래스들이 생성될 객체들의 유형을 변경할 수 있도록 하는 생성 패턴입니다.```
- ## 문제
- ```
    트럭 운송만 처리 가능한 대부분의 코드가 'Truck' Class에 있습니다.
    얼마 후 해상 물류 기능을 추가해 달라는 요청이 수십 개씩 받기 시작했다고 가정해 봅시다.
    현재 대부분의 소스코드가 'Truck' Class에 결합되어 있기 때문에 'Ship' Class를 추가하려면 전체 코드 베이스를 변경해야 할 것입니다.
  ```
- ![](https://refactoring.guru/images/patterns/diagrams/factory-method/solution1.png)

- ## 해결책
- ```
    (new 예약어)객체 생성을 위한 팩토리 메서드를 만들면 됩니다.
    생성자 호출을 옮겼을 뿐인데 이제 자식 클래스에서 팩토리 메서드를 Overriding하고 그 메서드에서 생성되는 (제품)인스턴스를 변경할 수 있습니다.
    
  'Truck'과 'Ship' Class들은 모두 'Transport' Interface를 구현해야 하며, 이 인터페이스는 'deliver'메서드를 선언합니다.
  각 클래스는 이 메서드를 다르게 구현해서 트럭은 육지로 배송하게 하고 배는 해상으로 배송하게 합니다.
  
  아래는 토끼와 거북이를 사용해 팩토리 메서드를 구현했습니다.
  ```
- ![](https://refactoring.guru/images/patterns/diagrams/factory-method/solution2-ko.png)
- ### [팩토리메서드 - Java](src/patterns/creational/factorymethod/Main.java)

<hr/>

# 프로토타입

- ```
    객체의 복사본을 만들려면 어떻게 해야될까요?
    - 1. 먼저 같은 새 클래스를 만듭니다.
    - 2. 그 다음 객체의 필드를 살펴 본 후 값을 옮겨줍니다.
  하지만 이 방법에는 문제가 있습니다.
    - 1. 복사본 객체가 이전 객체에 의존하게됩니다.
    - 2. 객체의 일부 필드가 복사할 수 없는 상태 일 수 있습니다.
  ```
- ## 해결책
  ```
  "프로토타입" 패턴은 실제로 복제되는 객체들의 복제 프로세스를 위임합니다.
  패턴은 복제를 지원하는 모든 객체에 대한 공통 인터페이스를 선언합니다.
  공통 인터페이스는 일반적으로 'clone' 메서드만 가집니다.

  clone 메서드의 구현은 모든 클래스에서 매우 유사합니다.
  
  이 메서드는 현재 클래스의 객체를 만든 후 이전 객체의 모든 필드 값을 새 객체로 전달합니다.
  대부분의 프로그래밍 언어는 객체들이 같은 클래스에 속한 다른 객체의 비공개 
  필드들에 접근(access) 할 수 있도록 하므로 비공개 필드들을 복사하는 것도 가능합니다.

![](https://refactoring.guru/images/patterns/content/prototype/prototype-comic-2-ko.png)

- ### [프로토타입 - Java](src/patterns/creational/prototype/Main.java)

# 빌더 패턴

- ```
  복잡한 객체들을 단계별로 생성할 수 있도록 하는 생성 디자인 패턴.
    
  대표적으로 java.lang.StringBuilder#append()가 빌더 패턴을 적용한 예시입니다.
  ```