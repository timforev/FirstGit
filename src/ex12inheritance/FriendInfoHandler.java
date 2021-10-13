package ex12;

import java.util.Scanner;


/*

 */
class FriendInfoHandler {


	private Friend[] myFriends;

	private int numOfFriends;
	
	//새로운 친구 입력
	public FriendInfoHandler(int num) {
		myFriends = new Friend(int num) {
			myFriends = new Friend[num];
			numOfFriends =0;
		}
		
		
		public void addFriend(int choice) {
			Scanner scan = new Scanner(System.in);
			
			String iName,iPhone,iAddr, iNickname,iMajor;
			
			System.out.println("이름"");iName = scan.nextLine();
			System.out.println("전화번호:");iPhone = scan.nextLine();
			System.out.println("주소");iAddr = scan.nextLine();
			
			/*
		
		
			 */
			if(choice==1) {
				System.out.println("별명:"); iNickname = scan.nextLine();
				HighFriend high =
							new HighFriend(iName, iPhone, iAddr, iNickname);
					myFriends[numOfFriends++] = high;
				}
				else if(choice==2) {
					System.out.println("전공:");iMajor = scan.nextLine();
					myFriends[numOfFriends++] =
							new UnivFriend(iName, iPhone,, iAddr, iMajor);
				}
				
				System.out.println("친구정보 입력이 완료되었습니다.");
			}//end of add Friend
			
			//
			public void showAllData() {
				for(int i=0 ; i<numOfFriends ; i++) {
					myFriends[i].showAllData();
				}
				System.out.println("==전체 정보가 출력되었습니다==");
			}
			
			//
			public void showSimpleData() {
				for(int i=0 ; i<numOfFriends ; i++) {
					myFriends[i].showBasicInfo();
				}
				
				System.out.println("==간략 정보가 출력되었습니다.==");
			}
			
		}
		
		
		public void searchInfo() {
			
			boolean isFind = false;//검색한 정보가 있는지 확인하기 위한 변수
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 이름을 입력하세요:");
			String searchName = scan.nextLine();

			//객체배열에 저장된 정보의 갯수만큼 반복
			for(int i=0 ; i<numOfFriends ; i++) {
				/*
				 검색을 위해 입력한 이름과 각 인덱스에 저장된 객체의 name변수의
				 비교를 통한 문자열 검색을 진행한다.
				 */
				if(searchName.compareTo(myFriends[i].name)==0) {
					//일치하는 이름이 있으면 정보를 출력한다.
					myFriends[i].showAllData();
					
					System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
					isFind = true; //찾는 정보가 있다면 true로 변경
				}
			}
		
			//주소록 항목 삭제
			public void deleteInfo() {
				Scanner scan = new Scanner(System.in);
				System.out.println("삭제할 이름을 입력하세요:");
				String deleteName = scan.nextLine();
				
				/*
				 배열의 요소 중 삭제된 요소의 인덱스 값을 저장할 용도의 변수.
				 요소를 삭제한 후 빈자리를 채워넣을 때 사용할 것임.
				 배열은 인덱스이므로 초기값은 -1로 설정한다. 
				 */
				int deleteIndex = -1;
				//저장된 데이터만큼 반복
				for(int i=0 ; i<numOfFriends ; i++) {
					//삭제할 이름이 있는지 검색
					if(deleteName.compareTo(myFriends[i].name)==0) {
						//객체를 삭제하기 위해 null값으로 변경한다.
						myFriends[i] = null;
						//삭제된 요소의 index를 저장한다.
						deleteIndex = i;
						//전체 카운트를 1 차감한다. 
						numOfFriends--;
						//하나의 객체를 삭제했다면 즉시 for문 탈출
					}
				}
				if(deleteIndex==-1) {
					//검색된 데이터가 없어 삭제되지 않았다면 -1을 유지한다.
					System.out.println("==삭제된 데이터가 없습니다==");
				}
				else {
					/*
					 객체배열에서 검색된 요소를 삭제한 후 입력된 위치의 바로 뒤
					 요소를 앞으로 하나씩 이동시킨다.
					 numOfFriends는 앞에서 1 차감되므로 마지막요소는 무시된다.
					 */
					for(int i=deleteIndex ; i<numOfFriends ; i++) {
						myFriends[i] = myFriends[i+1];
					}
					System.out.println("==데이터("+ deleteIndex +"번)가 삭제되었습니다==");
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
