package data_for_make;
import java.util.stream.*;


/**
 * 현재 makefile의 내용을 관리하는 클래스입니다.
 * 변경전, 저장전의 내용을 구분해서 가지고 있으며,
 * 이를 이용해 작성전, 작성 후 makefile의 비교도 가능합니다.
 * 파일 자체의 입력이나 저장은 file_manager 클래스가 관리합니다.
 */
public class StringDescriptor {
	protected String original_text;
	protected String modified_text;
	
	/*
	 * 이제 여기에 파싱을 통해 확인한 의존관계가 정리되어야합니다.
	 * 트리로 표현하는게 최고겠지만 그거 만들기 귀찮다 라이브러리 어디서 구하지?
	 * 따라서 이 부분은 간략화됩니다. 단순히 순서를 통해서 정리하거나
	 * 각 토큰을 데이터 클래스로 해서 저장해야하는데 아 귀찮다.
	 */
	
}
