package Class;
import java.lang.annotation.ElementType;

										//������̼�(annotation)�� ��Ÿ������(metadata)��� �� �� ����. 	
										//��Ÿ�����Ͷ� ������ ������ ���� �������� �ڵ带 ��� ������ �ϰ� ó���� ������ �˷��ִ� ����.
										//������̼� - 1. �����Ϸ����� �ڵ� ���� ������ üũ�ϵ��� ������ ����. 2. ����Ʈ���� ���� ���� ���峪 ��ġ �� �ڵ带 �ڵ����� ������ �� �ֵ��� ������ ����
										//���� ��(��Ÿ�� ��) Ư�� ����� �����ϵ��� ������ ����.


import java.lang.annotation.Target;

import javax.lang.model.element.Element;

class Annotation_Mean{



//������̼��� ���� �� �ڵ����� XML ���� ������ �����ϰų�, ������ ���� JAR ���� ������ �����ϴµ����� ���. ����� Ŭ������ ������ �����ϱ⵵ ��.
		@Override						//�޼ҵ尡 �������̵�� ������ �����Ϸ����� �˷��־� �����Ϸ��� �������̵� �˻縦 �ϵ��� ��.
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		public @interface AnnotationName{	//������̼� ����
			//Ÿ�� elementName() [default ��];
			String elementName1();
			int elementName2() default 5;
		}
		
		//@AnnotationName(elementName1="��", elementName2=3);
		//@AnnotationName(elementName1="��")
		
		@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})	//������̼��� ����� ������ ������ ������ @Target ������̼��� ���.
		public @interface AnnotationName1{
		}
		
										//��� �뵵�� ���� ��� �������� ������ ������ �����ؾ� ��.
										//��)�ҽ��󿡸� ������ ����, �����ϵ� Ŭ�������� ������ ����, ��Ÿ�� �ÿ��� ������ ���� ����.
										//RetenionPolicy ���Ż��
										//SOUTCE - �ҽ��󿡼��� ������̼� ������ �����Ѵ�. �ҽ� �ڵ带 �м��� �븸 �ǹ̰� ������, ����Ʈ �ڵ� ���Ͽ��� ������ ���� ����.
										//CLASS - ����Ʈ �ڵ� ���ϱ��� ������̼� ������ ����. ���÷����� �̿��ؼ� ������̼� ������ ���� �� �� ����.
										//RUNTIME - ����Ʈ �ڵ� ���ϱ��� ������̼� ������ �����ϸ鼭 ���÷����� �̿��ؼ� ��Ÿ�� �ÿ� ������̼� ������ ���� �� �ִ�.
										//���÷���(rEFLECTION)�̶� ��Ÿ�� �ÿ� Ŭ������ ��Ÿ ������ ��� ����� ���Ѵ�. Ŭ������ ������ �ִ� �ʵ尡 ��������, � �����ڸ� ���� �ִ���,
										//� �޼ҵ带 ������ �ִ���, ����� ������̼��� �������� �˾Ƴ��� ���� ���÷�����.
										//���÷����� �̿��ؼ� ��Ÿ�� �ÿ� ������̼� ������ �������� ������̼� ���� ��å�� RUNTIME���� �����ؾ� ��. ������̼� ���� ��å�� ������ ������ @Retention �� ���.
		//@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
		
		
		
	
	
}

