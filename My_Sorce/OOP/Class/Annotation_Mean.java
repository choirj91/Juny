package Class;
import java.lang.annotation.ElementType;

										//어노테이션(annotation)은 메타데이터(metadata)라고 볼 수 있음. 	
										//메타데이터란 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일 하고 처리할 것인지 알려주는 정보.
										//어노테이션 - 1. 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공. 2. 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
										//실행 시(런타임 시) 특정 기능을 실행하도록 정보를 제공.


import java.lang.annotation.Target;

import javax.lang.model.element.Element;

class Annotation_Mean{



//어노테이션은 빌드 시 자동으로 XML 설정 파일을 생성하거나, 배포를 위해 JAR 압축 파일을 생성하는데에도 사용. 실행시 클래스의 역할을 정의하기도 함.
		@Override						//메소드가 오버라이드된 것임을 컴파일러에게 알려주어 컴파일러가 오버라이드 검사를 하도록 함.
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		public @interface AnnotationName{	//어노테이션 정의
			//타입 elementName() [default 값];
			String elementName1();
			int elementName2() default 5;
		}
		
		//@AnnotationName(elementName1="값", elementName2=3);
		//@AnnotationName(elementName1="값")
		
		@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})	//어노테이션이 적용될 대장을 지정할 때에는 @Target 어노테이션을 사용.
		public @interface AnnotationName1{
		}
		
										//사용 용도에 따라 어느 범위까지 유지할 것인지 지정해야 함.
										//예)소스상에만 유지할 건지, 컴피일된 클래스까지 유지할 건지, 런타임 시에도 유지할 건지 지정.
										//RetenionPolicy 열거상수
										//SOUTCE - 소스상에서만 어노테이션 정보를 유지한다. 소스 코드를 분석할 대만 의미가 있으며, 바이트 코드 파일에는 정보가 남지 않음.
										//CLASS - 바이트 코드 파일까지 어노테이션 정보를 유지. 리플렉션을 이용해서 어노테이션 정보를 얻을 수 는 없음.
										//RUNTIME - 바이트 코드 파일까지 어노테이션 정보를 유지하면서 리플렉션을 이용해서 런타임 시에 어노테이션 정보를 얻을 수 있다.
										//리플렌션(rEFLECTION)이란 런타임 시에 클래스의 메타 정보를 얻는 기능을 말한다. 클래스가 가지고 있는 필드가 무엇인지, 어떤 생성자를 갖고 있는지,
										//어떤 메소드를 가지고 있는지, 적용된 어노테이션이 무엇인지 알아내는 것이 리플렉션임.
										//리플렌션을 이용해서 런타임 시에 어노테이션 정보를 얻으려면 어노페이션 유지 정책을 RUNTIME으로 설정해야 함. 어노테이션 유지 정책을 지정할 때에는 @Retention 을 사용.
		//@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
		
		
		
	
	
}

