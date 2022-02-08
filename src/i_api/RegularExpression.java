package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * () : 부르는 명칭
		 * ^(캐럿)	뒷 문자로 시작
		 * $		앞 문자로 종료
		 * .		임의의 하나의 문자(줄바꿈 제외)
		 * *		앞 문자가 0개 이상
		 * +		앞 문자가 1개 이상
		 * ?		앞 문자가 없거나 1개
		 * []		문자의 집합이나 범위([a-z]:a부터 z까지, [^a-z]:a부터 z가 아닌 것) - 한글이나 숫자도 가능
		 * {}		앞 문자의 개수({2}:2개, {2,4}:2개 이상 4개 이하)
		 * ()		그룹화(1개의 문자처럼 인식)
		 * | 		OR 연산
		 * \s		공백, 탭, 줄바꿈
		 * \S		공백, 탭, 줄바꿈이 아닌 문자
		 * \w		알파벳이나 숫자
		 * \W		앞파벳이나 숫자가 아닌 문자
		 * \d		숫자
		 * \D		숫자가 아닌 문자
		 * (?!)		뒷 문자의 대소문자 구분 안함
		 * \		정규표현식에서 사용되는 특수문자 표현				
		*/
		
		
		String str = "abc123";
		String regex = "[a-z]{3}[0-9]{1,3}"; 
		// [a-z] : a-z 중 한글자, 중괄호를 사용해서 숫자 지정 가능
		// {1,} : 1개 이상
		
		String regex2 = "[a-z0-9]+"; //알파벳이나 숫자가 한개 이상
		
		String regex3 = "\\w*"; // \가 하나이면 컴파일 에러가 발생, 자바에서 \는 탈출문자 역활을 하기 때문에
		
		Pattern p = Pattern.compile(regex); //정규표현식을 해석
		Matcher m = p.matcher(str); 	//정규표현식과 문자열을 비교
		System.out.println(m.matches()); // 문자열과 정규표현식이 일치함으로 'true'라는 결과가 출력된다.
		
		Pattern pp = Pattern.compile(regex2); 
		Matcher mm = pp.matcher(str); 
		System.out.println(mm.matches());
		
		Pattern ppp = Pattern.compile(regex3); 
		Matcher mmm = ppp.matcher(str); 
		System.out.println(mmm.matches());
		
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		//아이디 : [a-z0-9_-]{5,20}		//5~20자의 영문,소문자,숫자와 특수기호(_)(-)만 사용 가능
		//전화번호 : ^0\\d{1,3}-\\d{3,4}-\\d{4}
		//이메일주소 : [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?!){com|net|org|([a-z]{2}\\.kr))$
		String id = "11234_431sda_";
		String idtest = "\\w{5,20}|\\-|\\_";
		
		int hp = 0;
		String hptest = "[0-9]{9,11}";
		
		String email ="wwwsda@dasd.asd";
		String emailtest = "\\w*[@]\\w*[.]\\w*";
		
		Pattern idp = Pattern.compile(idtest);
		Matcher m1 = idp.matcher(id);
		System.out.println(m1.matches());
		
		Pattern hpp = Pattern.compile(hptest);
		
		Pattern emailp = Pattern.compile(emailtest);
		Matcher m3 = emailp.matcher(email);
		System.out.println(m3.matches());
		 
		
		
		
		
		}

}
