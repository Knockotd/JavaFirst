package interfacetest;

import java.io.Serializable;

//멤버서비스 인터페이스 임플리먼트 한 클래스 생성
//하나  인터페이스 임플리먼트 
public class MemberServiceImpl implements Memberservice, Serializable {

	@Override
	public boolean idCheck(String id) {
		
		boolean result = false;
		
		//id가 root가 아니라면 true
		if(id.equals("root") == false) {
			result = true;
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		//id가 root이고 password가 1234이면 로그인 성공 - 0
		//id가 root이고 password가 1234가 아니면 비밀번호가 틀림 - 1
		//id가 root가 아니면 없는 id - 2
		int result = 2;
		if(id.equals("root")) {
			if(password.equals("1234")) {
				result = 0;
			}else {
				result = 1;
			}
			}
		return result;
		}
		

	}


