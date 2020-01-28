# 컬렉션 프레임웍
1. **JDK1.2 이전까지**는 Vector, Hashtable, Properties와 같은 컬렉션 클래스들은 서로 다른 각자의 방식으로 처리해야 했다.
2. **JDK1.2 부터** 컬렉션프레임웍이 등장하면서 다양한 종류의 컬렉션 클래스가 추가되었고, 모든 컬렉션 클래스를 표준화된 방식으로 다룰 수 있도록 체계화됨.
<br> - 다수의 데이터를 쉽게 처리할 수 있는 표준화된 방법을 제공하는 클래스들

# 컬렉션
- 다수의 데이터, 즉 데이터 그룹을 의미

# 프레임웍
- 표준화, 정형화된 체계적인 프로그래밍 방식

# 컬렉션 클래스
- 다수의 데이터를 저장할 수 있는 클래스

# 컬렉션 프레임웍의 핵심 인터페이스 (List, Set, Map)
1. **List**: 순서가 있는 데이터의 집합. 데이터의 중복을 허용한다.
2. **Set**: 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다.
3. **Map**: 키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터의 집합.
 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값의 중복을 허용한다.
![](./image/CollectionDiagram.jpg)
<br> - Vector, Hashtable, Properties와 같은 클래스들은 컬렉션 프레임웍이 만들어지기 이전부터 존재하던 것이기 때문에 컬렉션 프레임웍의 명명법을 따르지 않는다.
<br> - Vector나 Hashtabler과 같은 기존의 컬렉션 클래스들은 호환을 위해, 설계를 변경해서 남겨두었지만 **가능하면 사용하지 않는 것이 좋다.**

# 동기화
1. 멀티쓰레드 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있기 때문에 데이터의 일관성을 유지하기 위해서는 동기화가 필요하다.
2. Vector와 Hashtable과 같은 구버전(JDK1.2 이전)의 클래스들은 자체적으로 동기화 처리가 되어있는데, 멀티쓰레드 프로그래밍이 아닌 경우에는 불필요한 기능이 되어 성능을 떨어트리는 요인이 된다.
3. ArrayList와 HashMap과 같은 컬렉션은 동기화를 자체적으로 처리하지 않고 필요한 경우 java.util.Collections클래스의 동기화 메서드를 이용해서 동기화처리가 가능하도록 변경되었다.

```java
-- 12장 쓰레드 영역에서 자세히 다루기 때문에 그냥 이런게 있다 정도만..

static Collection synchronizedCollection(Collection c)
static List synchronizedList(List l)
static Map synchronizedSet(Set s)
static Set synchronizedMap(Map m)
static SortedMap synchronizedSortedSet(SortedSet s)
static SortedSet synchronizedSortedMap(SortedMap m)

ex)
List list = Collections.synchronizedList(new ArrayList(....));
```

# Vector와 ArrayList
1. ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일 
2. List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다. 
3. 데이터의 저장공간으로 배열을 사용한다.(배열기반) 
4. Vector는 자체적으로 동기화처리가 되어 있으나 ArrayList는 그렇지 않다. 
<br> - **Vector보다는 ArrayList를 사용하는것이 좋다.**   
<br> * 기본 예제  
![](./image/ArrayList01.jpg)   
<br> * 긴 문자열 데이터를 원하는 길이로 잘라서 ArrayList에 담은 다음 출력하는 예제  
![](./image/ArrayList02.jpg)  

# Deep copy vs. Shallow copy
1. Deep copy(깊은 복사): 같은 내용의 새로운 객체를 생성. 원본의 변화에 복사본이 영향을 받지 않는다.
2. Shallow copy(얕은 복사): 참조변수만 복사. 원본의 변화에 복사본이 영향을 받는다.  

![](./image/Copy.jpg)  

# ArrayList의 단점 (배열의 단점)
- 배열은 구조가 간단하고 데이터를 읽어오는 데 걸리는 시간(접근시간, access time)이 가장 빠르다는 장점이 있지만 단점도 있다.
1. **크기를 변경할 수 없다.**
<br> - 크기를 변경해야 하는 경우 새로운 배열을 생성하고 데이터를 복사해야 한다.(비용이 큰 작업) 
<br> - 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리 낭비가 심해진다.  
2. **비순차적인 데이터의 추가, 삭제에 시간이 많이 걸린다.**
<br> - 그러나, 순차적인 데이터 추가(마지막에 추가)와 순차적으로 데이터를 삭제하는 것(마지막에서부터 삭제)은 빠르다. 
<br> - 데이터를 추가하거나 삭제하기 위해, 많은 데이터를 옮겨야 한다.  

# LinkedList (더블 링크드 리스트, 더블 서큘러 링크드 리스트 뭔말이야 싀부레)
- 배열과 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결(Link)

![](./image/LinkedList01.jpg)  
![](./image/LinkedList02.jpg)

# ArrayList vs. LinkedList
1. 순차적으로 데이터를 추가/삭제하는 경우, ArrayList가 빠르다. 
2. 비순차적으로 데이터를 추가/삭제하는 경우, LinkedList가 빠르다. 
3. 접근시간(access time)은 ArrayList가 빠르다.
 
![](./image/LinkedList03.jpg)

# 스택과 큐(Stack & Queue)
1. 스택(Stack) : LIFO구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다.
<br> - 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로(웹브라우져)
2. 큐(Queue) : FIFO구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다. 
<br> - 최근 사용문서, 인쇄작업대기목록, 버퍼(buffer)

![](./image/Stack.jpg)


